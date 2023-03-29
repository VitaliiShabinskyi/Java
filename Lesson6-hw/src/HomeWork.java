import java.util.Arrays;
import java.util.Random;

/**
 * 1) Создать класс Animal c полями: age, weight, name, id реализовать автогенерацию id, добавить метод(процедуру) для
 *         вывода полей объекта
 * 2)* Показать работу модификаторов доступа
 *     ДЗ со звездочкой
 * 1) Создать класс для работы с массивом через статические переменные
 * 2) Создать класс для работы с массивом через объекты - нестатические переменные
 * 3)* Создать общий класс родитель для этих классов и вынести его в отдельный пакет - задача создать библиотеку для
 *      других программистов (НЕ РЕАЛИЗОВАНО).
 */

public class HomeWork {
    static ArrayStatic[] array = new ArrayStatic[10];
    static Random random = new Random();
    public ArrayNonStatic[] array2 = new ArrayNonStatic[10];
    public static void main(String[] args) {
        Animal cat = new Animal(3, 2.5, "Барсик");
        cat.out();

        Animal dog = new Animal(7, 12.4, "Барбос");
        System.out.println("Dog age: " + dog.getAge());

        dog.setAge(9);
        dog.out();

        System.out.println("********* 1 - Static **********");
        ArrayStatic.setArray(new int[]{random.nextInt(-100,100),random.nextInt(-100,100),
                random.nextInt(-100,100),random.nextInt(-100,100),
                random.nextInt(-100,100),random.nextInt(-100,100),
                random.nextInt(-100,100),random.nextInt(-100,100),
                random.nextInt(-100,100),random.nextInt(-100,100)});
        System.out.println("Out: " + Arrays.toString( ArrayStatic.getArray() ));
        System.out.println("Max: " + ArrayStatic.findMax());
        System.out.println("Min: " + ArrayStatic.findMin());
        ArrayStatic.sortArray();
        System.out.printf("Sort => out: ");
        ArrayStatic.out();

        System.out.println("********* 2 - Non Static **********");
        int[] arr = {random.nextInt(-100,100),random.nextInt(-100,100),
                random.nextInt(-100,100),random.nextInt(-100,100),
                random.nextInt(-100,100),random.nextInt(-100,100),
                random.nextInt(-100,100),random.nextInt(-100,100),
                random.nextInt(-100,100),random.nextInt(-100,100)};
        ArrayNonStatic array2 = new ArrayNonStatic(arr);
        System.out.println("Out: " + Arrays.toString(array2.getArray()));

        System.out.println("Max: " + array2.findMax());
        System.out.println("Min: " + array2.findMin());

        array2.sortArray();
        System.out.printf("Sort => out: ");
        array2.out();

    }

}
