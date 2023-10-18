public class Main {

  public static void main(String[] args) {
    System.out.println("Задача №1");
    int OS = 0;
    if (OS == 1) {
      System.out.println("Установите версию приложения для Android по ссылке");
    } else if (OS == 0) {
      System.out.println("Установите версию приложения для iOS по ссылке");
    }
    System.out.println();

    System.out.println("Задача №2");
    int operationSystem = 1;
    int clientDeviceYear = 2015;
    if (operationSystem == 1) {
      if (clientDeviceYear <= 2015) {
        System.out.println("Установите облегченную версию приложения для Android по ссылке");
      } else {
        System.out.println("Установите версию приложения для Android по ссылке");
      }
    }
    if (operationSystem == 0) {
      if (clientDeviceYear <= 2015) {
        System.out.println("Установите облегченную версию приложения для iOS по ссылке");
      } else {
        System.out.println("Установите версию приложения для iOS по ссылке");
      }
    }
    System.out.println();

    System.out.println("Задача №3");
    int year = 2000;
    boolean leapyear = (year > 1584 && ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)));
    if (leapyear) {
      System.out.println("Год " + year + " високосный");
    } else {
      System.out.println("Год " + year + " не високосный");
    }
    System.out.println();

    System.out.println("Задача №4");
    int deliveryDistance = 101;
    int days = 1;
    if (deliveryDistance < 20) {
      System.out.println("Потребуется дней " + days);
    } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
      System.out.println("Потребуется дней " + (days + 1));
    } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
      System.out.println("Потребуется дней " + (days + 2));
    } else {
      System.out.println("Доставки нет");
    }
    System.out.println();

    System.out.println("Задача №5");
    int monthNumber = 2;
    switch (monthNumber) {
      case 12:
      case 1:
      case 2:
        System.out.println("Зимний месяц");
        break;
      case 3:
      case 4:
      case 5:
        System.out.println("Весенний месяц");
        break;
      case 6:
      case 7:
      case 8:
        System.out.println("Летний месяц");
        break;
      case 9:
      case 10:
      case 11:
        System.out.println("Осенний месяц");
        break;
      default:
        System.out.println("Такого месяца не существует");
    }
  }
}
