package patterns.prototype;

/**
 * Created by Jiawei on 7/12/17.
 */
public class CloneFactory {

    public Animal getClone(Animal animalSample) {
        return animalSample.makeCopy();
    }
}
