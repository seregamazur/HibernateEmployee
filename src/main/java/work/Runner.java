package work;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import work.model.employee.BaseEmployee;
import work.model.employee.EmployeeInfo;
import work.model.employee.Post;
import work.model.employee.Tester;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;

public class Runner {
    private static SessionFactory factory;

    public static void main(String[] args) {
        try {
            factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex);
        }

        Runner ME = new Runner();

        /* Add few employee records in database */
        Integer empID1 = ME.addEmployee(new Tester(1,new EmployeeInfo(1,"Serhiy Mazur"), Post.TESTER,
                LocalDate.of(2019,01,01),5000));
        Integer empID2 = ME.addEmployee(new Tester(1,new EmployeeInfo(1,"Serhiya Mazur"), Post.TESTER,
                LocalDate.of(2019,01,01),9000));

        /* List down all the employees */
        ME.listEmployees();

        /* Update employee's records */
        ME.updateEmployee(empID1, 5000);

        /* Delete an employee from the database */
        ME.deleteEmployee(empID2);

        /* List down new list of the employees */
        ME.listEmployees();
    }

    /* Method to CREATE an employee in the database */
    public Integer addEmployee(BaseEmployee employee) {
        Session session = factory.openSession();
        Transaction tx = null;
        Integer employeeID = null;

        try {
            tx = session.beginTransaction();
            employeeID = (Integer) session.save(employee);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return employeeID;
    }

    /* Method to  READ all the employees */
    public void listEmployees() {
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            List employees = session.createQuery("from employee").list();
            for (Iterator iterator = employees.iterator(); iterator.hasNext(); ) {
                BaseEmployee employee = (BaseEmployee) iterator.next();
                System.out.print("FC: " + employee.getInfo().getFc());
                System.out.print("Salary: " + employee.getSalary());
            }
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    /* Method to UPDATE salary for an employee */
    public void updateEmployee(Integer EmployeeID, int salary) {
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            BaseEmployee employee = session.get(BaseEmployee.class, EmployeeID);
            employee.setSalary(salary);
            session.update(employee);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    /* Method to DELETE an employee from the records */
    public void deleteEmployee(Integer EmployeeID) {
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            BaseEmployee employee =  session.get(BaseEmployee.class, EmployeeID);
            session.delete(employee);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
