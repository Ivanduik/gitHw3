public class Printing_Shapes {
    public static void main(String[] arg) {
        int shapes = 5;

        System.out.println("Square fill:");
        for (int i = 0; i < shapes; i++) {
            System.out.printf("%n");
            for (int j = 0; j < shapes; j++) {
                System.out.print("*  ");
            }
        }

        System.out.printf("%n Right triangle fill");
        for (int i = 0; i < shapes; i++) {
            System.out.printf("%n");
            for (int j = 0; j <= i; j++)
                System.out.print("*  ");
        }


        System.out.printf("%n Equilateral triangle");
        // можно было проще сделать, но тогда больше похоже на равнобедренный треугольник,
        // хотя и тут не совсем равносторонний, но число звездочек правильное.
        for (int i = 0; i <= shapes; i++) { //задаем количество единиц сторон в высоту
            int k = 0; // инициализируем счетчик масштабирования
            for (int j = 0; j < shapes * 2; j++) // так как при выводе расстояние между символов в строке и между строк
                // разное, то количество символов в строке масштабируем в 2 раза, чтобы вывести на экран
                if (j <= (shapes - i)) // проверяем для вывода пробелов с учетом номера выводимой строки
                    //  так как мы увеличили в 2 разa, то сесередина у нас будет при (n*2-n)=0
                    // следовательно (n*2-n)<0 у нас будет до середины, а чтобы с каждой строкой
                    // у нас было на 1 символ меньше отнимаем номер строки
                    System.out.print("  ");
                else if ((j - shapes - i) < 0) { //сесередина у нас будет при (n*2-n)=0, когда (n*2-n)>0 то значит
                    //мы прошли середину и нужно выводить *, а чтобы с каждой строкой выводилось на 1 символ больше,
                    // отнимаем от количества строк 1
                    if (k % 2 == 0) {// так как мы масштабировали, то теперь выводим через 1,
                        // в данном случае каждое четное
                        System.out.print("* ");
                    } else System.out.print("  ");
                    k++;
                }
            System.out.printf("%n");
        }

        System.out.println("Rhomb");// реализовано, как предложил Алексей через Math.abs()
       for(int i=-shapes; i<=shapes;i++){
           for(int j=-shapes;j<=shapes;j++){
               if((Math.abs(j) - shapes + Math.abs(i)) < 0)
                   System.out.printf("*  ");
               else System.out.printf("   ");
           }
           System.out.printf("%n");
       }
    }


}
