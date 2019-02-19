package work.model.salary;

public class FixedSalary extends Salary {
    private float salary;

    public FixedSalary(int ID, String name, float tax,float salary) {
        super(ID, name, tax);
        this.salary = salary;
    }

    @Override
    public float getSalary() {
        return this.salary;
    }

    @Override
    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public FixedSalary getSalaryType() {
        return this;
    }
}
