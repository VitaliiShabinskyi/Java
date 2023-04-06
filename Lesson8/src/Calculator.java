import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Pattern pattern = Pattern.compile("(-?\\d+(\\.\\d+)?)\\s*([+\\-*/^%!])\\s*(-?\\d+(\\.\\d+)?)");
        double result = 0;
        System.out.println("e (exit) - выход\nc (clear) - очистить\n^ - возведение в степень\n@ - корень числа\n!0 - факториал");

        while (true) {
            if (result != 0) System.out.print("Введите выражение: " + result);
            else System.out.print("Введите выражение: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit") || input.equalsIgnoreCase("e")) {
                System.out.println("Программа завершена.");
                break;
            }
            if (input.equalsIgnoreCase("c") || input.equalsIgnoreCase("clear")) {
                result = 0;
                continue;
            }

            if (result != 0) {
                input = result + input;
            }

            Pattern pattern = Pattern.compile("(-?\\d+(\\.\\d+)?)\\s*([+\\-*/^%@!])\\s*(-?\\d+(\\.\\d+)?)");
            Matcher matcher = pattern.matcher(input);
            if (matcher.matches()) {
                double num1 = result !=0 ? result : Double.parseDouble(matcher.group(1));
                double  num2 = Double.parseDouble(matcher.group(4));

                String operator = matcher.group(3);
                switch (operator) {
                    case "+":
                        result = num1 + num2;
                        break;
                    case "-":
                        result = num1 - num2;
                        break;
                    case "*":
                        result = num1 * num2;
                        break;
                    case "/":
                        if (num2 == 0) {
                            System.out.println("Деление на ноль невозможно!");
                        } else {
                            result = num1 / num2;
                        }
                        break;
                    case "^":
                        result = Math.pow(num1, num2);
                        break;
                    case "@":
                        result = Math.pow(num1, 1/num2);
                        break;
                    case "%":
                        result = num1 % num2;
                        break;
                    case "!":
                        result = getFactorial((int)num1);
                        break;
                    default:
                        System.out.println("Ошибка: неподдерживаемый оператор: " + operator);
                        continue;
                }

                System.out.println("Результат: " + result);
            } else {
                System.out.println("Ошибка: неверный формат выражения");
            }
        }
    }

    public static int getFactorial(int f) {
        if (f <= 1) {
            return 1;
        }
        else {
            return f * getFactorial(f - 1);
        }
    }
}
