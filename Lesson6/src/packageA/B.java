package packageA;

public class B {

    public void out(){
        A obj = new A();        // Создали переменную класса A(объект), чтобы получить доступ к переменным класса A
        System.out.println("Доступ к переменным из другого класса, но в том же пакете:");
        System.out.println("default: " + obj.b);
        System.out.println("protected: " + obj.c);
        System.out.println("public: " + obj.d);
    }
}
