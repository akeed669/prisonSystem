
package RemovalStrategy;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import ooae2test1.FormInmateManager;
import FacadeRemoveInmates.hangPrisonerFacade;

public class HangPrisoner implements RemovePrisoner {

    @Override
    public void expel(String uN, String date, FormInmateManager fim) {
        try {
            hangPrisonerFacade hangProcess = new hangPrisonerFacade(date);
            hangProcess.hangPrisoner(uN,fim);
        } catch (SQLException | ParseException ex) {
            Logger.getLogger(HangPrisoner.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
