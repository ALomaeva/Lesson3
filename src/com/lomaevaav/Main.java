package com.lomaevaav;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int otvet;
        do {
            Random rand = new Random();
            int zagadChislo = rand.nextInt(10);
            //System.out.println("Загаданное число" + zagadChislo);
            System.out.println("Введите число от 0 до 9");
            for (int i = 0; i < 3; i++) {
                int vvedenChislo = sc.nextInt();
                if (vvedenChislo == zagadChislo) {
                    System.out.println("Победа!");
                    break;
                } else {
                    if (i == 2) {
                        System.out.println("Вы проиграли");
                        break;
                    }
                    if (vvedenChislo < zagadChislo) {
                        System.out.println("Попробуйте число больше");
                    } else {
                        System.out.println("Попробуйте число меньше");
                    }
                }
            }
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            otvet = sc.nextInt();
        }
        while (otvet==1);
        sc.close();
    }
}