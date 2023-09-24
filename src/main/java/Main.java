import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Поздороваемся!
        System.out.print("Доброго времени суток!\n" +
                "На скольких человек необходимо разделить счёт:");

        // Переменная хранящая людей (да-да как криокамера)
        int humans;

        // Переменная имён продуктов

        // Переменная цен продуктов
        Scanner scanner_humans = new Scanner(System.in);
        if (scanner_humans.hasNextInt()) {
            humans = scanner_humans.nextInt();
            // Проверка на корректное значение человек
            correct_humens(humans);
        } else {
            System.out.println("Возможно вы ввели не число, попробуйте ещё раз!");
        }
    }

    private static boolean compliance_check(int humans) {
        return humans > 1;
    }

    private static void correct_humens(int humans) {
        if (compliance_check(humans)){

            // Дополнительная проверка количества людей, что бы не ударить в грязь лицом перед грамматикой
            if(humans == 2 || humans == 3 || humans == 4){
                System.out.print("Записал, " + humans + " человека.");
            } else {
                System.out.print("Записал, " + humans + " человек.");
            }
        } else {
            System.out.print("Некорректное значение! Количество человек должно быть больше 1");
        }
    }
}