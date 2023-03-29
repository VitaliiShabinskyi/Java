public class Animal {
    private int age;
    private double weight;
    private String name;
    private final int id;
    private static int nextId = 1;

    public Animal(int age, double weight, String name) {
        this.age = age;
        this.weight = weight;
        this.name = name;
        id = nextId++;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void out() {
        System.out.println("Name: " + name + "\tAge: " + age + "\tWeight: " + weight + "\tid: " + id);
    }

}
