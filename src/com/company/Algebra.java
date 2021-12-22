package com.company;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Algebra {



    public static void Start() throws IOException {
       double num = 15;
       num = persent (num);// num присваивается значение после операции persent, в неё передаётся num до изменения
        System.out.println(num);
        System.out.println("Введите нужную операцию:\n"+"sum(+)\n"+"subt(-)\n"+
                "multy(*)\n"+"div(/)\n" +
                "exti - выход");
      operacion();

    }

    public static void operacion() throws IOException{
        BufferedReader v1 = new BufferedReader(new InputStreamReader(System.in));
        String v2 = v1.readLine();
        String sum = "Sum";
        String multy = "Multy";
        String subt = "Subt";
        String div = "Div";
        String exti = "Exti";

        if (v2.equalsIgnoreCase(sum)) {
            Algebra.sum( );
        }else if(v2.equalsIgnoreCase(multy)) {
            Algebra.multy( );
        }else if (v2.equalsIgnoreCase(subt)) {
            Algebra.subt( );
        }else if (v2.equalsIgnoreCase(div)) {
            Algebra.div();
        }else if (v2.equalsIgnoreCase(exti)) {

            }else { // закольцовывает operacion
            System.out.println("Неизвестное значение, попробуйте ещё раз:" );
            System.out.println("sum(+)\n"+"subt(-)\n"+
                    "multy(*)\n"+"div(/)");
            operacion();
        }
        }



    //
      public static void sum() throws IOException {
        System.out.println("Введите числа которые нужно сложить (пример 2,5):" );
          Scanner mnum = new Scanner(System.in);
          double num1 = mnum.nextDouble();
          System.out.println("+" );
          double num2 = mnum.nextDouble();
          double res = num1 + num2;
        System.out.println("="+(res));

    }
    public static void multy() throws IOException{
         System.out.println("Введите числа которые нужно умножить (пример 2,5):" );
        Scanner mnum = new Scanner(System.in);
        double num1 = mnum.nextDouble();
        System.out.println("*" );
        double num2 = mnum.nextDouble();
    double res = num1 * num2;
        System.out.println("="+(res));
    }
    public static void subt () throws IOException {
        System.out.println("Введите уменьшаемое");
        Scanner snum = new Scanner(System.in);
        double num1 = snum.nextDouble( );
        System.out.println("Введите вычитаемое");
        double num2 = snum.nextDouble( );
        double res = num1 - num2;
        System.out.println("= " + (res));
    }
        public static void div () throws IOException{
        System.out.println("Введите делимое" );
        Scanner dnum = new Scanner(System.in);
        double num1 = dnum.nextDouble();
        System.out.println("Введите делитель" );
        double num2 = dnum.nextDouble();
        double res = num1 - num2;
        System.out.println("= "+(res));
    }
    public static double persent(double num){
        double res = num/100*10+num;
        return res;
    }
}
