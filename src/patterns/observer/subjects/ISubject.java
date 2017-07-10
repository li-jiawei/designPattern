package patterns.observer.subjects;

import patterns.observer.observers.IObserver;

/**
 * Created by Jiawei on 7/10/17.
 */
public interface ISubject {
    public void registerObserver(IObserver o);
    public void removeObserver(IObserver o);
    public void notifyObservers();
}
