package patterns.factory;

/**
 * Created by Jiawei on 7/10/17.
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle: draw() method");
    }
}
