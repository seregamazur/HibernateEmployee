import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import work.model.employee.*;

import java.time.LocalDate;

@RunWith(JUnit4.class)
public class CreateEmployeeTest {
    @Test
    public void createEmployeeTest() {
        BaseEmployee first = new Tester(1,
                new EmployeeInfo(1, "Serhiy Mazur"),
                Post.TESTER, LocalDate.of(2019, 01, 01),
                10000
        );
        first.setSalary(5000);
        System.out.println(first.getSalary());
        Cleaner second = new Cleaner(2,new EmployeeInfo(2,"Sereha Mazur"),
                Post.CLEANER,LocalDate.of(2019,01,02),500,4);
        System.out.println(second.getSalary());
        second.setSalary(900);
        second.setHourRate(2);
        System.out.println(second.getSalary());
        System.out.println(second.getHourRate());

    }
}
