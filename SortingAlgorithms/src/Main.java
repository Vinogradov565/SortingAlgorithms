import Sort.Bubble.Bubble;
import Sort.Enter.Enter;
import Sort.Fast.Fast;
import Sort.Select.Select;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        Bubble bubble = new Bubble();
        Fast fastSort = new Fast();
        Enter enter = new Enter();
        Select select = new Select();

        array.add(5);
        array.add(4);
        array.add(3);
        array.add(2);
        array.add(1);
        System.out.println(array);

        bubble.go(array);
        System.out.println(array);

        array.set(0,5);
        array.set(1,4);
        array.set(2,3);
        array.set(3,2);
        array.set(4,1);
        System.out.println(array);

        fastSort.go(array,0, array.size() - 1);
        System.out.println(array);

        array.set(0,5);
        array.set(1,4);
        array.set(2,3);
        array.set(3,2);
        array.set(4,1);
        System.out.println(array);

        enter.enterSort(array,0,array.size() - 1);
        System.out.println(array);

        array.set(0,5);
        array.set(1,4);
        array.set(2,3);
        array.set(3,2);
        array.set(4,1);
        System.out.println(array);

        select.go(array);
        System.out.println(array);
    }
}