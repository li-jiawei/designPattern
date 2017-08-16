package patterns.decorator;

/**
 * Created by Jiawei on 7/12/17.
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
