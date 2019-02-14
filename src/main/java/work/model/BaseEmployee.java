package work.model;

public abstract class BaseEmployee implements Comparable<BaseEmployee> {

    private EmployeeInfo info;

    public void setInfo(EmployeeInfo info) {
        this.info = info;
    }

    protected BaseEmployee(EmployeeInfo info) {
        this.info = info;
    }

    public abstract double getSalary();

    public abstract void setSalary(double salary);

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
                this.getSalary();
    }

    @Override
    public int compareTo(BaseEmployee employee) {
        if (Double.compare(this.getSalary(), employee.getSalary()) == 0) {
            return this.getName().compareTo(employee.getName());
        } else return Double.compare(this.getSalary(), employee.getSalary());
    }
}