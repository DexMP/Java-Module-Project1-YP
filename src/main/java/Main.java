import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Переменные
        int humans;
        double price;
        String products = null;
        float summ;

        // Сканеры
        Scanner scanner_humans = new Scanner(System.in);
        Scanner scanner_products = new Scanner(System.in);

        // Поздороваемся!
        System.out.println("Доброго времени суток!\n" +
                "На скольких человек необходимо разделить счёт:");

        // Бесконечный цикл который позволяет нам не вывалиться из программы и спрашивать пользователя количество людей
        while (true) {
            if (scanner_humans.hasNextInt()) {
                humans = scanner_humans.nextInt();
                while (humans <= 1) {
                    System.out.println("Количество людей должно быть более 1");
                    humans = scanner_humans.nextInt();
                    if (humans > 1) break;
                }
                break;
            } else {
                System.out.println("Возможно вы ввели не число, попробуйте ещё раз!");
                scanner_humans.nextLine();
            }
        }

        System.out.println(humans);

        System.out.println("Что вы заказывали:");

        while (true) {
            if (scanner_products.hasNext()) {
                // Название
                products = scanner_products.nextLine();
                System.out.println("Сколько стоит " + products + ":");
                while (true) {
                    if (scanner_products.hasNext()) {
                        // Ценник
                        price = scanner_products.nextDouble();
                        Product product1 = new Product(products, price);
                        System.out.println(product1.productName + " = " + product1.productPrice);
                        break;
                    } else {
                        System.out.println("Кого ты хочешь обмануть? Вводи сумму:");
                        price = scanner_products.nextDouble();
                    }
                }
                break;
            } else {
                System.out.println("Кажется строка пустая! Попробуйте ещё раз:");
                products = scanner_products.nextLine();
            }
        }
    }
}