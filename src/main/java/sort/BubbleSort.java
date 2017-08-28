package sort;

public class BubbleSort {

    public static <T extends Comparable<T>> void bubbleSort(T[] elements) {

        for (int i = 0; i < elements.length; i ++) {
            for (int j = i + 1; j < elements.length; j ++) {
                if (elements[i].compareTo(elements[j]) < 0) {
                    T tmp = elements[i];
                    elements[i] = elements[j];
                    elements[j] = tmp;
                }
            }
        }

    }
}
