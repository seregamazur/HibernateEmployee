package work.model.employee;

import java.time.LocalDate;

public class Tester extends FixedSalary {
    public Tester(int ID, EmployeeInfo info, Post post, LocalDate recruitment, float salary) {
        super(ID, info, post, recruitment, salary);
    }
}
