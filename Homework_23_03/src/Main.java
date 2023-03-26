/*
 * 1) Создать( декларировать) все примитивные типы как глобальные переменные и как локальные переменные
 * 2) Считать из консоли каждый примитивный тип и присвоить его переменной.
 * 3) Вывести все типы в таблицу при помощи println() и printf()
 */

import java.util.Scanner;

public class Main {
    // Глобальные переменные
    static boolean booleanVar;
    static byte byteVar;
    static short shortVar;
    static int intVar;
    static long longVar;
    static float floatVar;
    static double doubleVar;
    static char charVar;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Локальные переменные
        boolean localBoolean;
        byte localByte;
        short localShort;
        int localInt;
        long localLong;
        float localFloat;
        double localDouble;
        char localChar;

        // Считываем значения из консоли
        System.out.print("Введите boolean: ");
        booleanVar = scanner.nextBoolean();
        System.out.print("Введите byte (от -128 до 127): ");
        byteVar = scanner.nextByte();
        System.out.print("Введите short (от -32768 до 32767): ");
        shortVar = scanner.nextShort();
        System.out.print("Введите int (от -2 147 483 648 до 2 147 483 647): ");
        intVar = scanner.nextInt();
        System.out.print("Введите long (от -9 223 372 036 854 775 808L до 9223372036854775807L): ");
        longVar = scanner.nextLong();
        System.out.print("Введите float (от 1.4e-45f до 3.4e+38f): ");
        floatVar = scanner.nextFloat();
        System.out.print("Введите double (от 4.9e-324 до 1.7e+308): ");
        doubleVar = scanner.nextDouble();
        System.out.print("Введите char: ");
        charVar = scanner.next().charAt(0);

        // Выводим значения на экран
        System.out.println("Тип\t\tЗначение");
        System.out.println("---------------------------");
        System.out.println("boolean\t\t" + booleanVar);
        System.out.println("byte\t\t" + byteVar);
        System.out.println("short\t\t" + shortVar);
        System.out.println("int \t\t" + intVar);
        System.out.println("long\t\t" + longVar);
        System.out.println("float\t\t" + floatVar);
        System.out.println("double\t\t" + doubleVar);
        System.out.println("char\t\t" + charVar);

        System.out.printf("%nТип\t\tЗначение%n");
        System.out.printf("---------------------------%n");
        System.out.printf("boolean\t\t%s%n", booleanVar);
        System.out.printf("byte\t\t%d%n", byteVar);
        System.out.printf("short\t\t%d%n", shortVar);
        System.out.printf("int \t\t%d%n", intVar);
        System.out.printf("long\t\t%d%n", longVar);
        System.out.printf("float\t\t%f%n", floatVar);
        System.out.printf("double\t\t%f%n", doubleVar);
        System.out.printf("char\t\t%c%n", charVar);
    }
}
