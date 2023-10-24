import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Classes
        Product product = null;
        // Переменные
        int humans;
        double price = 0;
        String products;
        float summ;

        // Сканеры
        Scanner scanner_humans = new Scanner(System.in);
        Scanner scanner_products = new Scanner(System.in);
        Scanner scanner_prices = new Scanner(System.in);

        // Поздороваемся!
        System.out.println("Доброго времени суток!\n" +
                "На скольких человек необходимо разделить счёт:");

        // Получаем количество людей
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
        // Получаем товары
        while (true) {
            System.out.println("Название товара:");
            if (scanner_products.hasNext()) {
                products = scanner_products.nextLine();
                if (!products.equalsIgnoreCase("завершить")) {
                    System.out.println("Название: " + products);
                    System.out.println("Укажите цену товара в формате рубли.копейки: ");
                    if (scanner_prices.hasNextDouble()) {
                        price = scanner_prices.nextDouble();
                        while (price <= 0) {
                            System.out.println("Значение не может быть 0 или меньше!");
                            price = scanner_prices.nextDouble();
                            if (price > 0) {
                                System.out.println("Цена: " + price);

                                break;
                            }
                        }
                    } else {
                        System.out.println("Кажется вы указали неверный формат!");
                        scanner_prices.hasNextDouble();
                    }
                } else {
                    // Отсылка на фильм Первому Игроку приготовиться)
                    System.out.println("Спасибо что играл в мою игру!");
                    break;
                }
            } else {
                System.out.println("Не получено данных о товаре!");
                scanner_products.nextLine();
            }
        }
    }
}