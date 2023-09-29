import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Поздороваемся!
        System.out.println("Доброго времени суток!\n" +
                "На скольких человек необходимо разделить счёт:");

        // Переменная хранящая людей (да-да как криокамера)
        int humans;

        // Сканер
        Scanner scanner_humans = new Scanner(System.in);

        // Бесконечный цикл который позволяет нам не вывалиться из программы и спрашивать пользователя количество людей
        while (true) {
            if (scanner_humans.hasNextInt()) {
                humans = scanner_humans.nextInt();
                while (humans <= 1) {
                    System.out.println("Количество людей должно быть более 1");
                    humans = scanner_humans.nextInt();
                    if (humans > 1) {
                        break;
                    } else {
                        System.out.println("Введено не число!");
                    }
                }
                break;
            } else {
                System.out.println("Возможно вы ввели не число, попробуйте ещё раз!");
                scanner_humans.nextLine();
            }
        }



        System.out.println(humans);
    }
}