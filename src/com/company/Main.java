package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
int num = 10;
        System.out.println(num);
        String word = "bye word";
        System.out.println(word);
        final int costNum = 25;
        if (num < 0){
            System.out.println("Вы сохранили отрицательное число");
        }else if (num > 0){
            System.out.println("Вы сохранили положительное число");
        }else {
            System.out.println("Вы сохранили нуль");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя");
        String name = scanner.nextLine();
        if (name.equals("Alisher")){
            System.out.println("добро пожаловать Алишер");
        }
    }
}
