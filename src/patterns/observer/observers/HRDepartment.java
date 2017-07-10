package patterns.observer.observers;

import patterns.observer.domain.Employee;

/**
 * Created by Jiawei on 7/10/17.
 */
public class HRDepartment implements IObserver {
    @Override
    public void callMe(String msg, Employee e) {
        System.out.println("HRDepartment is notified...");
        System.out.println(msg + ": " + e.getName());
    }
}
