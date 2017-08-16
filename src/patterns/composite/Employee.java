package patterns.composite;

/**
 * Created by Jiawei on 7/12/17.
 */
public interface Employee {

    public void add(Employee employee);
    public void remove(Employee employee);
    public Employee getChild(int i);
    public String getName();
    public double getSalary();
    public void print();
}
