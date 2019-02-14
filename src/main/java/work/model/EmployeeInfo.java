package work.model;

public class EmployeeInfo {

    private final String name;
    private final String surname;
    private final int ID;

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public EmployeeInfo(int ID, String name, String surname) {
        this.ID = ID;
        this.name = name;
        this.surname = surname;
    }
}
