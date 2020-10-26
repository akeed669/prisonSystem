/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ooae2test1;


public interface WardenAsSubject {
    
    public void registerNotificationObserver(NotificationObserver g);
    public void removeNotificationObserver(NotificationObserver g);
    public void notifyObservers();
    

}
