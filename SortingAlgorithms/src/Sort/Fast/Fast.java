package Sort.Fast;

import java.util.ArrayList;

public class Fast {
    static int partition(ArrayList<Integer> array, int begin, int end) {
        int pivot = end;

        int counter = begin;
        for (int i = begin; i < end; i++) {
            if (array.get(i) < array.get(pivot)) {
                int temp = array.get(counter);
                array.set(counter, array.get(i));
                array.set(i, temp);
                counter++;
            }
        }
        int temp = array.get(pivot);
        array.set(pivot, array.get(counter));
        array.set(counter, temp);

        return counter;
    }

    public static void go(ArrayList<Integer> array, int begin, int end) {
        if (end <= begin) return;
        int pivot = partition(array, begin, end);
        go(array, begin, pivot - 1);
        go(array, pivot + 1, end);
    }
}
