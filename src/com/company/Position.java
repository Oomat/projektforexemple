package com.company;

import java.util.Scanner;

public class Position {
    Scanner in = new Scanner(System.in);

    public void method() {
          Medications medications = new Medications();
          Necessarymedicines necessarymedicines = new Necessarymedicines();
          Salesreport salesreport = new Salesreport();
        int start = 0;
        do {
            System.out.println("1. Управляющий\n" +
                    "2. Работник\n" +
                    "0. Выход");
            System.out.println("Для запуска программы, пожалуйста введите число с соответствующим типом аккаунта: >>>  ");
            int account = in.nextInt();
            if (account == 1) {
                start = 1;
            } else if (account == 2) {
                start = 2;
            } else if (account == 0) {
                System.out.println("Программа завершена.");
                break;
            } else {
                System.out.println("Данные неправильные.");
            }

        } while (start == 0);

        if (start != 0) {
            System.out.println("Логин: >>> ");
            String login = in.next();
            System.out.println("Пароль: >>> ");
            String password = in.next();
        }

        if (start == 1) {
            System.out.println("Добро пожаловать управляющий" + "\n" +
                    "Введите номер для работы если\n" +
                    "если закончили, то наберите 6:\n" +
                    "1. Показать список всего ассортимента лекарств \n" +
                    "\n" +
                    "2. Количество товаров \n" +
                    "\n" +
                    "3. Показать самые дорогие лекарства\n" +
                    "\n" +
                    "4. Показать проходимые лекарства\n" +
                    "\n" +
                    "5. Показать отчет по продажам\n" +
                    "\n" +
                    "6. Выход");

            int menu_dir = in.nextInt();

        } else if (start == 2) {
            System.out.println("Добро пожаловать работник!" + "\n" +
                    "Введите номер для работы, если\n" +
                    "закончили, то наберите 9:\n" +
                    "1. Показать весь список ассортимента лекарств\n" +
                    "\n" +
                    "2. Найти нужные лекарства\n" +
                    "\n" +
                    "3. Показать отчет по продажам\n" +
                    "\n" +
                    "4. Выполнить продажу лекарств\n" +
                    "\n" +
                    "5. Список проданных товаров \n" +
                    "\n" +
                    "6. Товары на заказ\n" +
                    "\n" +
                    "7. Удалить заказ\n" +
                    "\n" +
                    "8. Выход\n" +
                    "Выбор меню: >>> ");
            int menu_emp = in.nextInt();
            if (menu_emp == 1) {
               medications.a();
            } else if (menu_emp == 2) {
                necessarymedicines.as2();
            }else if (menu_emp == 3){
                salesreport.as3();
            }
        }
    }

}

