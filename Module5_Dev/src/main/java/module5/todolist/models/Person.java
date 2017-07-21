package module5.todolist.models;

/**
 * person
 */
public class Person {
    private String nameOfPerson;
    private AbstractTask taskOfPerson;
    private int id;

    public Person(final int id, final String nameOfPerson, final AbstractTask taskOfPerson) {
        this.nameOfPerson = nameOfPerson;
        this.taskOfPerson = taskOfPerson;
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public AbstractTask getTaskOfPerson() {
        return this.taskOfPerson;
    }

    public String getNameOfPerson() {
        return this.nameOfPerson;
    }

    public String getNameOfTask() {
        return this.taskOfPerson.getNameOfTask();
    }

    public String getTypeOfTask() {
        return this.taskOfPerson.getClass().getSimpleName();
    }

    public String getAbilityOfTask() {
        return this.taskOfPerson.getAbilityOfTask();
    }

}
