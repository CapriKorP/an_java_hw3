import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите год в формате  \"уууу\"");
        Scanner scaner = new Scanner(System.in);
        int year = scaner.nextInt();

        if(year % 4 == 0 ) {
            System.out.println("Количество дней в году - 366");
        } else {
            System.out.println("Количество дней в году - 365");
        }
    }
}
