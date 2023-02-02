package Sort.Enter;

import java.util.ArrayList;

public class Enter {
    static void enter(ArrayList<Integer> array, int left, int mid, int right) {
        int lengthLeft = mid - left + 1;
        int lengthRight = right - mid;

        int leftArray[] = new int[lengthLeft];
        int rightArray[] = new int[lengthRight];

        for (int i = 0; i < lengthLeft; i++)
            leftArray[i] = array.get(left + i);
        for (int i = 0; i < lengthRight; i++)
            rightArray[i] = array.get(mid + i + 1);

        int leftIndex = 0;
        int rightIndex = 0;

        for (int i = left; i < right + 1; i++) {
            if (leftIndex < lengthLeft && rightIndex < lengthRight) {
                if (leftArray[leftIndex] < rightArray[rightIndex]) {
                    array.set(i, leftArray[leftIndex]);
                    leftIndex++;
                } else {
                    array.set(i, rightArray[rightIndex]);
                    rightIndex++;
                }
            } else if (leftIndex < lengthLeft) {
                array.set(i, leftArray[leftIndex]);
                leftIndex++;
            } else if (rightIndex < lengthRight) {
                array.set(i, rightArray[rightIndex]);
                rightIndex++;
            }
        }
    }

    public static void enterSort(ArrayList<Integer> array, int left, int right) {
        if (right <= left) return;
        int mid = (left + right) / 2;
        enterSort(array, left, mid);
        enterSort(array, mid + 1, right);
        enter(array, left, mid, right);
    }
}
