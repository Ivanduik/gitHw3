import java.util.Scanner;

//Завдання 5
//        Використовуючи IntelliJ IDEA, створіть клас Calculator.
//        Створіть метод з ім'ям calculate, який приймає як параметри три цілочислові значення
//        та повертає значення кожного аргументу, поділеного на 5.
public class Calculator {
    static String calculate(int a, int b, int c) {
        String ret = "";
        ret += a / 5.0 + "_"+b / 5.0 + "_"+ c / 5.0 + "_";
        return ret;
    }

    static int inputInt() {
        Scanner inp = new Scanner(System.in);
        while (!inp.hasNextInt()) {
            System.out.printf("You input not integer value !!!%nTry again%n");
            inp.next();
        }
        return inp.nextInt();
    }

    public static void main(String[] arg) {
        String strNum = "", num = "";
        int a, b, c;
        System.out.println("Введить цілі числа А В С:");
        System.out.print("Введить А:");
        a = inputInt();
        System.out.print("Введить  В:");
        b = inputInt();
        System.out.print("Введить  С:");
        c = inputInt();
        strNum = calculate(a, b, c);
        int i = 0;
        double numD = 0;
        System.out.println("Результат роботи функції -- " + strNum);
        while (i < strNum.length()) {
            if (strNum.charAt(i) != '_') {
                num += strNum.substring(i, i + 1);
                i++;
                continue;
            }
            numD = Double.parseDouble(num);
            i++;
            num = "";
            System.out.printf("Результат -- %f%n", numD);
        }
    }
}
