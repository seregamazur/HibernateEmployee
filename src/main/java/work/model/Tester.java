package work.model;

public class FixedSalaryEmployee extends BaseEmployee {
    private double salary;

    public FixedSalaryEmployee(EmployeeInfo info, double salary) {
        super(info);
        this.salary = salary;
    }


    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void setSalary(double salary) {
        this.salary = salary;
    }
}

