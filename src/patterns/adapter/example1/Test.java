package patterns.adapter.example1;

/**
 * Created by Jiawei on 7/10/17.
 */
public class Test {
    public static void main(String[] args) {
        int[] numbers = new int[]{34, 2, 4, 12, 1};
        Sorter sorter = new SortListAdapter();
        sorter.sort(numbers);
    }
}
