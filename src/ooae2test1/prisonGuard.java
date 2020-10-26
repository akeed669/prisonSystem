package ooae2test1;

import AbstractTaskFactory.Assignment;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class prisonGuard implements NotificationObserver {

    private Connection connection;
//    wardenMethods wmstar;

    private int guardID;
    private String firstName;
    private String lastName;
    private String deploymentArea;
    private String username;
    private String passphrase;
    private String selectedWeapon;

    public prisonGuard() {
        connection = MyDatabase.getConnection();
    }

    public prisonGuard(String firstName, String lastName, String deploymentArea, String username, String passphrase, String selectedWeapon) {
        connection = MyDatabase.getConnection();
        this.firstName = firstName;
        this.lastName = lastName;
        this.deploymentArea = deploymentArea;
        this.username = username;
        this.passphrase = passphrase;
        this.selectedWeapon = selectedWeapon;
    }

    public prisonGuard(String firstName, String lastName, String deploymentArea, String username) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.deploymentArea = deploymentArea;
        this.username = username;
    }

    public String getSelectedWeapon() {
        return selectedWeapon;
    }

    public void setSelectedWeapon(String selectedWeapon) {
        this.selectedWeapon = selectedWeapon;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDeploymentArea() {
        return deploymentArea;
    }

    public void setDeploymentArea(String deploymentArea) {
        this.deploymentArea = deploymentArea;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassphrase() {
        return passphrase;
    }

    public void setPassphrase(String passphrase) {
        this.passphrase = passphrase;
    }

    @Override
    public void updateObservers(String theDate, int count) {
        try {
//            String theMessage = "Attention all Guards, please be informed that a prisonwide check is scheduled for today. Report to my office for firther information";
            String sql = "insert into notifyguards(messageDescription,searchDate)" + " values(?,?);";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, "Guard # " + Integer.toString(count) + " ,prepare to search prison");
            ps.setString(2, theDate);

            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public boolean addNewGuard(prisonGuard newGuard) {
        try {
            String sql = "insert into Guards(fName,lName,prisonArea,username,passphrase,Weapon)" + " values(?,?,?,?,?,?);";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, newGuard.getFirstName());
            ps.setString(2, newGuard.getLastName());
            ps.setString(3, newGuard.getDeploymentArea());
            ps.setString(4, newGuard.getUsername());
            ps.setString(5, newGuard.getPassphrase());
            ps.setString(6, newGuard.getSelectedWeapon());
            ps.executeUpdate();
//            this.wmstar = wardenActs;
//            wmstar.registerNotificationObserver(newGuard);//adding the guard as an observer to receive notifications
            return true;

        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return false;
    }

    public boolean addNewNote(String note, String un, String guardName) {
        try {
            String sql = "insert into inmateNotes1(noteDescription,username,guardName )" + " values(?,?,?);";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, note);
            ps.setString(2, un);
            ps.setString(3, guardName);

            ps.executeUpdate();

            return true;

        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return false;
    }

    public ArrayList<prisonGuard> guardList() throws SQLException {
        ArrayList<prisonGuard> guardsList = new ArrayList<prisonGuard>();
        String sql = "select * from guards";
        Statement st;
        ResultSet rs;

        try {
            st = connection.createStatement();
            rs = st.executeQuery(sql);
            prisonGuard pGuard;

            while (rs.next()) {
                pGuard = new prisonGuard(rs.getString("fName"), rs.getString("lName"), rs.getString("prisonArea"), rs.getString("username"));
                guardsList.add(pGuard);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return guardsList;
    }

    public String compareCellBlocks(String personUN, String sql,String dbWord) throws SQLException {

        PreparedStatement ps;
        ResultSet rs;

        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, personUN);
            rs = ps.executeQuery();

            while (rs.next()) {
                String toPass = rs.getString(dbWord);
                return toPass;
            }

        } catch (Exception e) {
        }

        return null;
    }

    public ArrayList<GuardAssignment> guardsTaskList() throws SQLException {
        ArrayList<GuardAssignment> GTaskList = new ArrayList<GuardAssignment>();
        String sql = "select * from guardassignment";
        Statement st;
        ResultSet rs;

        try {
            st = connection.createStatement();
            rs = st.executeQuery(sql);
            GuardAssignment gAssignment;

            while (rs.next()) {
                gAssignment = new GuardAssignment(rs.getString("username"), rs.getString("assignmentType"), rs.getString("assignmentDescription"), rs.getString("assignmentDate"));
                GTaskList.add(gAssignment);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return GTaskList;
    }    
    

    public ArrayList<GuardAssignment> individualGuardTaskList(String username) throws SQLException {
        ArrayList<GuardAssignment> GTaskList = new ArrayList<GuardAssignment>();
        String sql = "select * from guardassignment where username=?";
        PreparedStatement ps;
        ResultSet rs;

        try {

            ps = connection.prepareStatement(sql);
            ps.setString(1, username);
            rs = ps.executeQuery();
            GuardAssignment gAssignment;

            while (rs.next()) {
                gAssignment = new GuardAssignment(rs.getString("assignmentType"), rs.getString("assignmentDescription"), rs.getString("assignmentDate"));
                GTaskList.add(gAssignment);
            }

        } catch (Exception e) {
        }

        return GTaskList;
    }
    
    public ArrayList<GuardMessage> individualGuardMessageList(String username) throws SQLException {
        ArrayList<GuardMessage> GMessageList = new ArrayList<GuardMessage>();
        String sql = "select * from guardmessage where username=?";
        PreparedStatement ps;
        ResultSet rs;

        try {

            ps = connection.prepareStatement(sql);
            ps.setString(1, username);
            rs = ps.executeQuery();
            GuardMessage gMessage;

            while (rs.next()) {
                gMessage = new GuardMessage(rs.getString("assignmentType"), rs.getString("messageDescription"), rs.getString("searchDate"));
                GMessageList.add(gMessage);
            }

        } catch (Exception e) {
        }

        return GMessageList;
    }

    public boolean addNewGuardTask(Assignment assignment) {
        try {
            String sql = "insert into guardassignment(username,assignmentType,assignmentDescription,assignmentDate)" + " values(?,?,?,?);";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, assignment.getUsername());
            ps.setString(2, assignment.getTaskType());
            ps.setString(3, assignment.getDescription());
            ps.setString(4, assignment.getDateForDB());

            ps.executeUpdate();

            return true;

        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return false;
    }

    public void populateGuardsTable(FormGuardManager fgm) throws SQLException {

        ArrayList<prisonGuard> gList = this.guardList();
        DefaultTableModel tableModel = (DefaultTableModel) fgm.jTable1.getModel();

        //remove the contents of the table and leave the column headers        
        for (int i = tableModel.getRowCount() - 1; i >= 0; i--) {
            tableModel.removeRow(i);
        }
        //https://stackoverflow.com/questions/3879610/how-to-clear-contents-of-a-jtable

        try {

            Object[] row = new Object[4];

            for (int i = 0; i < gList.size(); i++) {
                row[0] = gList.get(i).getFirstName();
                row[1] = gList.get(i).getLastName();
                row[2] = gList.get(i).getDeploymentArea();
                row[3] = gList.get(i).getUsername();
                tableModel.addRow(row);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void executeSQlQuery(String query, String message, FormGuardManager fgm) {
        Statement st;
        try {
            st = connection.createStatement();
            if ((st.executeUpdate(query)) == 1) {

                DefaultTableModel model = (DefaultTableModel) fgm.jTable1.getModel();
                model.setRowCount(0);
                this.populateGuardsTable(fgm);

                JOptionPane.showMessageDialog(null, "Data " + message + " Successfully");
            } else {
                JOptionPane.showMessageDialog(null, "Data Not " + message);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void executeSQlQuery(String query, String message, FormGuardTask fgt) {
        Statement st;
        try {
            st = connection.createStatement();
            if ((st.executeUpdate(query)) == 1) {

                DefaultTableModel model = (DefaultTableModel) fgt.guardsTaskTable.getModel();
                model.setRowCount(0);
                this.populateGuardsTasksTable(fgt);

                JOptionPane.showMessageDialog(null, "Data " + message + " Successfully");
            } else {
                JOptionPane.showMessageDialog(null, "Data Not " + message);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void populateGuardsTasksTable(FormGuardTask fgt) throws SQLException {

        ArrayList<GuardAssignment> GTaskList = this.guardsTaskList();
        DefaultTableModel tableModel = (DefaultTableModel) fgt.guardsTaskTable.getModel();

        //remove the contents of the table and leave the column headers        
        for (int i = tableModel.getRowCount() - 1; i >= 0; i--) {
            tableModel.removeRow(i);
        }
        //https://stackoverflow.com/questions/3879610/how-to-clear-contents-of-a-jtable

        try {

            Object[] row = new Object[4];

            for (int i = 0; i < GTaskList.size(); i++) {
                row[0] = GTaskList.get(i).getUsername();
                row[1] = GTaskList.get(i).getTaskType();
                row[2] = GTaskList.get(i).getDescription();
                row[3] = GTaskList.get(i).getDateForDB();
                tableModel.addRow(row);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void displayNotifications() {

    }

}
