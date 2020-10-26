package AbstractTaskFactory;

public abstract class Assignment {

    int assignmentID;
    String username;
    String taskType;
    String description;
    String dateForDB;     
    

    public Assignment(String username, String taskType, String description, String dateForDB) {
        
        this.username = username;
        this.taskType = taskType;
        this.description = description;
        this.dateForDB = dateForDB;
    }

    public Assignment(String taskType, String description, String dateForDB) {
        this.taskType = taskType;
        this.description = description;
        this.dateForDB = dateForDB;
    }   
    

    public int getAssignmentID() {
        return assignmentID;
    }

    public void setAssignmentID(int assignmentID) {
        this.assignmentID = assignmentID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }        

    public String getDateForDB() {
        return dateForDB;
    }

    public void setDateForDB(String dateForDB) {
        this.dateForDB = dateForDB;
    }

}
