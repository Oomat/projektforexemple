package com.company;

import java.util.Scanner;

public class Clents {
    Scanner in = new Scanner(System.in);

    int start = 0;
    {
        System.out.println("1. Головная боль\n" +
                "2. Кровотечение" +"\n" +
                "0. Выход");
        System.out.println("Для запуска программы, пожалуйста введите число с соответствующим типом аккаунта: >>>  ");
        int numberOfIllness = in.nextInt();
        if (numberOfIllness == 1) {
            start = 1;
        } else if (numberOfIllness == 2) {
            start = 2;
        } else if (numberOfIllness == 0) {
            System.out.println("Программа завершена.");
        } else {
            System.out.println("Данные неправильные.");
        }
        if (start == 1) {
            System.out.println("Вы должны купить парацтамол");
        }else {
            System.out.println("Вы должны купить бинт");
        }
    }

}
