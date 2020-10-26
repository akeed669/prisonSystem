package AccessDatabase;

import java.sql.SQLException;
import ooae2test1.adminMethods;
import ooae2test1.guardHome;
import ooae2test1.loginForm;
import ooae2test1.popupMessage;
import ooae2test1.wardenHome;

public class AccessRight {

    adminMethods aM = new adminMethods();

    public void wardenLogin(String un, String pp) throws SQLException {

        String success = aM.authenticateUserLogin("Warden", un, pp);
        if (success.equals("Warden")) {
            wardenHome wH = new wardenHome(un);
            wH.setVisible(true);
        } else if (success.equals("Invalid")) {
            loginFailed();
        }
    }

    public void guardLogin(String un, String pp) throws SQLException {

        String success = aM.authenticateUserLogin("Guard", un, pp);
        if (success.equals("Guard")) {
            guardHome gH = new guardHome(un);
            gH.setVisible(true);
        } else if (success.equals("Invalid")) {
            loginFailed();
        }

    }

    public void loginFailed() {
        popupMessage.infoBox("Username or password is invalid, please try again", "Login failed!");
        new loginForm().setVisible(true);
    }

}
