package patterns.adapter.example1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jiawei on 7/10/17.
 */
public class SortListAdapter implements Sorter {
    @Override
    public int[] sort(int[] numbers) {
        //convert the array to a List
        List<Integer> numberList = new ArrayList<Integer>();
        for (int i = 0; i < numbers.length; i++) {
            numberList.add(numbers[i]);
        }
        //call the adapter
        NumberSorter sorter = new NumberSorter();
        numberList = sorter.sort(numberList);
        //convert the list back to an array and return
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numberList.get(i);
        }
        return numbers;
    }
}
