package work.model.employee;



import java.time.LocalDate;

public class Cleaner extends BaseEmployee {

    private int hoursRate;

    public int getHoursRate() {
        return hoursRate;
    }

    public void setHoursRate(int hoursRate) {
        this.hoursRate = hoursRate;
    }

    public Cleaner(BaseEmployee employee, LocalDate recruitmentDate, int hoursRate, double salary) {
        super(employee.getID(),employee.getInfo(),employee.getPost(),recruitmentDate);
        this.hoursRate = hoursRate;
    }





}