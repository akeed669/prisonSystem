/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccessDatabase;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LogGuard implements DatabaseAccess {

    private AccessRight access;

    public LogGuard(AccessRight access) {
        this.access = access;
    }

    @Override
    public void attemptToAccess(String uname, String pword) {
        try {
            access.guardLogin(uname, pword);
        } catch (SQLException ex) {
            Logger.getLogger(LogGuard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
