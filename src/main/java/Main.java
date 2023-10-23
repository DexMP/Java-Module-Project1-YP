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
        System.out.println("Что было в заказе:");
        // Получаем товары
        while (true) {
            // Наименование
            if (scanner_products.hasNext()) {
                products = scanner_products.nextLine();
                while (products.isEmpty()) {
                    System.out.println("Нет данных");
                    products = scanner_products.nextLine();
                    if (!products.isEmpty()) {
                        break;
                    }
                }

                System.out.println("Цена товара в формате 'рубли.копейки':");

                // Цена
                if (scanner_prices.hasNextDouble()) {
                    price = scanner_prices.nextDouble();
                    while (price <= 1) {
                        System.out.println("Значение не может быть меньше 1");
                        price = scanner_products.nextDouble();
                        if (price > 1) {
                            product = new Product(products, price);
                            break;
                        }
                    }
                } else {
                    System.out.println("Неверный формат записи");
                    scanner_prices.hasNextDouble();
                }
            } else {
                System.out.println("Не удалось прочитать, попробуйте снова");
                scanner_products.nextLine();
            }
            if (product != null) {
                System.out.println("Наиименование" + product.productName + "\nЦена: " + product.productPrice);
            }
        }
    }
}