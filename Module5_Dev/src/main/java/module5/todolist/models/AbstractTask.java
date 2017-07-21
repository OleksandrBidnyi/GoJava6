package module5.todolist.models;

/**
 * Abstract Pet
 */
public class AbstractTask {
    String nameOfTask;
    String abilityOfTask;
    String taskStatus;
    String descriptionOfTask;

    public AbstractTask(final String nameOfTask, final String abilityOfTask, final String taskStatus, final String descriptionOfTask) {
        this.nameOfTask = nameOfTask;
        this.abilityOfTask = abilityOfTask;
        this.taskStatus = taskStatus;
        this.descriptionOfTask = descriptionOfTask;
    }


    public AbstractTask(String nameOfTask) {
        this.nameOfTask=nameOfTask;
    }

    public String getNameOfTask() {
        return this.nameOfTask;
    }

    public String getAbilityOfTask() {
        return abilityOfTask;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public String getDescriptionOfTask() {
        return descriptionOfTask;
    }
}
