package work.model.employee;


import java.time.LocalDate;

public class Tester extends BaseEmployee {


    public Tester(BaseEmployee employee, LocalDate recruitmentDate) {
        super(employee.getID(), employee.getInfo(), employee.getPost(), recruitmentDate);
    }


}

