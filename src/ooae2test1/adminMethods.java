package ooae2test1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class adminMethods {

    private Connection connection;

    public adminMethods() {
        connection = MyDatabase.getConnection();
    }

    public String authenticateUserLogin(String userType, String uname, String pass) throws SQLException {

        if (userType.equals("Guard")) {
            try {
                String sql = "select * from Guards where username=? and passphrase=?";

                PreparedStatement ps = connection.prepareStatement(sql);

                ps.setString(1, uname);
                ps.setString(2, pass);//https://stackoverflow.com/questions/32905126/how-can-i-compare-text-field-and-password-field-to-string-values
                ResultSet myRs = ps.executeQuery();

                if (myRs.next()) {

                    return "Guard";

                } else {
                    return "Invalid";
                }

            } catch (Exception e) {
            }
        }

        if (userType.equals("Warden")) {
            try {
                String sql = "select * from Warden where username=? and passphrase=?";

                PreparedStatement ps = connection.prepareStatement(sql);

                ps.setString(1, uname);
                ps.setString(2, pass);
                ResultSet myRs = ps.executeQuery();

                if (myRs.next()) {
                    return "Warden";

                } else {
                    return "Invalid"; //you can customize the error message
                }

            } catch (Exception e) {
            }
        }

        return "Invalid";
    }

    public void populateTable() {

        DefaultTableModel tableModel = new DefaultTableModel();
        JTable jtable = new JTable();

        try {

            PreparedStatement ps = connection.prepareStatement("select messageDescription from notifyGuards");

            ResultSet myRs = ps.executeQuery();

            ResultSetMetaData metaData = myRs.getMetaData();

            int columnCount = metaData.getColumnCount();

            for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                tableModel.addColumn(metaData.getColumnLabel(columnIndex));

            }

            Object[] row = new Object[columnCount];

            while (myRs.next()) {

                for (int i = 0; i < columnCount; i++) {
                    row[i] = myRs.getObject(i + 1);
                }
//                

            }

            jtable.setModel(tableModel);

        } catch (Exception e) {
        }

    }

}
