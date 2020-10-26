
package AbstractTaskFactory;

public class EscortInmate extends Assignment {

    public EscortInmate(String username, String assignmentCategory, String assignmentDescription, String dateForDB) {
        super(username, assignmentCategory, assignmentDescription, dateForDB);
    }

    public EscortInmate(String assignmentCategory, String assignmentDescription, String dateForDB) {
        super(assignmentCategory, assignmentDescription, dateForDB);
    }        

    
    
    
}
