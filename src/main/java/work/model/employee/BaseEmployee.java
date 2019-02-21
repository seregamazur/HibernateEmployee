package work.model.employee;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "employee")
public abstract class BaseEmployee implements Comparable<BaseEmployee> {
    @Id
    @Column(name = "id")
    @GeneratedValue
    private final int ID;
    @Column(name = "info")
    private EmployeeInfo info;
    @Column(name = "post")
    private Post post;
    @Column(name = "recruitment_date")
    private LocalDate recruitment;
    @Column(name = "dismissal_date")
    private LocalDate dissmisal;
    @Column(name = "salary")
    private float salary;

    public BaseEmployee(int ID, EmployeeInfo info, Post post,
                        LocalDate recruitment, float salary) {
        this.ID = ID;
        this.info = info;
        this.post = post;
        this.recruitment = recruitment;
        this.salary = salary;
    }


   /* public void setInfo(EmployeeInfo info) {
        this.info = info;
    }*/

    private String getName() {
        return getInfo().getFc();
    }

    public EmployeeInfo getInfo() {
        return info;
    }

    @Override
    public String toString() {
        return "ID:" + this.info.getID() + " " + "name:" +
                this.info.getFc() + " " + "FC:" + this.getSalary() + " " + "salary:";

    }

    @Enumerated(EnumType.ORDINAL)
    public Post getPost() {
        return post;
    }

    /*public void setPost(Post post) {
        this.post = post;
    }*/


    public int getID() {
        return ID;
    }

    public LocalDate getRecruitment() {
        return recruitment;
    }

    public LocalDate getDissmisal() {
        return dissmisal;
    }

    /*
        public void setRecruitment(LocalDate recruitment) {
            this.recruitment = recruitment;
        }

        public void setDissmisal(LocalDate dissmisal) {
            this.dissmisal = dissmisal;
        }
    */
    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(BaseEmployee employee) {
        if (Double.compare(this.getSalary(), employee.getSalary()) == 0) {
            return this.getName().compareTo(employee.getName());
        } else return Double.compare(this.getSalary(), employee.getSalary());
    }
}