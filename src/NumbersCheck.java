//Завдання 4
//
//        Використовуючи IntelliJ IDEA, створіть клас NumbersCheck. Напишіть метод, який визначатиме:
//        1)      чи є введене число позитивним, чи негативним;
//        2)      чи є воно простим (використовуйте техніку перебору значень).
//        Просте число – це натуральне число, яке ділиться на 1 й саме на себе. Щоби визначити просте число чи ні, варто знайти всі його цілі дільники. Якщо дільників більше 2-х, то воно не просте;
//        3)      чи ділиться воно на 2, 5, 3, 6, 9 без залишку.

import java.util.Scanner;

public class NumbersCheck {
    static int inpInt() {
        Scanner inp = new Scanner(System.in);
        while (!inp.hasNextInt()) {
            System.out.printf("Ви ввели некоректне значення!!!%nCпробуйте ще раз");
            inp.next();
        }
        return inp.nextInt();
    }

    static boolean positiveNegative(int a) {

        return a > 0 ? true : false;
    }

    static boolean primeNumber(int number) {
        int i = 2;
        if (number > 0 && number <= 2) return true;
        else
            while (i <= Math.sqrt(number)) {
                if ((number % i) == 0)
                    return false;
                i++;
            }
        return true;
    }

    static void div25369(int number) {
        String numbersDiv = "2 5 3 6 9";  //пишем в строке через пробел на какие числа делитью
        System.out.printf("Чи ділиться %d на %s%n", number, numbersDiv);
        int i = 0;
        String msg = "", msgRes = ""; //промежуточное значение и результат
        while (i < numbersDiv.length()) {//перебираем строку ищем цифры между разделителем
            String ch = numbersDiv.substring(i, i + 1); //получаем символ строки
            if (!ch.equals(" ")) { //сравниваем с разделителем
                msg += numbersDiv.substring(i, i + 1); // если не разделитель, значит число, добавляем в промежуточную переменную
                if (i != numbersDiv.length() - 1) { //проверяем на последний символ, оно по идеи число
                    i++;
                    continue;// если не последнее переходим на новый круг
                }
            }
            i++;
            if ((number % Integer.valueOf(msg)) == 0)
                msgRes += msg + " "; //формируем сообщение
            msg = "";//обнуляем промежуточную переменную
        }

        if (msgRes.length() == 0)
            System.out.printf("Не ділиться");
        else
            System.out.println("Ділиться на " + msgRes);

    }

    public static void main(String[] arg) {
        int num;
        System.out.printf("Введить ціле число:");
        num = inpInt();
        if (!positiveNegative(num))
            System.out.printf("Негативне значення, не можливо визначити просте чи ні, це число%n");
        else if (primeNumber(num)) System.out.printf("Число %d - просте%n", num);
        else System.out.printf("Число %d - не просте%n", num);
        div25369(num);
    }
}
