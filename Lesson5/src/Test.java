public class Test {

    /*
    План занятия
    1) Знакомство с классами
    2) Знакомство с методами
     */

    /*
    Теория
    Чтобы создать объект класса(переменную) нужно воспользоваться следующей конструкцией:
    Book book = new Booк(параметры);
    Сначала указываем сам класс, потом название переменной, потом равно затем  new(выделяет память) и конструктор
     */


    /*
    Заметки
    В Java переменные и методы принято называть с маленькой буквы, а классы с большой
    По соглашению в Java считается дурным тоном располагать более 80 символов в одной строке, в Idea нам об этом
    подсказывает вертикальная линия справа

    Метод - часть программы, которая имеет свои границы и может выполнять одну задачу, чтобы воспользоваться методом,
    нужно указать его название

    В Java можно выделить 3 типа методов:
    Конструкторы - методы, которые создают объект
    Процедуры - методы, которые имеют в сигнатуре слово void, т.е. ничего не возвращают
    Функции - методы, которые в сигнатуре вмесето слова void имеют возвращаемый тип,
    например:

    public static int sum(int a, int b) {

      return a+b;
    }

   Такой метод должен вернуть в точку вызова значение указаного в его сигнатуре типа, при помощи слова return
   В Java существует класс Math, он предназначен для осуществления математических операций

   Методы можно вызывать внутри класса, где они определены, для этого нужно указать имя метода, можно вызывать через объект
   для этого нужно создать объект и поставив точку указать имя метода и можно вызывать через класс, для этого метод
   должен быть статическим(static)
   Примеры:

       Book book = new Book( "Computer Science", "Теоритеческий минимум по Computer Science",
                "Владсон Феррейра Фило", "учебник", 320);      - Создание объекта класса Book
        book.out();   - вызов метода, через объект

        Math.pow(2, 2);   - Вызов метода через класс
     */

    /*
    Задачи со *
    1) Класс для работы с массивом: базовые операции, динамическое выделение памяти(своя реализация ArrayList)
    2) Показать наследование на примере ветеринарной клиники: Базовый класс - Animal
    3) Показать работу модификаторов доступа
     */
    public static void main(String[] args) {

        Book book = new Book( "Computer Science", "Теоритеческий минимум по Computer Science",  // Создание объекта класса Book
                "Владсон Феррейра Фило", "учебник", 320);
        book.out();            // Вызов метода объекта

        sayHello();            // Вызываем методы sayHello
        sayHello();
        sayHello();
        sayHello();
        sayGoodBye();         // Вызываем метод sayGoodBye();

        int a = 2;
        int b = 3;
        int sum = a + b;      // Находим сумму самостоятельно
        sum = sum(a, b);      // Находим сумму при помощи метода - вынесли операцию в подпрограммму

        System.out.println(sum);               // Выводим результаты работы методов

        System.out.println(sum(4, 5));

        System.out.println(sub(10, 3));

        System.out.println(div(10, 3));

        System.out.println(mul(20, 15));

        System.out.println(Math.pow(2, 3));    // При помощи класса Math возвожу 2 в 3 степень

        System.out.println(makePow(4, 5));

        double res = makePow(4, 5) - 10;     // Запоминаем разультат работы в переменную

        System.out.println(res);

        System.out.println(absolute(-10));

        System.out.println(sqr(4));

        System.out.println(randomInRange(3, 7));

    }

    /**
     * Метод для генерации числа в диапазоне. Для понимания рекомендую вручную попробовать
     * просчитать какие числа он может вернуть
     * @param min начало диапазона
     * @param max конец диапазона
     * @return само число в диапазоне
     */
    public static int randomInRange(int min, int max){          // Генерация случайного числа в диапазоне
        return (int)(Math.random() *((max - min) + 1)) + min;   // Алгоритм генерации числа в диапазоне
    }


    public static double sqr(double num){
        return Math.sqrt(num);
    }

    public static int absolute(int num){
        return Math.abs(num);
    }

    public static double makePow(int num, int pow){
        return Math.pow(num, pow);
    }

    public static int sum(int a, int b){      // Создаем функцию, еоторая возвращает сумму двух чисел типа int
        return a + b;                         // return возвращает значение
    }

    public static int sub(int a, int b){      // Метод, который возвращает разность переменных
        return a-b;
    }

    public static float div(int c, int d){
        return (float)c/d;
    }

    public static double mul(double a, double z){
        return a*z;
    }

    public static void sayGoodBye(){          // Определяем методы, которые ничего не возвращают(процедуры)
        System.out.println("Good bye");
    }


    public static void sayHello(){
        System.out.println("Hello");
    }
}