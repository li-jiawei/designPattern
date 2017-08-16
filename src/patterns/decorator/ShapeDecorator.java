package patterns.decorator;

/**
 * Created by Jiawei on 7/12/17.
 */
public abstract class ShapeDecorator implements Shape{
    protected  Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
