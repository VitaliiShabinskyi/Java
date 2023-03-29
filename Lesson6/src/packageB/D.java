package packageB;

import packageA.A;

public class D {

    public void out(){
        A obj = new A();
        System.out.println("Доступ из другого класса в другом пакете: ");
        System.out.println("public: " + obj.d);
    }
}
