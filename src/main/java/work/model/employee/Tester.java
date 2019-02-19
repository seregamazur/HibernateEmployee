package work.model.employee;

import work.model.employee.BaseEmployee;

public class Tester extends BaseEmployee {
    private static double salary;

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

