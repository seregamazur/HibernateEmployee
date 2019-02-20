import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import work.model.employee.BaseEmployee;
import work.model.employee.EmployeeInfo;
import work.model.employee.Post;

import java.time.LocalDate;

@RunWith(JUnit4.class)
public class CreateEmployeeTest {
    @Test
    public void createEmployeeTest() {
        BaseEmployee first = new BaseEmployee(1, new EmployeeInfo(1, "Serhiy Mazur"),
                Post.TESTER, LocalDate.of(2019, 01, 01));
        System.out.println(first.getPost().getSalary());
    }
}
