

package AbstractTaskFactory;


public class guardAssignmentFactory extends assignmentFactory {

    @Override
    public Assignment getAssignment(String username,String assignmentType,String desc, String dateOf) {
        if (assignmentType.equalsIgnoreCase("Patrol")) {
            return new PatrolPrison(username, assignmentType, desc, dateOf);
        } else if (assignmentType.equalsIgnoreCase("Escort Inmate")) {
            return new EscortInmate(username, assignmentType, desc, dateOf);
        }
        return null;
    }

}
