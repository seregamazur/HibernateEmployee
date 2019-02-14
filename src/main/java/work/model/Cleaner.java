package work.model;

public class Cleaner extends BaseEmployee implements SalaryType{

    private int hoursRate;
    private double salary;

    public int getHoursRate() {
        return hoursRate;
    }

    public void setHoursRate(int hoursRate) {
        this.hoursRate = hoursRate;
    }



    public Cleaner(BaseEmployee employee, int hoursRate, double salary) {
        super(employee.getID(),employee.getInfo(),employee.getPost(),employee.getSalaryType());
        this.hoursRate = hoursRate;
        this.salary = salary * this.hoursRate;
    }

    @Override
    public double getSalary() {
        return salary * hoursRate;
    }

    @Override
    public void setSalary(double salary) {
        this.salary = salary;
    }


}