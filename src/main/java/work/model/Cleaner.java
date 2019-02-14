package work.model;

public class HourRatedEmployee extends BaseEmployee {

    private int hoursRate;
    private double salary;

    public int getHoursRate() {
        return hoursRate;
    }

    public void setHoursRate(int hoursRate) {
        this.hoursRate = hoursRate;
    }



    public HourRatedEmployee(EmployeeInfo info, int hoursRate, double salary) {
        super(info);
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