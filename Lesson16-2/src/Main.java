public class Main {

    /*
    Правило
    Родителю можно присвоить объект его потомка. Правило допускает присвоение по понижение в генетическом древе,
    обратно правило не работает
     */

    /*
    Теория
    Класс Object является родителем для любого Java класса, а значит ему мы можем присвоить абсолютно любой объект
     */

    public static void main(String[] args) {
        Human human = new Teacher();
        Human human1 = new Student();
        //Teacher teacher = new Human();       Обратно правило не работает
        Object object = new Human();
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.display();

        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Привет!");
        arrayList1.add("Обобщения это классно");
        arrayList1.display();
    }
}