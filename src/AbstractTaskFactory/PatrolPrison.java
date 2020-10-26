

package AbstractTaskFactory;


public class PatrolPrison extends Assignment {

    public PatrolPrison(String username, String assignmentCategory, String assignmentDescription, String dateForDB) {
        super(username, assignmentCategory, assignmentDescription, dateForDB);
    }

    public PatrolPrison(String assignmentCategory, String assignmentDescription, String dateForDB) {
        super(assignmentCategory, assignmentDescription, dateForDB);
    }    

    
    

}
