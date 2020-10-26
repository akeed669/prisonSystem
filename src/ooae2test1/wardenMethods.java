package ooae2test1;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class wardenMethods implements WardenAsSubject {

    private Connection connection;

    FormGuardManager aG;

    private List<NotificationObserver> observers;
    private String dateForShakeup;

    public String getDateForShakeup() {
        return dateForShakeup;
    }

    public wardenMethods() throws SQLException {
//        this.aG = new FormGuardManager();
        connection = MyDatabase.getConnection();
        this.observers = new ArrayList();

    }

    @Override
    public void registerNotificationObserver(NotificationObserver g) {
        this.observers.add(g);
    }

    @Override
    public void removeNotificationObserver(NotificationObserver g) {
        int index = observers.indexOf(g);
        if (index >= 0) {
            this.observers.remove(index);
        }
    }


    @Override

    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            NotificationObserver observer = (NotificationObserver) observers.get(i);
            observer.updateObservers(this.dateForShakeup, i);            
        }
    }



    public void measurementsChanged() {
        notifyObservers();
    }

    public void setShakeupDate(String newShakeupDate) {
        this.dateForShakeup = newShakeupDate;
        this.measurementsChanged();
    }

    public void prisonerHanged(String username, String killingDate) {
//        System.out.println("Prisoner is dead!");
        popupMessage.infoBox("The prisoner with the username " + "\"" + username + "\"" + " will be hanged to death on " + killingDate, "Information");
    }

    public void prisonerReleased(String username, String killingDate) {
        popupMessage.infoBox("The prisoner with the username " +
                "\"" + username + "\"" + " will be released on " +
                killingDate, "Information");
    }


}
