package patterns.prototype;

/**
 * Created by Jiawei on 7/12/17.
 */
public class testCloning {

    public static void main(String[] args) {
        CloneFactory maker = new CloneFactory();

        Sheep sally = new Sheep();

        Sheep clonedSheep = (Sheep) maker.getClone(sally);

        System.out.println(sally);
        System.out.println(clonedSheep);

        System.out.println("Sally hashcode: " + System.identityHashCode(sally));
        System.out.println("Clone sheep hashcode: " + System.identityHashCode(clonedSheep));
    }
}
