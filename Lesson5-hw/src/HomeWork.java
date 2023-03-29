import java.util.ArrayList;

/**
 * 1) Создать методы(функции), которые будут возвращать сумму, произведение, частное и разность переменных типа double
 * 2) Создать класс Car, в котором будет конструктор и метод(процедура) для вывода значения полей класса
 * 3) Создать методы процедуры, которые будут выводить на консоль: "Я люблю Java" и "Учить программирование весело"
 * ДЗ со звездочкой
 * 1) Создать класс - аналог ArrayList
 * 2) Продемонстрировать работу всех модификаторов доступа в Java
 */

public class HomeWork {
    public static void main(String[] args) {
        System.out.println("2,54 + 7,98 = " + summ(2.54,  7.98));
        System.out.println("2,54 - 7,98 = " + minus(2.54,  7.98));
        System.out.println("2,54 * 7,98 = " + mult(2.54,  7.98));
        System.out.println("2,54 / 7,98 = " + div(2.54,  7.98));

        Car car = new Car("Renault",  160, "Red");
        car.out();

        text1();
        text2();

        System.out.println("***********************");
        ArrayList<Colors> colors = new ArrayList<>();

        Colors red = new Colors("Red", "#FF0000");
        colors.add(red);
        Colors green = new Colors("Green", "#00FF00");
        colors.add(0, green);
        Colors blue = new Colors("Blue", "#0000FF");
        colors.add(blue);

        System.out.println("Index of Color Green: " + colors.indexOf(blue));
        System.out.println("Цвет: " + colors.get(1).name + "\tRGB: " + colors.get(1).rgb);
    }

    public static double summ(double a, double b) {
        return a + b;
    }
    public static double minus(double a, double b) {
        return a - b;
    }
    public static double mult(double a, double b) {
        return a * b;
    }
    public static double div(double a, double b) {
        if (b != 0) return a / b;
        else return 0;
    }
    public static void text1() {
        System.out.println("Я люблю Java");
    }
    public static void text2() {
        System.out.println("Учить программирование весело");
    }
}
