package work.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
@Entity
@Table(name = "employee")
public class BaseEmployee implements Comparable<BaseEmployee> {
    @Id
    @Column(name = "id")
    private final int ID;
    @Column(name = "info")
    private EmployeeInfo info;
    @Column(name = "post")
    private Post post;
    @Column(name = "type")
    private SalaryType salaryType;
    @Column(name = "recruitment_date")
    private LocalDate recruitment;
    @Column(name = "dismissal_date")
    private LocalDate dissmisal;

    public BaseEmployee(int ID,EmployeeInfo info,Post post,
                        LocalDate recruitment,SalaryType salaryType) {
        this.ID = ID;
        this.info = info;
        this.post = post;
        this.recruitment = recruitment;
        this.salaryType = salaryType;
    }

    public void setInfo(EmployeeInfo info) {
        this.info = info;
    }

    private String getName() {
        return getInfo().getFc();
    }

    public EmployeeInfo getInfo() {
        return info;
    }

    @Override
    public String toString() {
        return "ID:" + this.info.getID() + " " + "name:" +
                this.info.getFc() + " " + "FC:" + this.info.getFc() + " " + "salary:" +
                salaryType.getSalary();
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public SalaryType getSalaryType() {
        return salaryType;
    }

    public void setSalaryType(SalaryType salaryType) {
        this.salaryType = salaryType;
    }

    public int getID() {
        return ID;
    }

    public LocalDate getRecruitment() {
        return recruitment;
    }

    public LocalDate getDissmisal() {
        return dissmisal;
    }

    public void setRecruitment(LocalDate recruitment) {
        this.recruitment = recruitment;
    }

    public void setDissmisal(LocalDate dissmisal) {
        this.dissmisal = dissmisal;
    }
    @Override
    public int compareTo(BaseEmployee employee) {
        if (Double.compare(salaryType.getSalary(), employee.salaryType.getSalary()) == 0) {
            return this.getName().compareTo(employee.getName());
        } else return Double.compare(salaryType.getSalary(), employee.salaryType.getSalary());
    }
}