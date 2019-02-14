package work.model;

import java.time.LocalDate;

public class EmployeeInfo {

    private final String fc;
    private final int ID;
    private LocalDate recruitment;
    private LocalDate dissmisal;

    public EmployeeInfo(int ID, String fc, LocalDate recruitment) {
        this.ID = ID;
        this.fc = fc;
        this.recruitment = recruitment;
    }

    public LocalDate getRecruitment() {
        return recruitment;
    }

    public LocalDate getDissmisal() {
        return dissmisal;
    }

    public void setRecruitment(LocalDate recruitment) {
        this.recruitment = recruitment;
    }

    public void setDissmisal(LocalDate dissmisal) {
        this.dissmisal = dissmisal;
    }

    public int getID() {
        return ID;
    }

    public String getFc() {
        return fc;
    }

}
