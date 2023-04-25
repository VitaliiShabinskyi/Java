import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lottery {
    // Поля класса
    private Scanner scan = new Scanner(System.in);                                                  // Переменная для чтения из консоли
    private Random rand = new Random();                                                             // Переменная для генерации псевдослучайного числа
    private int[] winArray = new int[6];                                                            // Создаем массив из 5 элементов, в который запишем выигрышную комбинацию
    private int[] userArray = new int[6];                                                           // Создаем массив из 5 элементов, в который запишем комбинацию пользователя
    private int bound;                                                                              // Переменная для указания диапазона чисел в последовательности
    private int countPositions = 0;                                                                 // Переменная для подсчета угаданных позиций числа

    /**
     * Метод для генерации выигрышной комбинации
     * @param bound диапазон чисел в комбинации
     */
    public void generateWinCombination(int bound) {
        for (int i = 0; i < winArray.length; i++){                                               // Цикл для генерации чисел выигрышной комбинации
            int random = rand.nextInt(1, bound);
            if (searchInArray(winArray, random)) {
                i--;
            } else {
                winArray[i] = random;                                          // присвоение случайного значения каждому элементу массива
            }

        }
        Arrays.sort(winArray);
        this.bound = bound;                                                                      // this.bound  ссылается на поле bound и присваивает ему локальную переменную bound
    }

    /**
     * Метод для ввода комбинации пользователя
     */
    public void userCombination(){
        System.out.println("Введите 6 чисел в диапазоне от 1 до " + bound);
        for (int i = 0; i < userArray.length; i++) {
            System.out.print("Число №" + (i+1) + ": ");
            int input = scan.nextInt();
            if (input < 1 || input > bound) {
                System.out.println("Вы ввели некорректное число");
                i--;
            } else if (searchInArray(userArray, input)) {
                System.out.println("Вы уже ввели такое число");
                i--;
            } else {
                userArray[i] = input;
            }
        }
        Arrays.sort(userArray);
    }

    /**
     * Метод для проверки комбинации пользователя
     */
    public void checkCombination(){
        for (int i = 0; i < winArray.length; i++) {
            for (int j = 0; j < userArray.length; j++) {
                if(winArray[i] == userArray[j]){
                    countPositions++;
                }
            }
        }
    }

    /**
     * Проверка чисел на дубли
     * @param arr массив
     * @param value число
     * @return boolean
     */
    private boolean searchInArray(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (value == arr[i]) {
                return true;
            }
        }
        return false;
    }

    /**
     *Метод для проверки выигрышной комбинации(жульничества)
     */
    public void cheat(){
        for (int i = 0; i < winArray.length; i++) {
            System.out.print(winArray[i] + " ");
        }
        System.out.println("\n");
    }

    /**
     * Метод для возвращения числа угаданных позиций
     * @return количество угаданных позиций
     */
    public int guessedPositions(){
        return countPositions;                                                                                // Возвращаем поле класса, в котором записано количество угаданных позиций
    }
}