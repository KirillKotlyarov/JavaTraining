package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pass {
    public static void Start() throws IOException {
        System.out.println("Программа запущена, введите Ext для выхода или...\n" +
                "Введите пароль для продолжения работы:");
        Yes( );

    }

    //
    public static void Yes() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader((System.in)));
        String str = reader.readLine( );
        while (!str.equalsIgnoreCase("try")) {
            if (str.equalsIgnoreCase("ext")) {
                System.out.println("Программа завершена пользователем" );
                break;
            }
        System.out.println("Пароль не верный!\n" + "Повторите попытку:");
       str = reader.readLine( );


       }
    }
}
/*        String pass = "try";
        String esc = "esc";

            if (pass.equalsIgnoreCase(tpass)) { //Сравнение по символам, игнор капса
                System.out.println("Доступ открыт");
            } else if (esc.equalsIgnoreCase(tpass)) {
                Main.exti( );

            } else {

                No( );
            }
        }


    public static void No() throws IOException {
        System.out.println("Пароль неверный!" + "\n" + "Повторите попытку или введите esс для выхода:");
            Yes( );
    }*/

