public class Car {
    // Поля класса
    private String brand;
    private int age;
    private double price;
    private boolean isEcological;
    // Демонстрируем полиморфизм объектов
    /**
     * Конструктор для создания объекта с тремя переменными
     * @param brand бренд
     * @param age год производства
     * @param price цена
     */
    public Car(String brand, int age, double price) {
        this.brand = brand;
        this.age = age;
        this.price = price;
    }

    /**
     * Конструктор для создания объекта с четырьмя переменными
     * @param brand бренд
     * @param age год производства
     * @param price цена
     * @param isEcological экологичность
     */
    public Car(String brand, int age, double price, boolean isEcological) {
        this.brand = brand;
        this.age = age;
        this.price = price;
        this.isEcological = isEcological;
    }
    /*
    Акссесоры(геттеры и сеттеры) - специальные методы для работы с полями класса. Идея - поля приватные, т.е. доступ можно
    получить только внутри класса, поэтому мы создаем в классе метод, который возвращает значение приватной переменной,
    а сам метод делаем публичным.
    Через геттеры можно получить значение конкретного поля объекта, а через сеттеры изменить его.
     */
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isEcological() {
        return isEcological;
    }

    public void setEcological(boolean ecological) {
        isEcological = ecological;
    }
}