package patterns.singleton;

/**
 * Created by Jiawei on 7/12/17.
 */
public class SingleObject {
    private static SingleObject ourInstance = new SingleObject();

    public static SingleObject getInstance() {
        return ourInstance;
    }

    private SingleObject() {
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}
