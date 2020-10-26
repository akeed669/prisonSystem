/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AbstractTaskFactory;

public abstract class assignmentFactory {
    public abstract Assignment getAssignment(String username,
            String assignmentType,String desc, String dateOf);
}
