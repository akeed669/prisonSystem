
package notesAboutInmates;
import java.sql.Connection;
import java.sql.PreparedStatement;
import ooae2test1.MyDatabase;

public class RealNote implements Note {

    private Connection connection;

    public RealNote() {
        this.connection = MyDatabase.getConnection();
    }

    @Override
    public void makeNote(String note, String un, String guardName) {
        try {
            String sql = "insert into inmateNotes1(noteDescription,username,guardName )" 
                    + " values(?,?,?);";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, note);
            ps.setString(2, un);
            ps.setString(3, guardName);

            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
