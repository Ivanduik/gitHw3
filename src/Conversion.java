//Завдання 3
//
//        Використовуючи IntelliJ IDEA, створіть клас Conversion. Напишіть програму, яка конвертуватиме валюти.
//        Користувач вводить:
//        1)      суму грошей у певній валюті;
//        2)      курс конвертації в іншу валюту.
//        Організуйте виведення результату операції конвертування валюти на екран.
import java.util.Scanner;
public class Conversion {
    static double inpDouble() {// дробный знак - ",", наверное зависит, что установлено в винде
        Scanner inp = new Scanner(System.in);
        while (!inp.hasNextDouble()) {
            System.out.printf("Ви ввели некоректне значення!!!%nCпробуйте ще раз");
            inp.next();
        }
        return inp.nextDouble();
    }
    public static boolean currentVal(double val) {
        if (val <=0) System.out.print("Некоректне значення");
        return val > 0 ? true : false;
    }
    static void conversionPrice(double currencyVal, double course) {
        System.out.printf("Сума після конвертаціїї: %.3f", currencyVal * course);
    }
    public static void main(String[] arg) {
        double currencyVal, course;
        System.out.print("Введить суму валюти:");
        currencyVal = inpDouble();
        if (!currentVal(currencyVal)) return;
        System.out.print("Введить курс конвертації в іншу валюту:");
        course = inpDouble();
        if (!currentVal(course)) return;
        conversionPrice(currencyVal, course);
    }
//тут получилось, чисто функциональное.
//коечно можно еще пересложить по методам, весь код  сложить в метод, чтобы почти ООП, но думаю лишне
}
