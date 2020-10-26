package notesAboutInmates;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import ooae2test1.popupMessage;
import ooae2test1.prisonGuard;

public class proxyNote implements Note {

    private Note theNote = new RealNote();

    prisonGuard pG = new prisonGuard();

    public proxyNote() {
    }
    @Override
    public void makeNote(String noteToEnter, String unameInmate, String guardName) {

        try {
            String sql1 = "select prisonarea from guards where username=?";
            String sql2 = "select cellblock from inmates where username=?";

            String inmateCB = pG.compareCellBlocks(unameInmate, sql2, "cellblock");
            String guardCB = pG.compareCellBlocks(guardName, sql1, "prisonarea");

            if (inmateCB.equals(guardCB)) {

                theNote.makeNote(noteToEnter, unameInmate, guardName);
                popupMessage.infoBox("A new note has been successfully added to the system", "Information");

            } else {
                popupMessage.infoBox("You are not authorized to make a note about this inmate!", "Error");
            }

        } catch (SQLException ex) {
            Logger.getLogger(proxyNote.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
