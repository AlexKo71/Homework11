public class Main {

    public static void leapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год - високосный");
        } else {
            System.out.println(year + " год - невисокосный");
        }
    }

    public static void line() {
        System.out.println("----------------------");
    }

    public static void applicationVersion(int clientOS, int clientDeviceYear) {
        if (clientDeviceYear >= 2015) {
            switch (clientOS) {
                case 0:
                    System.out.println("Установите версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите версию приложения для Android по ссылке");
                    break;
                default:
                    System.out.println("Не указана какая операционная система у пользователя");
            }
        } else {
            switch (clientOS) {
                case 0:
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                    break;
                default:
                    System.out.println("Не указана какая операционная система у пользователя");
            }

        }
    }

    public static void calcDeliveryDays(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется один день + срок доставки.");
        } else if (deliveryDistance <= 60) {
            System.out.println("Потребуется два дня + срок доставки.");
        } else if (deliveryDistance <= 100) {
            System.out.println("Потребуется три дня + срок доставки.");
        } else {
            System.out.println("Доставки нет");
        }

    }

    public static void main(String[] args) {
        System.out.println("Задача 1");
        int year = 2020;
        leapYear(year);
        line();
        System.out.println("Задача 2");
        int clientOS = 0;
        int clientDeviceYear = 2021;
        applicationVersion(clientOS, clientDeviceYear);
        line();
        System.out.println("Задача 3");
        int deliveryDistance = 100;
        calcDeliveryDays(deliveryDistance);
        line();

    }

}
