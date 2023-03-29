import java.util.Arrays;

public class ArrayNonStatic {
    private int[] array;

    public ArrayNonStatic(int[] array) {
        this.array = array;
    }
    public void setArray(int[] array) {
        this.array = array;
    }
    public int[] getArray() {
        return array;
    }
    public void out() {
        if (array == null) {
            System.out.println("Not array");
            return;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.printf(array[i] + " ");
        }
        System.out.println();
    }
    public void sortArray() {
        if (array == null) {
            System.out.println("Not array");
            return;
        }
        Arrays.sort(array);
    }
    public int findMax() {
        if (array == null) {
            System.out.println("Not array");
            return -1;
        }
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) max = array[i];
        }
        return max;
    }
    public int findMin() {
        if (array == null) {
            System.out.println("Not array");
            return -1;
        }
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) min = array[i];
        }
        return min;
    }

}
