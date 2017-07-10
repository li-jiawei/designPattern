package patterns.observer.observers;

import patterns.observer.domain.Employee;

/**
 * Created by Jiawei on 7/10/17.
 */
public class PayrollDepartment implements IObserver {
    @Override
    public void callMe(String msg, Employee e) {
        System.out.println("PayrollDepartment is notified...");
        System.out.println(msg + ": " + e.getName());
    }
}
