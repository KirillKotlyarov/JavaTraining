package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.RandomAccess;
import java.util.Scanner;



public class TestOperIf {

    public static void Start () throws IOException {
        TestOperIf.ifopcion();
    }
    public static void ifopcion() throws IOException{
        System.out.println("Введите необходимую операцию: \n"+"max - максимальное из двух чисел \n"+
                "min - минимальное из трёх чисел \n"+"average - среднее из трёх чисел \n"+
                "compare - сравнить относительно цифры 5 \n"+
                "stack - умножить положительное и прибавить 10 к отридцательному \n"+
                "checkinterval - тест на содержание числа в интервале между 20 и 50 \n"+
                "closeToFive - вывести ближайшее к 5 число\n" +
                "exti - выход в предыдущее меню");
        BufferedReader optstr = new BufferedReader(new InputStreamReader(System.in));
        String str = optstr.readLine();
        String v1 = "max";
        String v2 = "min";
        String v3 = "average";
        String v4 = "compare";
        String v5 = "stack";
        String v6 = "checkinterval";
        String v7 = "closeToFive";
        String v8 = "exti";
        if (str.equalsIgnoreCase(v1)) {
            TestOperIf.max();
        }else if (str.equalsIgnoreCase(v2)) {
            TestOperIf.min();
        }else if (str.equalsIgnoreCase(v3)) {
            TestOperIf.average( );
        }else if (str.equalsIgnoreCase(v4)) {
            TestOperIf.compare( );
        }else if (str.equalsIgnoreCase(v5)) {
            TestOperIf.stack( );
        }else if (str.equalsIgnoreCase(v6)) {
            TestOperIf.checkinterval( );
        }else if (str.equalsIgnoreCase(v7)) {
            TestOperIf.closeToFive();
        }else if (str.equalsIgnoreCase(v8)){

        }else{
            System.out.println("Введенны некорректные данные, попробуйте снова!" );
            TestOperIf.ifopcion();
        }
        }

    //Операции
    public static void max(){
        System.out.println("Введите два числа и я выведу большее из них: " );
        Scanner scannum = new Scanner(System.in);
        int num = scannum.nextInt();
        int num1 = scannum.nextInt();
        if (num > num1){
            System.out.println(num );
        }else if (num < num1){
            System.out.println(num1 );
        }
}

    public static void min() {
        System.out.println("Введите три числа и я выведу минимальное из них:" );
        Scanner scannum = new Scanner(System.in);
        int num1 = scannum.nextInt();
        int num2 = scannum.nextInt();
        int num3 = scannum.nextInt();
        if (num1 <= num2 && num1 <= num3 ){
            System.out.println(num1);
        }else if (num2 <= num1 && num2 <= num3){
            System.out.println(num2 );
        }else if (num3 <= num1 && num3 <= num2){
            System.out.println(num3 );
        }


    }

    public static void average (){
        System.out.println("Введите три числа и я выведу среднее из них:" );
        Scanner scannum = new Scanner(System.in);
        int num1 = scannum.nextInt();
        int num2 = scannum.nextInt();
        int num3 = scannum.nextInt();
        if (num1 >= num2 && num1 <=num3 || num1 <= num2 && num1 >= num3 ){
            System.out.println(num1 );
        }else if (num2 >= num1 && num2 <= num3 || num2 <= num1 && num2 >= num3 ){
            System.out.println(num2 );
        }else{ //вариантов больше нет, по этому средним отработает num3
            System.out.println(num3 );
        }
}
    public static void compare(){
        System.out.println("Введите число для сравнения относительно 5: " );
        Scanner scannum = new Scanner(System.in);
        int num = scannum.nextInt();
        int num1 = 5;
        if (num < num1){
            System.out.println("Число меньше 5!" );
        }else if(num > num1){
            System.out.println("Число больше 5!" );
        }else{
            System.out.println("Число равно 5!" );
        }
    }
    public static void stack(){
        System.out.println("Введите число, я умножу на 2 положительное и прибавлю 10 к отридцательному: " );
        Scanner scannum = new Scanner(System.in);
        int num = scannum.nextInt();
        if (num > 0){
            System.out.println(num*2 );
        }else{
            System.out.println(num+10 );
        }
    }

    public static void checkinterval(){
        System.out.println("Введите чило и я проверю проходит ли оно в интервале между 20 и 50" );
        Scanner scannum = new Scanner(System.in);
        int a = scannum.nextInt();
        if (a <= 50 && a >= 20){
            System.out.println("Число "+a+" содержится в заданном интервале!" );
        }else {
            System.out.println("Число "+a+" не содержится в заданном интервале!" );
        }
    }
    public static void closeToFive() { //заебался как собака
        System.out.println("Введите два числа и я выведу ближайшее к 5");
        Scanner scannum = new Scanner(System.in);
        int a = scannum.nextInt( ); //4
        int b = scannum.nextInt( );//7

        if (a <= 0 && b >= 0) {
            int c = a * -2; //пришлось выводить в положительные оба и сравнивать
            int d = b * 2;
            if (c<=d){
                System.out.println(a );
            }else{
                System.out.println(b );
            }
        }else if (a >= 0 && b <= 0) {
            int c = a * 2;
            int d = b * -2;
            if (c<d){
                System.out.println(a );
            }else{
                System.out.println(b );
            }
        }else if (a <= 0 && b <= 0){
            int c = a * -2;
            int d = b * -2;
            if (c<=d){
                System.out.println(a );
            }else{
                System.out.println(b );
            }
        }else {
            int c = a * 2;
            int d = b * 2;
            if (c>=d+3){ // вывел цифру больше для сравнения
                System.out.println( b);
            }else {
                System.out.println(a );
            }
        }




        }
    }


