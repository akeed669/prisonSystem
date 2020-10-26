package AbstractTaskFactory;

public class LaundryWork extends Assignment {

    public LaundryWork(String username, String assignmentCategory, 
            String assignmentDescription, String dateForDB) {
        
        super(username, assignmentCategory, assignmentDescription,
                dateForDB);
    }

    public LaundryWork(String assignmentCategory, 
            String assignmentDescription, String dateForDB) {
        super(assignmentCategory, assignmentDescription, dateForDB);
    }

}
