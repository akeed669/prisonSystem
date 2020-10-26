
package inmatePunishments;

import ooae2test1.popupMessage;

public class starvePrisoner extends InmatePunishmentK {

    public starvePrisoner(String username, String punishmentType, String dateForDB, String severity) {
        super(username, punishmentType, dateForDB, severity);
    }

    @Override
    public void assignPunishment(String uName, String dateForPunishment, String severity) {
        String days;
        switch (severity) {
            case "Soft":
                days = "1";
                break;

            case "Medium":
                days = "3";
                break;

            case "Hard":
                days = "5";
                break;

            default:
                days = "0";
        }
        popupMessage.infoBox("The prisoner with the username " + "\"" + uName + "\""
                + " will be punished by starvation for " + days
                + " days starting from " + dateForPunishment, "Information");
    }
}
