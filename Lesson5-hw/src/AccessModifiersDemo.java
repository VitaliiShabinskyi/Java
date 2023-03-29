/**
 * 1. Поле publicField доступно из любого места программы и устанавливается на значение
 * 2. Поле protectedField доступно внутри этого класса, внутри того же пакета и в классах-наследниках,
 *    и устанавливается на значение
 * 3. Поле packagePrivateField доступно внутри этого класса и внутри того же пакета, и устанавливается на значение
 * 4. Поле privateField не доступно из-за модификатора private.
 *
 * 1. Метод publicMethod() доступен из любого места программы и вызывается.
 * 2. Метод protectedMethod() доступен внутри этого класса, внутри того же пакета и в классах-наследниках, и вызывается.
 * 3. Метод packagePrivateMethod() доступен внутри этого класса и внутри того же пакета, и вызывается.
 * 4. Метод privateMethod() не доступен из-за модификатора private.
 */

public class AccessModifiersDemo {
    public int publicField;
    protected int protectedField;
    int packagePrivateField;
    private int privateField;

    private void privateMethod() {
        System.out.println("private method");
    }

    void packagePrivateMethod() {
        System.out.println("package-private method");
    }

    protected void protectedMethod() {
        System.out.println("protected method");
    }

    public void publicMethod() {
        System.out.println("public method");
    }
}
