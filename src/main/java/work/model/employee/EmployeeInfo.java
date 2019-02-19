package work.model.employee;

import javax.persistence.*;

@Entity
@Table(name = "employee_info")
public class EmployeeInfo {
    @Id
    @Column(name = "id")
    @GeneratedValue
    private final int ID;
    @Column(name = "fc")
    private final String fc;

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
