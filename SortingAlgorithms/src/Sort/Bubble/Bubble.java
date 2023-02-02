package Sort.Bubble;

import java.util.ArrayList;

public class Bubble {
    boolean sorted = true;
    int reserve;

    public void go(ArrayList<Integer> array) {
        while (sorted) {
            sorted = false;
            for (int i = 0; i < array.size() - 1; i++) {
                if (array.get(i) > array.get(i + 1)) {
                    reserve = array.get(i);
                    array.set(i, array.get(i + 1));
                    array.set(i + 1, reserve);
                    sorted = true;
                }
            }
        }
    }
}
