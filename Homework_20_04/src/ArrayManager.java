import java.util.Arrays;

public class ArrayManager {
    private int[] array;

    public ArrayManager() {
        array = new int[10];
    }

    public void insert(int index, int value) {
        if (index >= 0 && index < array.length) {
            array[index] = value;
        }
    }

    public void delete(int index) {
        if (index >= 0 && index < array.length) {
            for (int i = index; i < array.length - 1; i++) {
                array[i] = array[i+1];
            }
            array[array.length-1] = 0;
        }
    }

    public void sort() {
        Arrays.sort(array);
    }

    public int search(int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public String toString() {
        return Arrays.toString(array);
    }
}
