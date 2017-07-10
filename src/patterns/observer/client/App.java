package patterns.observer.client;

import patterns.observer.domain.Employee;
import patterns.observer.observers.HRDepartment;
import patterns.observer.observers.IObserver;
import patterns.observer.observers.PayrollDepartment;
import patterns.observer.subjects.EmployeeManagementSystem;

import java.util.Date;

/**
 * Created by Jiawei on 7/10/17.
 */
public class App {
    public static void main (String[] args) {
        IObserver payroll = new PayrollDepartment();
        IObserver hrSystem = new HRDepartment();

        EmployeeManagementSystem ems = new EmployeeManagementSystem();

        ems.registerObserver(payroll);

        Employee bob = new Employee("Bob", new Date(), 35000, true);
        ems.hireNewEmployee(bob);

        ems.modifyEmployeeName(2, "Imtiaz");
    }
}
