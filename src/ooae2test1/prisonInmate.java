package ooae2test1;

import AbstractTaskFactory.Assignment;
import inmatePunishments.isolatePrisoner;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class prisonInmate {

    private Connection connection;
    private int inmateID;
    private String firstName;
    private String lastName;
    private String iGender;
    private String cellBlock;
    private String iStatus;
    private String username;
    private String passphrase;

    public prisonInmate() {
        connection = MyDatabase.getConnection();
    }

    public prisonInmate(String firstName, String lastName, String iGender,
            String cellBlock, String iStatus,
            String username, String passphrase) throws SQLException {

        connection = MyDatabase.getConnection();
        this.firstName = firstName;
        this.lastName = lastName;
        this.iGender = iGender;
        this.cellBlock = cellBlock;
        this.iStatus = iStatus;
        this.username = username;
        this.passphrase = passphrase;
    }

    public prisonInmate(String firstName, String lastName, String iGender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.iGender = iGender;
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

    public int getInmateID() {
        return inmateID;
    }

    public void setInmateID(int inmateID) {
        this.inmateID = inmateID;
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

    public String getiGender() {
        return iGender;
    }

    public void setiGender(String iGender) {
        this.iGender = iGender;
    }

    public String getCellBlock() {
        return cellBlock;
    }

    public void setCellBlock(String cellBlock) {
        this.cellBlock = cellBlock;
    }

    public String getiStatus() {
        return iStatus;
    }

    public void setiStatus(String iStatus) {
        this.iStatus = iStatus;
    }

//    public void assignDuty() {
//        assignedDuty.performDuty();
//    }
//    @Override
//    public void updateObservers(String theDate, int count) {
////        this.addNewInmateJob(new InmateAssignment("message", "report to lobby", theDate, username));
//
//        try {
////            String theMessage = "Attention all Inmates, please be informed that a prisonwide check is scheduled for today.";
//            String sql = "insert into notifyinmates(messageDescription,searchDate)" + " values(?,?);";
//            PreparedStatement ps = connection.prepareStatement(sql);
//            ps.setString(1, "Observer # " + Integer.toString(count) + " ,prepare to be searched");
//            ps.setString(2, theDate);
//            ps.executeUpdate();
//
//        } catch (Exception e) {
//            System.out.println(e.toString());
//        }
//    }
    public boolean addNewInmate(prisonInmate newInmate) {
        try {
            String sql = "insert into Inmates(fName,lName,inmateGender,"
                    + "cellBlock,inmateStatus,username,passphrase)"
                    + " values(?,?,?,?,?,?,?);";

            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, newInmate.getFirstName());
            ps.setString(2, newInmate.getLastName());
            ps.setString(3, newInmate.getiGender());
            ps.setString(4, newInmate.getCellBlock());
            ps.setString(5, newInmate.getiStatus());
            ps.setString(6, newInmate.getUsername());
            ps.setString(7, newInmate.getPassphrase());
            ps.executeUpdate();

            return true;

        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return false;
    }

    public ArrayList<InmateAssignment> inmatesTaskList() throws SQLException {
        ArrayList<InmateAssignment> ITaskList = new ArrayList<InmateAssignment>();
        String sql = "select * from inmatejob";
        Statement st;
        ResultSet rs;

        try {
            st = connection.createStatement();
            rs = st.executeQuery(sql);
            InmateAssignment IAssignment;

            while (rs.next()) {
                IAssignment = new InmateAssignment(rs.getString("jobCategory"), rs.getString("jobDescription"), rs.getString("assignmentDate"), rs.getString("username"));
                ITaskList.add(IAssignment);
            }

        } catch (Exception e) {
        }

        return ITaskList;
    }

    public ArrayList<inmatePunishments.InmatePunishmentK> inmatesPunishmentList() throws SQLException {
        ArrayList<inmatePunishments.InmatePunishmentK> IPunishmentList = new ArrayList<inmatePunishments.InmatePunishmentK>();
        String sql = "select * from inmatepunishment2";
        Statement st;
        ResultSet rs;

        try {
            st = connection.createStatement();
            rs = st.executeQuery(sql);
            inmatePunishments.InmatePunishmentK IPunishment;

            while (rs.next()) {
                IPunishment = new isolatePrisoner(rs.getString("username"), rs.getString("punishmentType"), rs.getString("punishmentDate"), rs.getString("punishmentSeverity"));
                IPunishmentList.add(IPunishment);
            }

        } catch (Exception e) {
        }

        return IPunishmentList;
    }

    public boolean addNewInmateAssignment(Assignment assignment) {
        try {
            String sql = "insert into inmatejob(username,jobCategory,jobDescription,assignmentDate)"
                    + " values(?,?,?,?);";
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

    public boolean addNewInmatePunishment(inmatePunishments.InmatePunishmentK punishment) {
        try {
            String sql = "insert into inmatepunishment2(username,punishmentType,punishmentDate,punishmentSeverity)" + " values(?,?,?,?);";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, punishment.getUsername());
            ps.setString(2, punishment.getPunishmentType());
            ps.setString(3, punishment.getDateForDB());
            ps.setString(4, punishment.getSeverity());

            ps.executeUpdate();

            return true;

        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return false;
    }

    public ArrayList<InmateAssignment> individualInmateTaskList(String username) throws SQLException {
        ArrayList<InmateAssignment> iTaskList = new ArrayList<InmateAssignment>();
        String sql = "select * from inmatejob where username=?";
        PreparedStatement ps;
        ResultSet rs;

        try {

            ps = connection.prepareStatement(sql);
            ps.setString(1, username);
            rs = ps.executeQuery();
            InmateAssignment iAssignment;

            while (rs.next()) {
                iAssignment = new InmateAssignment(rs.getString("jobCategory"), rs.getString("jobDescription"), rs.getString("assignmentDate"));
                iTaskList.add(iAssignment);
            }

        } catch (Exception e) {
        }

        return iTaskList;
    }

    public ArrayList<prisonInmate> inmateList() throws SQLException {
        ArrayList<prisonInmate> inmateList = new ArrayList<prisonInmate>();
        String sql = "select * from inmates";
        Statement st;
        ResultSet rs;

        try {
            st = connection.createStatement();
            rs = st.executeQuery(sql);
            prisonInmate pInmate;

            while (rs.next()) {
                pInmate = new prisonInmate(rs.getString("fName"), rs.getString("lName"),
                        rs.getString("inmateGender"), rs.getString("cellBlock"),
                        rs.getString("inmateStatus"), rs.getString("username"), rs.getString("passphrase"));
                inmateList.add(pInmate);
            }

        } catch (Exception e) {
        }

        return inmateList;
    }

    public void populateInmatesTable(FormInmateManager fim) throws SQLException {

        ArrayList<prisonInmate> inmateList = this.inmateList();
        DefaultTableModel tableModel = (DefaultTableModel) fim.inmateTable.getModel();
        //remove the contents of the table and leave the column headers        
        for (int i = tableModel.getRowCount() - 1; i >= 0; i--) {
            tableModel.removeRow(i);
        }
        //https://stackoverflow.com/questions/3879610/how-to-clear-contents-of-a-jtable
        try {

            Object[] row = new Object[7];

            for (prisonInmate inmateList1 : inmateList) {
                row[0] = inmateList1.getFirstName();
                row[1] = inmateList1.getLastName();
                row[2] = inmateList1.getiGender();
                row[3] = inmateList1.getCellBlock();
                row[4] = inmateList1.getiStatus();
                row[5] = inmateList1.getUsername();
                row[6] = inmateList1.getPassphrase();
                tableModel.addRow(row);
            }

        } catch (Exception e) {
        }

    }

    public void removeInmate(String username, FormInmateManager fim) {
        String query = "DELETE FROM inmates where username ='" + username + "'";
        Statement st;
        try {
            st = connection.createStatement();
            if ((st.executeUpdate(query)) == 1) {

                DefaultTableModel model = (DefaultTableModel) fim.inmateTable.getModel();
                model.setRowCount(0);
                this.populateInmatesTable(fim);

                JOptionPane.showMessageDialog(null, "Inmate " + username + 
                        " has been removed successfully");
            } else {
                JOptionPane.showMessageDialog(null, "Failed to remove inmate from the system");
            }
        } catch (SQLException | HeadlessException ex) {
        }
    }

    public void removeInmate(String username) {
        String query = "DELETE FROM inmates where username ='" + username + "'";
        Statement st;
        try {
            st = connection.createStatement();
            if ((st.executeUpdate(query)) == 1) {

                JOptionPane.showMessageDialog(null, "Inmate " + username + " has been removed successfully");
            } else {
                JOptionPane.showMessageDialog(null, "Failed to remove inmate from the system");
            }
        } catch (SQLException | HeadlessException ex) {
        }
    }

    public void removeInmateTasks(String username) {
        String query = "DELETE FROM inmatejob where username ='" + username + "'";
        Statement st;
        try {
            st = connection.createStatement();
            if ((st.executeUpdate(query)) >= 1) {

                JOptionPane.showMessageDialog(null, "All the tasks assigned to inmate " 
                        + username + " have been removed");
            } else {
                JOptionPane.showMessageDialog(null, "No pending tasks assigned to inmate "
                        + username);
            }
        } catch (SQLException | HeadlessException ex) {
        }
    }

    public void removeInmatePunishments(String username) {
        String query = "DELETE FROM inmatepunishment2 where username ='" + username + "'";
        Statement st;
        try {
            st = connection.createStatement();
            if ((st.executeUpdate(query)) >= 1) {

                JOptionPane.showMessageDialog(null, "All the punishments assigned to inmate " 
                        + username + " have been removed");
            } else {
                JOptionPane.showMessageDialog(null, "No punishments assigned to inmate " + username);
            }
        } catch (SQLException | HeadlessException ex) {
        }
    }

    public void removeInmateNotes(String username) {
        String query = "DELETE FROM inmatenotes1 where username ='" + username + "'";
        Statement st;
        try {
            st = connection.createStatement();
            if ((st.executeUpdate(query)) >= 1) {

                JOptionPane.showMessageDialog(null, "All the notes regarding inmate " + username +
                        " have been removed");
            } else {
                JOptionPane.showMessageDialog(null, "There were no notes to remove regarding " + username);
            }
        } catch (SQLException | HeadlessException ex) {
        }
    }

    public void executeSQlQuery(String query, String message, FormInmateManager fim) {
        Statement st;
        try {
            st = connection.createStatement();
            if ((st.executeUpdate(query)) == 1) {

                DefaultTableModel model = (DefaultTableModel) fim.inmateTable.getModel();
                model.setRowCount(0);
                this.populateInmatesTable(fim);

                JOptionPane.showMessageDialog(null, "Data " + message + " Successfully");
            } else {
                JOptionPane.showMessageDialog(null, "Data Not " + message);
            }
        } catch (SQLException | HeadlessException ex) {
        }
    }

    public void executeSQlQuery(String query, String message, FormInmateTask fit) {
        Statement st;
        try {
            st = connection.createStatement();
            if ((st.executeUpdate(query)) == 1) {

                DefaultTableModel model = (DefaultTableModel) fit.inmatesTaskTable.getModel();
                model.setRowCount(0);
                this.populateInmatesTasksTable(fit);

                JOptionPane.showMessageDialog(null, "Data " + message + " Successfully");
            } else {
                JOptionPane.showMessageDialog(null, "Data Not " + message);
            }
        } catch (SQLException | HeadlessException ex) {
        }
    }

    public void populateInmatesTasksTable(FormInmateTask fit) throws SQLException {

        ArrayList<InmateAssignment> ITaskList = this.inmatesTaskList();
        DefaultTableModel tableModel = (DefaultTableModel) fit.inmatesTaskTable.getModel();

        //remove the contents of the table and leave the column headers        
        for (int i = tableModel.getRowCount() - 1; i >= 0; i--) {
            tableModel.removeRow(i);
        }
        //https://stackoverflow.com/questions/3879610/how-to-clear-contents-of-a-jtable

        try {

            Object[] row = new Object[4];

            for (InmateAssignment ITaskList1 : ITaskList) {
                row[0] = ITaskList1.getJobCategory();
                row[1] = ITaskList1.getJobDescription();
                row[2] = ITaskList1.getDateForDB();
                row[3] = ITaskList1.getUsername();
                tableModel.addRow(row);
            }

        } catch (Exception e) {
        }

    }

    public void populateInmatesPunishmentsTable(FormInmatePunishment fit) throws SQLException {

        ArrayList<inmatePunishments.InmatePunishmentK> IPunishmentList = this.inmatesPunishmentList();
        DefaultTableModel tableModel = (DefaultTableModel) fit.inmatesPunishmentTable.getModel();

        //remove the contents of the table and leave the column headers        
        for (int i = tableModel.getRowCount() - 1; i >= 0; i--) {
            tableModel.removeRow(i);
        }
        //https://stackoverflow.com/questions/3879610/how-to-clear-contents-of-a-jtable

        try {

            Object[] row = new Object[4];

            for (inmatePunishments.InmatePunishmentK IPunishmentList1 : IPunishmentList) {
                row[0] = IPunishmentList1.getUsername();
                row[1] = IPunishmentList1.getPunishmentType();
                row[2] = IPunishmentList1.getDateForDB();
                row[3] = IPunishmentList1.getSeverity();

                tableModel.addRow(row);
            }

        } catch (Exception e) {
        }

    }

}
