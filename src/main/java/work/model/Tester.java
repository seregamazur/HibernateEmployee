package work.model;

public class Tester extends BaseEmployee implements SalaryType {
    private double salary;

    public Tester(BaseEmployee employee, double salary) {
        super(employee.getID(),employee.getInfo(),employee.getPost(),employee.getSalaryType());
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

