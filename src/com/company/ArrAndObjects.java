package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ArrAndObjects {

    public static void Pull() {
        //humanisacion();
        //arrstr( );
        //arrstrmini();
        arrbig();



    }

    public static void humanisacion() {

        //Бабушки и дедушки
        Human marina = new Human("Marina", 59, false);
        Human konstantin = new Human("Konstantin", 61, true);
        Human galina = new Human("Galina", 50, false);
        Human vladislav = new Human("Vladislav", 49, true);
        //Родители
        Human kirill = new Human("Kirill", 27, true, marina, konstantin);
        Human lolita = new Human("Lolita", 26, false, galina, vladislav);
        //Дети
        Human pupuh = new Human("Pupuh", 1, true, lolita, kirill, vladislav, konstantin, galina, marina);
        Human pupuher = new Human("Pupuher", 1, true, lolita, kirill, vladislav, konstantin, galina, marina);

        //Консоль
        System.out.println("Введите запрос по имени из: \n" +
                "Пупух / Пупухер / Кирилл / Лолита / Марина \n" +
                "Константин / Владислав / Галина");
        Scanner s1 = new Scanner(System.in);
        String vvod = s1.nextLine( );
        if (vvod.equalsIgnoreCase("Пупух")) {
            System.out.println(pupuh.toBook( ));
        } else if (vvod.equalsIgnoreCase("Пупухер")) {
            System.out.println(pupuher.toBook( ));
        } else if (vvod.equalsIgnoreCase("Кирилл")) {
            System.out.println(kirill.toBook( ));
        } else if (vvod.equalsIgnoreCase("Лолита")) {
            System.out.println(lolita.toBook( ));
        } else if (vvod.equalsIgnoreCase("Марина")) {
            System.out.println(marina.toBook( ));
        } else if (vvod.equalsIgnoreCase("Константин")) {
            System.out.println(konstantin.toBook( ));
        } else if (vvod.equalsIgnoreCase("Галина")) {
            System.out.println(galina.toBook( ));
        } else if (vvod.equalsIgnoreCase("Владислав")) {
            System.out.println(vladislav.toBook( ));
        } else {
            System.out.println("Error. New tray pls:");
        }


    }

    public static void arrstr() {
        String arr1[] = new String[10];
        System.out.println("Введите 8 строк в массив:");
        arr1[0] = "one";
        arr1[1] = "two";

        for (int i = 2; i < arr1.length; i++) {
            System.out.println("Введите ячейку - " + i);
            Scanner arrsc = new Scanner(System.in);
            arr1[i] = arrsc.nextLine();
        }
        System.out.println(Arrays.toString(arr1));
        arrstrobr(arr1);


    }
    public static void arrstrobr(String arr1[]){ // выводит массив arr1 в обратном порядке
        String arrsort [] = arr1.clone(); // за счёт клона arr1 неизменен
        for (int i = 0; i<arrsort.length; i++) {
            arrsort[i] = arr1[9-i]; // 9 ячейка - 0, на втором цикле это уже -1 и тд
            System.out.println(arrsort[i]); // по заданию каждый элемент с новой строки
        }
       /* System.out.println(Arrays.toString(arrsort) );*/

        }
        public static void arrstrmini() {
            String arrmini[] = new String[5];
            System.out.println("Введите 5 ячеек массива строк:");
            for (int i = 0; i < arrmini.length; i++) {
                System.out.println("Введите ячейку " + i);
                Scanner str = new Scanner(System.in);
                arrmini[i] = str.nextLine( );
            }
            int arrmin [] = new int[5];
            for (int i =0; i<arrmin.length;i++) {
                arrmin[i] = arrmini[i].length();
                System.out.println("Ячейка " + i + " - " + arrmin[i] );

            }

        }

        public static void arrbig(){
        //Создать большой массив, раздробить на 2 мелких и вывести второй на экран
        int arr10 [] = new int [10];
            System.out.println("Введите 10 чисел массива:" );
            for (int i = 0; i <arr10.length; i++){
                Scanner str = new Scanner (System.in);
                arr10 [i] = str.nextInt();
            }
            System.out.println(Arrays.toString(arr10) );
            int arr51 [] = new int [5];
            for (int i = 0; i< arr51.length; i++){
                arr51 [i] = arr10[i];
            }
            int arr52 [] = new int [5];
            for(int i = 0; i<arr52.length;i++){
                arr52 [i] = arr10 [i+5]; //5я строка это вторая половина массива 5-9
                System.out.println(arr52[i] );
            }


        }
}

