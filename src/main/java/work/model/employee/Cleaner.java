package work.model.employee;

import java.time.LocalDate;

public class Cleaner extends HourRatedSalary {
    public Cleaner(int ID, EmployeeInfo info, Post post, LocalDate recruitment, float salary, int hourRate) {
        super(ID, info, post, recruitment, salary, hourRate);
    }
}
