package AbstractTaskFactory;

public class KitchenWork extends Assignment {

    public KitchenWork(String username, String assignmentCategory, String assignmentDescription, String dateForDB) {
        super(username, assignmentCategory, assignmentDescription, dateForDB);
    }

    public KitchenWork(String assignmentCategory, String assignmentDescription, String dateForDB) {
        super(assignmentCategory, assignmentDescription, dateForDB);
    }

}
