package work.model.employee;

import java.time.LocalDate;

public class FixedSalary extends BaseEmployee {

    public FixedSalary(int ID, EmployeeInfo info, Post post, LocalDate recruitment,float salary) {
        super(ID, info, post, recruitment,salary);
    }
}
