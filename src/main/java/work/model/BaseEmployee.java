package work.model;

public abstract class BaseEmployee implements Comparable<BaseEmployee> {
    private Post post;
    private EmployeeInfo info;
    private SalaryType salaryType;
    private final int ID;

    protected BaseEmployee(int ID,EmployeeInfo info,Post post,SalaryType salaryType) {
        this.ID = ID;
        this.info = info;
        this.post = post;
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
    @Override
    public int compareTo(BaseEmployee employee) {
        if (Double.compare(salaryType.getSalary(), employee.salaryType.getSalary()) == 0) {
            return this.getName().compareTo(employee.getName());
        } else return Double.compare(salaryType.getSalary(), employee.salaryType.getSalary());
    }
}