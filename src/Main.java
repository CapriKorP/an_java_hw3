import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int gamePoints = 0;

        while (true) {
            System.out.print("Введите год в формате  \"уууу\" ");
            Scanner scaner = new Scanner(System.in);
            int year = scaner.nextInt();
            System.out.print("Введите количество дней в годум(365 или 366): ");
            Scanner scanner = new Scanner(System.in);
            int numb = scanner.nextInt();

            if (year % 4 != 0 && numb == 366) {
                System.out.println("Количсетво очков " + gamePoints);
                break;
            } else if (year % 4 == 0 && numb == 365) {
                System.out.println("Количсетво очков " + gamePoints);
                break;
            } else if (numb != 365 && numb != 366) {
                System.out.println("Указано неправильное количество дней.");
            } else {
                gamePoints = gamePoints + 1;
            }
        }
    }
}