public class Cat {
    private int age;
    private float weight;
    private String name;

    public Cat(int age, float weight, String name) {
        this.age = age;
        this.weight = weight;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void out() {
        System.out.println("Cat name: " + name);
        System.out.println("Cat age: " + age);
        System.out.println("Cat weight: " + weight);
    }
}
