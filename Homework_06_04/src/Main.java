import java.util.Scanner;

/**
 * 1) Вывести числа от одного до десяти при помощи каждого цикла. Объяснить в чем удобство каждого цикла
 * 2) Сделать логический метод, который проверяет на равенство два числа
 * 3) Сделать процедуру для чтения с консоли значения в глобальную переменную
 * 4) Сделать класс Cat с полями: age, weight и name. Добавить конструктор для инициализации полей,
 *    сделать методы акссессоры(геттеры и сеттеры) и метод out для вывода на консоль всех значений объекта.
 * 5) Создать объект класса Cat и показать работу всех его методов.
 */

public class Main {

    private static int globalVar;

    public static void main(String[] args) {
        System.out.println("***** №1 *****");
        /*
         * В цикле for, мы можем указать начальное значение, условие продолжения и шаг, что делает его удобным
         * для перебора элементов в массивах или списках.
         */
        System.out.println("\n* FOR *");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        /*
         * Цикл while подходит для повторения блока кода до тех пор, пока условие продолжения истинно,
         * что полезно для простых задач, когда нам нужно продолжать выполнение, пока не будет выполнено
         * определенное условие.
         */
        System.out.println("\n* WHILE *");
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        /*
         * Цикл do-while аналогичен циклу while, но он всегда выполнит блок кода хотя бы один раз,
         * что может быть полезно в некоторых сценариях.
         */
        System.out.println("\n* DO-WHILE *");
        int j = 1;
        do {
            System.out.println(j);
            j++;
        } while (j <= 10);

        System.out.println("\n***** №2 *****");
        System.out.println("5 == 5 ? " + isEqual(5,5));

        System.out.println("\n***** №3 *****");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        globalVar = scanner.nextInt();
        System.out.println("Вы ввели число: " + globalVar);

        System.out.println("\n***** №4-5 *****");
        Cat cat = new Cat(2, 5.2f, "Fluffy");
        cat.out(); // Вывод на консоль: Cat name: Fluffy, Cat age: 2, Cat weight: 5.2

        System.out.println();
        // Изменение возраста кота и вывод на консоль измененных данных
        cat.setAge(3);
        System.out.println("New age: " + cat.getAge()); // Вывод на консоль: New age: 3

        // Изменение веса кота и вывод на консоль измененных данных
        cat.setWeight(6);
        System.out.println("New weight: " + cat.getWeight()); // Вывод на консоль: New weight: 6.0

        // Изменение имени кота и вывод на консоль измененных данных
        cat.setName("Mittens");
        System.out.println("New name: " + cat.getName()); // Вывод на консоль: New name: Mittens

        // Вывод на консоль измененных данных о коте
        System.out.println();
        cat.out(); // Вывод на консоль: Cat name: Mittens, Cat age: 3, Cat weight: 6.0
    }

    public static boolean isEqual(int a, int b) {
        return a == b;
    }

}
