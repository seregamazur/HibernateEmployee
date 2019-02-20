package work.model.employee;

public enum Post {
    TESTER(10_000),
    HR(6_000),
    CLEANER(200),
    SECURITY(8_000);

    private float salary;

    Post(float salary) {
        this.salary = salary;
    }

    public float getSalary() {
        return this.salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

}
