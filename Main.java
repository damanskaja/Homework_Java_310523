import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число от 1 до 7: ");
        int number = scanner.nextInt();

        if (number >= 1 && number <= 7) {
            String dayOfWeek;
            switch (number) {
                case 1:
                    dayOfWeek = "Monday";
                    break;
                case 2:
                    dayOfWeek = "Tuesday";
                    break;
                case 3:
                    dayOfWeek = "Wednesday";
                    break;
                case 4:
                    dayOfWeek = "Thursday";
                    break;
                case 5:
                    dayOfWeek = "Friday";
                    break;
                case 6:
                    dayOfWeek = "Saturday";
                    break;
                default:
                    dayOfWeek = "Sunday";
                    break;
            }
            System.out.println("День недели: " + dayOfWeek);
        } else {
            System.out.println("Ошибка: введено некорректное значение!");
        }
    }
}

