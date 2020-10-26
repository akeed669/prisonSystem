/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractTaskFactory;

public class inmateAssignmentFactory extends assignmentFactory {

    @Override
    public Assignment getAssignment(String username,String assignmentType,
            String desc, String dateOf) {
        
        if (assignmentType.equalsIgnoreCase("Laundry")) {
            return new LaundryWork(username, assignmentType, desc, dateOf);
        } else if (assignmentType.equalsIgnoreCase("Kitchen")) {
            return new KitchenWork(username, assignmentType, desc, dateOf);
        }
        return null;
    }

}
