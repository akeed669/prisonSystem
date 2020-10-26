
package FacadeRemoveInmates;
import AbstractTaskFactory.assignmentFactory;
import AbstractTaskFactory.assignmentFactoryProducer;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Date;
import ooae2test1.*;

public class releasePrisonerFacade {

    prisonInmate releaseMe;
    prisonGuard liberator;
    wardenMethods theRelease;
    assignmentFactory gFactory = assignmentFactoryProducer.getFactory(true);
    Date theDate;
    String releaseDate;

    public releasePrisonerFacade(String date_to_release) throws SQLException, 
            ParseException {

        releaseDate = date_to_release;
        releaseMe = new prisonInmate();
        liberator = new prisonGuard();
        theRelease = new wardenMethods();
    }

    public void releasePrisoner(String username, FormInmateManager fim) {
        releaseMe.removeInmateTasks(username);
        releaseMe.removeInmateNotes(username);
        releaseMe.removeInmatePunishments(username);
        releaseMe.removeInmate(username, fim);
        liberator.addNewGuardTask(gFactory.getAssignment("raul", 
                "Escort", "Escort Prisoner to Freedom", releaseDate));
        theRelease.prisonerReleased(username, releaseDate);
    }
}
