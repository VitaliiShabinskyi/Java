import java.util.Arrays;

public class ArrayStatic {
    private static int[] array;

    public static void setArray(int[] arr) {
        array = arr;
    }
    public static int[] getArray() {
        return array;
    }
    public static void out() {
        if (array == null) {
            System.out.println("Не массив");
            return;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void sortArray() {
        if (array == null) {
            System.out.println("Не массив");
            return;
        }
        Arrays.sort(array);
    }
    public static int findMax() {
        if (array == null) {
            System.out.println("Не массив");
            return -1;
        }
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    public static int findMin() {
        if (array == null) {
            System.out.println("Не массив");
            return -1;
        }
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
