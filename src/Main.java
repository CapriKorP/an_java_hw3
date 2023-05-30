import java.util.Scanner;

public class Main {
    public static int calcService(int year) {

        int numb = ((year % 400 == 0 && year % 100 == 0) || (year % 4 == 0 && year % 100 > 0)) ? 1 : -1;
        return numb;
    }

    public static void main(String[] args) {

        while (true) {
            System.out.println(">>>Добро пожаловать в игру \"Угадай год!\"");
            System.out.println("Для начала наберите \"Y\", для выхода \"N\"");

            Scanner scanner = new Scanner(System.in);

            String start = scanner.nextLine();
            if (start.equals("Y")) {

                int gamePoints = 0;

                while (true) {
                    System.out.print("Введите год в формате  \"уууу\" ");

                    int year = scanner.nextInt();

                    if (year < 1000 || year > 9999) {
                        System.out.println("Неверно введен год");
                        continue;
                    }
                    System.out.print("Введите количество дней в году(365 или 366): ");

                    int numb = scanner.nextInt();
                    int x = calcService(year);

                    if (numb != 365 && numb != 366) {
                        System.out.println("Введено неправильное количество дней!");
                    } else if ((x == 1 && numb == 365) || (x == -1 && numb == 366)) {
                        System.out.println("Вы допустили ошибку! Итоговое количество очков " + gamePoints);
                        System.out.println("");
                        break;
                    } else {
                        gamePoints++;
                    }
                }
            } else if (start.equals("N")) {
                System.out.println("До свидания!");
                break;
            }
        }
    }
}
