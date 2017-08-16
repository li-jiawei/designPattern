package patterns.prototype;

/**
 * Created by Jiawei on 7/12/17.
 */
public class Sheep implements Animal {

    public Sheep() {
        System.out.println("Sheep is Made");
    }

    @Override
    public Animal makeCopy() {
        System.out.println("Sheep is Being Made");

        Sheep sheepObject = null;

        try {
            sheepObject = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return sheepObject;
    }
}
