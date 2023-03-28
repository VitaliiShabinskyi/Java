public class Human {
    String name;
    String position;

    public Human(String name, String position) {                      // Конструктор
        this.name = name;
        this.position = position;
    }

    public void out(){
        System.out.println("Name : " + name +
                " Position : " + position);
    }


}

