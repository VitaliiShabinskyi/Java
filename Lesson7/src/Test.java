public class Test {

    /*
    План занятия
    1) Практика с методами
     */

    /*
    Теория      \
    Метод - часть программы(подпрограмма), которая выполняет отдельную задачу.
    Преимущества:
    1) Разбиение задач на подзадачи
    2) Многократное использование кода
    3) Повышение читаемости кода

    Типы в Java
    void - процедура
    типизированный - функция(возвращают значения - return)
    конструкторы - Всегда совпадают с названием класса, в котором определены

    Модификаторы доступа:
    private                  - Доступ в пределах класса
    protected                - В пакете и в классах наследниках
    public                   - Везде
    default(отсутствующий)   - Только в пакете

    static - принадлежит классу, т.е. всегда находится в той же области памяти, что и класс - в Metaspace, поскольку
    он принадлежит классу, то всегда будет общий для объектов класса

    final - константа, т.е. этот модификатор запрещает вносить изменения
    Константные переменные принято называть заглавными буквами(большими)

    Полиморфизм(многоформие) - способ испозуя одно название, создать решения разных задач, когда мы создаем несколько
    методов с одним названием мы их перегружаем - пример называется полиморфизмом или перегрузкой метода

    Логические выражения в Java
    Сравнение:
    ==  - логическое равно
    !=  - логическое неравно
    >   - больше
    <   - меньше
    <=  - меньше или равно
    >=  - больше или равно

    Логические выражения могут содержать несколько условий. Их можно определять
    && - и, пример: Я преподаю и Катя преподает - неверное утверждение, а Я человек и Катя человек - верное, чтобы получить
    true при объедение условий операций && все условия должна быть одного типа или true или false
    || - или, пример: Мы пишем на Java или JavaScript - true, для того, чтобы получить true в таком выражении достаточно
    одного выполненного условия
    ^(xor) - исключающее или(Либо), пример: Участник лекции либо преподаватель, либо студент - true.
     */

    /*
    Заметки
    Для геттеров логических переменных принято вместо get писать is - тонкости английского языка, в принципе, логические
    метода принято называть с is.

     */

    /*
    ДЗ со звездочкой
    1) Работа с методами через static(класс) и через объект (нестатические методы)
    2)* Сделать библиотеку в отдельном пакете для обработки строк и массивов учесть инкапсуляюцию
    3) Сделать класс Plane, обеспечить защиту(инкапсуляцию) данных класса
     */

    static final int NUM = 12;

    public static void main(String[] args) {
        System.out.println("Периметр прямоугольника: " + perimeter(2, 3) );     // Вызываем полиморфные(перегруженные) методы для расчета периметров
        System.out.println("Периметр треугольника: " + perimeter(3, 4, 5) );

        Car car = new Car("Mazda", 2022, 37000);                                 // Полиморфизм объектов
        Car car1 = new Car("BMW", 2023, 180000, true);

        System.out.println(car.getBrand());                                     // Получаем через геттер и выводим бренд объекта car
        car.setPrice(40000);                                                    // Меняем стоимость объекта car
        System.out.println(car.getPrice());

        System.out.println(car1.getBrand());
        car1.setBrand("Audi");

        System.out.println(car1.getBrand());

        double sum =  car.getPrice() + car1.getPrice();                        // Получаем через геттеры стоимости объектов car и присваиваем их сумма переменной

        System.out.println("Сумма: " + sum);                                   // Выводим сумму

        int a = 10;
        int b = 15;
        int c = 7;
        int d = 15;
        //Условие: первая переменная больше третьей или больше второй
        System.out.println(a > c || a > b); // true потому что выполнено одно из условий  вызов метода - isOneMoreAny(a, b, c)
        //Условие: вторая переменная больше первой и больше третьей
        System.out.println(b > a && b > c); // true потому что оба условия верны
        //Условие: вторая переменная больше первой и меньше третьей
        System.out.println(b >  a && b < c); // false, потому что второе условие не выполнено
        //Условие: вторая переменная больше четвертой
        System.out.println(b > d); // false, потому что они равны
        //Условие: вторая переменная больше или равна четвертой
        System.out.println(b >= d); // true, потому что они равны
        //Условие: вторая переменная неравна четвертой
        System.out.println(b != d); // false, потому что они равны
        //Условие: вторая переменная равна 15 либо четвертая переменная равна 15
        System.out.println(b == 15 ^ d == 15); // false, потому что оба числа равны 15;
        //Условие: Первая переменная неравна 10, а третья равна 7
        System.out.println(c == 7 ^ a != 10 ); //true, потому что одно условие должно быть true, a другое false
        System.out.println(isEqual(10, 15)); // Вызываем метод для сравнения двух чисел
        System.out.println(isEqual(7, 7));

        System.out.println(isSecondMoreThanOthers(37, 4, 5));
    }

    public static boolean isSecondMoreThanOthers(int a, int b, int c){
        return b > a && b > c;
    }

    public static boolean isOneMoreAny(int a, int b, int c){    // Первое условие на стр. 94 можно заменить вызовом метода - просто передав ему параметры
        return a > c || a > b;
    }
    /**
     * Метод сравнивает два значение
     * @param a первое значение
     * @param b второе значение
     * @return результат сравнения
     */
    public static boolean isEqual(int a, int b){
        return a == b;
    }

    /*
    Задача
    Создать методы для нахождения периметра(сумм сторон фигур): треугольника и прямоугольника
    Решения
    Воспользуемся полиморфизмом и создадим два метода с названием perimeter, а чтобы их различать будем передавать
    разные наборы параметров в них, для треугольника 3, для прямоугольника 2
     */


    /**
     * Метод для расчета периметра прямоугольника
     * @param a одна сторона
     * @param b вторая сторона
     * @return сумма всех сторон прямоугольника
     */
    public static int perimeter(int a, int b) {                 // Полиморфизм методов
        return 2*(a+b);
    }

    /**
     * Метод для расчета периметра треугольника
     * @param a первая сторона
     * @param b вторая сторона
     * @param c третья сторона
     * @return сумму всех сторон треугольника
     */
    public static int perimeter(int a, int b, int c){
        // TODO Сделать проверку на корректность введенных данных - является ли фигура треугольником
        return a+b+c;
    }

}