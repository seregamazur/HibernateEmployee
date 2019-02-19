package work.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee_info")
public class EmployeeInfo {
    @Id
    @Column(name = "id")
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
