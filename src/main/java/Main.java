import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // List
        ArrayList<Product> productsName = new ArrayList<Product>();

        // Переменные
        int humans;
        double price;
        String products;
        float summ = 0;

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

        // Получаем товары
        while (true) {
            System.out.println("Название товара:");
            if (scanner_products.hasNext()) {
                products = scanner_products.nextLine();
                if (!products.equalsIgnoreCase("завершить")) {
                    productsName.add(new Product(products));
                    System.out.println("Укажите цену товара в формате рубли.копейки: ");
                    if (scanner_prices.hasNextDouble()) {
                        price = scanner_prices.nextDouble();
                        while (price <= 0) {
                            System.out.println("Значение не может быть 0 или меньше!");
                            price = scanner_prices.nextDouble();
                            if (price > 0) {
                                System.out.println(String.format("Цена: %.2f", price));
                                break;
                            }
                        }
                        summ += price;
                        System.out.println("Добавленные товары:");
                        for (Product name : productsName) {
                            System.out.println("* " + productsName.get(i).productName);
                        }
                        System.out.println("Сумма: " + String.format("%.2f", summ));
                    } else {
                        System.out.println("Кажется вы указали неверный формат!");
                        scanner_prices.hasNextDouble();
                    }
                } else {
                    float forPerson = summ / humans;
                    int rubles = (int) forPerson;

                    System.out.println("Сумма на каждого человека " + String.format("%.2f", forPerson) + " " + grammar(rubles));
                    break;
                }
            } else {
                System.out.println("Не получено данных о товаре!");
                scanner_products.nextLine();
            }
        }
    }

    private static String grammar(int rubles) {
        if (lastIndexRub(rubles).equals("0")) {
            return "рублей";
        } else if (lastIndexRub(rubles).equals("1")) {
            return "рубль";
        } else if (lastIndexRub(rubles).equals("2") || lastIndexRub(rubles).equals("3") || lastIndexRub(rubles).equals("4")) {
            return "рубля";
        } else {
            return "рублей";
        }
    }

    private static String lastIndexRub(int rubles) {
        String str = String.valueOf(rubles);
        str.substring(str.length() - 1);
        return str;
    }
}