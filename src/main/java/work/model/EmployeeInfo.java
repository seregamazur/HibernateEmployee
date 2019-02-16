package work.model;

public class EmployeeInfo {

    private final String fc;
    private final int ID;

    public EmployeeInfo(int ID, String fc) {
        this.ID = ID;
        this.fc = fc;
    }

    public int getID() {
        return ID;
    }

    public String getFc() {
        return fc;
    }

}
