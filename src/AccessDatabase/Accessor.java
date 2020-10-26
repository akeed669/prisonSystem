/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccessDatabase;

public class Accessor {

    public Accessor() {

    }

    public void grantAccess(DatabaseAccess access, String uname, String pword) {

        access.attemptToAccess(uname, pword);
    }
}
