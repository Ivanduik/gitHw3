//Завдання 2
//
//        Використовуючи IntelliJ IDEA, створіть клас SumMin. Дано два числа A та B (A<B).
//        Виведіть суму всіх чисел, які розташовані між цими числами на екран.
//        Дано два числа A та B (A<B).
//        Виведіть усі непарні значення, які розташовані між цими числами.
import java.util.Scanner;
public class SumMin {
    public static void main(String[] arg) {
        Scanner inp = new Scanner(System.in);
        int a = 0, b = 0, sum = 0;
        StringBuilder odd = new StringBuilder();
        String even = "";

        System.out.println("Введить  A і B, числа повині бути цілі та A < B ");
        if (!inp.hasNextInt()) {
            System.out.println(" Введено не коректне значення !!! ");
            return;
        }
        a = inp.nextInt();

        if (!inp.hasNextInt()) {
            System.out.println(" Введено не коректне значення !!! ");
            return;
        }
        b = inp.nextInt();

        if (!(a < b)) {
            System.out.println(" Не виконана умова A < B !!! ");
            return;
        }

        for (int i = a + 1; i < b; i++) {
            sum += i;
            if (((i % 2) == 0) && (i != 0))               // (a & 1) != 1- можно и так записать,  Исключаем 0 из решения
                even += i + " ";        // тут для четных и нечетных можно сделать в отдельных циклах
            else if (i != 0)                              // нужно уточнять тех задание
                odd.append(Integer.toString(i)).append(" ");// Тут нашел новый метод составлять строки.
        }
        System.out.printf("Сума всіх чисел, які розташовані між %d і %d = %d %n", a, b, sum);
        System.out.printf("Парні числа, які розташовані між %d і %d - %s  %n", a, b, even);
        System.out.printf("Непарні числа, які розташовані між %d і %d - %s %n", a, b, odd);
    }
}
//    Введить  A і B, числа повині бути цілі та A < B
//        -10
//        10
//        Сума всіх чисел, які розташовані між -10 і 10 = 0
//        Парні числа, які розташовані між -10 і 10 - -8 -6 -4 -2 2 4 6 8
//        Непарні числа, які розташовані між -10 і 10 - -9 -7 -5 -3 -1 1 3 5 7 9