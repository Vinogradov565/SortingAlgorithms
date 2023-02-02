package Sort.Select;

import java.util.ArrayList;

public class Select {
    public static void go(ArrayList<Integer> array) {
        for (int i = 0; i < array.size(); i++) {
            int min = array.get(i);
            int minId = i;
            for (int j = i + 1; j < array.size(); j++) {
                if (array.get(j) < min) {
                    min = array.get(j);
                    minId = j;
                }
            }
            int temp = array.get(i);
            array.set(i, min);
            array.set(minId, temp);
        }
    }
}
