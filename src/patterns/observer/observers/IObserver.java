package patterns.observer.observers;

import patterns.observer.domain.Employee;

/**
 * Created by Jiawei on 7/10/17.
 */
public interface IObserver {
    public void callMe(String msg, Employee e);
}
