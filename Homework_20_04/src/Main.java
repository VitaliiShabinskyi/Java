/**
 * Сделать класс для управления массивом из 10 элементов.
 * Реализовать операции: вставка, удаление, сортировка, поиск, вывод в строку.
 */
public class Main {
    public static void main(String[] args) {
        ArrayManager manager = new ArrayManager();

        manager.insert(0, 10);
        manager.insert(1, 5);
        manager.insert(2, 7);
        manager.insert(3, 2);
        manager.insert(4, 9);
        manager.insert(5, 8);
        manager.insert(6, 1);
        manager.insert(7, 4);
        manager.insert(8, 3);
        manager.insert(9, 6);

        System.out.println(manager.toString()); // [10, 5, 7, 2, 9, 8, 1, 4, 3, 6]

        manager.delete(2);

        System.out.println(manager.toString()); // [10, 5, 2, 9, 8, 1, 4, 3, 6, 0]

        manager.sort();

        System.out.println(manager.toString()); // [0, 1, 2, 3, 4, 5, 6, 8, 9, 10]

        int index = manager.search(8);

        System.out.println(index); // 7
    }

}
