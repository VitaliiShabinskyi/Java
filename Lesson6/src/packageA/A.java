package packageA;

public class A {               // Класс, в котором находятся переменные
    private int a = 1;         // Модификатор доступа private
    int b = 2;                 // Модификатор доступа dafault(пустой)
    protected int c = 3;       // Модификатор доступа protected
    public int d = 4;          // Модификатор доступа public

    /**
     * Метод для вывода переменных
     */
    public void out(){
        System.out.println("Доступ из класса, в котором определены переменные: ");
        System.out.println("private: " + a);
        System.out.println("default: " + b);
        System.out.println("protected: " + c);
        System.out.println("public: " + d);
    }
}
