package packageB;

import packageA.A;                      // Указывает путь к другому пакету, т.е. обращаемся к packageA и берем из него класс A

public class C extends A {              // Унаследовались от класса A, который находится в другом пакете

    @Override
    public void out(){
        A obj = new A();
        System.out.println("Доступ к переменным из другого класса наследника, находящегося в другом пакете: ");
        System.out.println("protected: " + super.c);     // super - дает доступ к элементам класса родителя
        System.out.println("public: " + obj.d);
    }
}
