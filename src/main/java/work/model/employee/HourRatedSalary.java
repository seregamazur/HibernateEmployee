package work.model.employee;

import java.time.LocalDate;

public class HourRatedSalary extends BaseEmployee {
    private float salary;
    private int hourRate;

    public HourRatedSalary(int ID, EmployeeInfo info, Post post, LocalDate recruitment,
                           float salary, int hourRate) {
        super(ID, info, post, recruitment,salary);
        this.salary = salary;
        this.hourRate= hourRate;
    }

    @Override
    public float getSalary() {
        return this.salary * this.hourRate;
    }

    public void setHourRate(int hourRate){
        this.hourRate = hourRate;
    }

    public int getHourRate(){
        return this.hourRate;
    }

    @Override
    public void setSalary(float salary) {
        this.salary = salary;
    }
}
