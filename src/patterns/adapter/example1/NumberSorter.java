package patterns.adapter.example1;

/*
 * This is our adaptee, a third party implementation of a
 * number sorter that deals with Lists, not arrays.
*/

import java.util.ArrayList;
import java.util.List;

public class NumberSorter {
    public List<Integer> sort(List<Integer> numbers) {
        //sort and return
        return new ArrayList<Integer>();
    }
}