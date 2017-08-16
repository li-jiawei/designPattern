package patterns.decorator;

/**
 * Created by Jiawei on 7/12/17.
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}