package work.model.salary;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "salary_type")
public abstract class Salary {

    private final int ID;
    private final String name;
    private final float tax;

    public Salary(int ID, String name, float tax) {
        this.ID = ID;
        this.name = name;
        this.tax = tax;
    }

    public abstract float getSalary();

    public abstract void setSalary(float salary);

    public abstract Salary getSalaryType();

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public float getTax() {
        return tax;
    }


}
