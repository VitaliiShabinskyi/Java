public class Car {
    public String model;
    public int speed;
    public String color;

    public Car(String model, int speed, String color) {
        this.model = model;
        this.speed = speed;
        this.color = color;
    }

    public void out() {
        System.out.println("Model: " + model + "\nSpeed: " + speed + "\nColor: " + color);
    }
}
