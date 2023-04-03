/**
 * 1) Создать класс Car c приватными полями, двумя конструкторами, aксессорами для полей
 *    и методом(процедурой) out для вывода всех полей класс на консоль
 * 2) Создать статические(static) методы для решения основных арифметических
 *    операций: +, -, *, /
 * 3) Создать логические методы, которые будут проверять условия для переданных в них 3 переменных:
 * a) первая переменная больше двух остальных;
 * b) первая переменная больше хотя бы одной переменной;
 * c) первая переменная больше только одной переменной.
 */
public class Main {

    public static void main(String[] args) {
        // Создание объекта Car
        Car car1 = new Car("Toyota", "Camry", 2015, 13000);
        Car car2 = new Car("BMW", "X6", 2021, 28000);

        // Вызов метода out для вывода всех полей объекта Car
        car1.out();
        car2.out();

        // Использование статических методов для решения арифметических операций
        int sum = add(10, 5);
        int sub = subtract(10, 5);
        int mult = multiply(10, 5);
        double div = divide(10, 5);

        // Вывод результатов арифметических операций
        System.out.println("10 + 5 = " + sum);
        System.out.println("10 - 5 = " + sub);
        System.out.println("10 * 5 = " + mult);
        System.out.println("10 / 5 = " + div);

        // Использование логических методов
        boolean a = isFirstGreater(10, 5, 3);
        boolean b = isFirstGreaterOrEqual(10, 5, 15);
        boolean c = isFirstGreaterOnlyOne(10, 5, 20);

        // Вывод результатов логических методов
        System.out.println("первая переменная больше двух остальных? (10, 5, 3) " + a);
        System.out.println("первая переменная больше хотя бы одной переменной? (10, 5, 15) " + b);
        System.out.println("первая переменная больше только одной переменной? (10, 5, 20) " + c);
    }

    /**
     * 2) Статические(static) методы для решения основных арифметических операций: +, -, *, /
     *
     * @param a число 1
     * @param b число 2
     * @return
     */
    public static int add(int a, int b) {
        return a + b;
    }
    public static int subtract(int a, int b) {
        return a - b;
    }
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static double divide(double a, double b) {
        return a / b;
    }

    /**
     * 3) Создать логические методы, которые будут проверять условия для переданных в них 3 переменных
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static boolean isFirstGreater(int a, int b, int c) { // a) первая переменная больше двух остальных;
        return a > b && a > c;
    }

    public static boolean isFirstGreaterOrEqual(int a, int b, int c) { // первая переменная больше хотя бы одной переменной;
        return a >= b || a >= c;
    }

    public static boolean isFirstGreaterOnlyOne(int a, int b, int c) { // первая переменная больше только одной переменной.
        return (a > b && a < c) || (a < b && a > c);
    }

}
