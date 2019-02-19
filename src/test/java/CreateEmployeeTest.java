import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import work.model.employee.BaseEmployee;
import work.model.employee.EmployeeInfo;
import work.model.employee.Post;
import work.model.employee.Tester;

import java.time.LocalDate;

@RunWith(JUnit4.class)
public class CreateEmployeeTest {
    @Test
    public void createEmployeeTest(){
        SalaryType salaryType =
        new Tester(new BaseEmployee(1,new EmployeeInfo(1,"Vasya Pupkin Pupkinovitch",
                LocalDate.of(2019,04,14)), Post.TESTER,salaryType

    }
}
