package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Scanner;

public class Cycles {
    public static void Start() throws IOException {
        String s = "010";
        String s1 = "100";
        String s2 = "2100";
        String s3 = "ret";
        String s4 = "box";
        String s5 = "cvadro";
        String s6 = "Sum";
        System.out.println("Введите команду:\n" +
                "010 - цикл с 1 до 10\n" +
                "100 - цикл с 10 до 1\n" +
                "2100 - цикл чётных с 2 до 100\n" +
                "Ret - повтор слова\n" +
                "Box - нарисовать прямоугольник\n" +
                "Cvadro - Квадрат из P\n" +
                "Sum - Сумма двух чисел");
        Scanner com = new Scanner(System.in);
        String itog = com.nextLine( );
        if (itog.equalsIgnoreCase(s)) {
            Cycles.c010( );
        } else if (itog.equals(s1)) {
            Cycles.c100( );
        } else if (itog.equals(s2)) {
            Cycles.c2100( );
        } else if (itog.equalsIgnoreCase(s3)) {
            Cycles.ret( );
        } else if (itog.equalsIgnoreCase(s4)) {
            Cycles.box( );
        } else if (itog.equalsIgnoreCase(s5)) {
            Cycles.cvadro( );
        }else if (itog.equalsIgnoreCase(s6)){
            Cycles.sum();
        } else {
            System.out.println("Ошибка, попробуйте снова!");
            Cycles.Start( );
        }
    }

    public static void c010() {
        int num = 0;
        while (num != 11) {
            System.out.println(num);
            num++;
        }
    }

    //
    public static void c100() {
        int num = 10;
        while (num != 0) {
            System.out.println(num);
            num--;
        }

    }

    //
    public static void c2100() {
        for (int num = 0; num != 102; num += 2) {
            System.out.println(num);
        }
    }

    public static void ret() {
        System.out.println("Введите слово и кол-во его повторений");
        Scanner vvod = new Scanner(System.in);
        String str = vvod.nextLine( );
        int num = vvod.nextInt( );
        int num1 = 0;
        while (num1 != num) {
            System.out.println(str);
            num1++;
        }
    }

    public static void box() {
        System.out.println("Введите по очереди длинну и ширину");
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt( ); // длинна
        int n2 = scan.nextInt( ); // ширина
        for (int n3 = 0; n3 < n1; n3++) { //длинна
            for (int n = 0; n < n2; n++) {  //ширина
                System.out.print("8"); // выводить в консоль ширину без нью лайн
            }
            System.out.println( ); //выводит в длинне нью лайн
        }
    } // Закрывает box

    public static void cvadro() {
       int num = 0;
       while (num<2) {
           System.out.println("PPPPPPPPPP" );
           num++;
       while (num<9){
           System.out.println("P        P" );
           num++;}
           System.out.println("PPPPPPPPPP" );
       }
    }

    public static void sum () throws IOException { //продумать команду выхода
            System.out.println("Введите первое слогаемое или -99 для выхода:");
        Scanner snum = new Scanner(System.in);
        double num1 = snum.nextDouble( );
        if (num1 != -99){
            while (num1!= -99) {
                System.out.println("Введите второе слогаемое");
                double num2 = snum.nextDouble( );
                double res = num1 + num2;
                System.out.println("= " + (res));
                Cycles.sum( );

                }

        }
        }


    }
