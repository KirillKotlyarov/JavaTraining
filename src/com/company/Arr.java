package com.company;

import java.util.Arrays;
import java.util.Scanner;

//массив = объект
// Arrays классы и методы лучше не называть, будет дисонанс с библиотечным классом Arrays,
// или если уж припёрло, то с маленькой буквы
public class Arr {
    public static void Pull() {
        //Task1to4( );
        //Task5();
        //Task6();
        //Task7();
        //Task8();
        //NoTask(); //Многомерные массивы
        //TaskObj;
    }

    public static void Task1to4() {
        //Задание 1 : массив от 1 до 10
        int arr1to10[] = new int[10]; //новый одномерный массив и кол-во ячеек в нём
        for (int i = 0; i < arr1to10.length; i++) { //цикл будет повторяться, пока i меньше кол-ва ячеек массива
            arr1to10[i] = i + 1; // ячейка массива 0 = 0+1,ячейке передали i равную 0 и циклом она инкрементируется
        }
        System.out.println(Arrays.toString(arr1to10)); //вывели заполненный массив
        //Задание 2 : массив от 10 до 1
        int arr10to1[] = new int [10];
        for (int i = 0; i < arr10to1.length ; i++) {
            arr10to1[i] = 10 - i ; //ячейка 0 = 10 - 0, т.е. 10, это гениально!
        }
        System.out.println(Arrays.toString(arr10to1));
        //Задание 3 : массив от 10 до 19
        int arr10to19 []= new int [10];
        for (int i = 0; i< arr10to19.length; i++){
            arr10to19[i] = 10+i ;
        }
        System.out.println(Arrays.toString(arr10to19));
        //Задание 4 : массив от 29 до 20
        int arr29to10 [] = new int[10];
        for (int i = 0; i< arr29to10.length; i++){
            arr29to10[i] = 29-i;
        }
        System.out.println(Arrays.toString(arr29to10) );
        }

        public static void Task5(){
        String ArrString []= new String [] {"Я вывожу", "пять", "строк", "в" , "массив!"};
            System.out.println(Arrays.toString(ArrString));
            //или в более крассивом формате:
            for (int i = 0; i < ArrString.length; i++){ // повторяется пока есть строки массива
                System.out.print(ArrString[i]+" "); //выводит без переноса ячейки от i (нулевой)
            }
        }

    public static void Task6 () {
        String ArrString [] = new String[5];
        Scanner scan = new Scanner (System.in);
        for (int i = 0; i < ArrString.length; i++){
            System.out.println("Введите текст в ячейку "+i); //
            String str = scan.nextLine();
            ArrString[i] = str;
        }
        // System.out.println(Arrays.toString(ArrString) ); - коротко, но не опрятно

        for (int i = 0; i < ArrString.length; i++)
        System.out.print(ArrString[i]+" " );

    }
    public static void Task7(){
        // Задание: 5 чисел, статическая инициализация + сумма
        int arr5 [] = new int[]{2,3,5,4,1};
        System.out.println(Arrays.toString(arr5)); // Статическая инициализация
        System.out.println(Arrays.stream(arr5).sum()); //stream - логические операции с массивом
        System.out.println(Arrays.stream(arr5).min());
        // Или более симпатичный
        Arrays.sort(arr5);
        System.out.println(arr5[0]); //после сортировки выведется наименьшее число
    }
    public static void Task8(){
        System.out.println("Введите длинну массива:" );
        Scanner num = new Scanner(System.in);
        int number = num.nextInt();
        int arr10 [] = new int[number];
        for (int i = 0; i < arr10.length; i++){
            System.out.println("Введите ячейку "+ i );
            arr10[i] = num.nextInt(); //приравнивает ячейку числу из сканера
        }
        System.out.println(Arrays.toString(arr10) );
        innicializearray(arr10);
        System.out.println(Arrays.toString(arr10) ); // За счёт клонирования в методе ниже, массив нетронут

    }
    static void innicializearray (int [] arr10){ //Метод проигрывает в длинне, но в консоле нет OptionalInt
      int arr10v2 [] = arr10.clone(); //клонирует arr10
        Arrays.sort(arr10v2); //Сортирует по возрастанию
        int v = arr10v2.length -1; //Пристаивает последней ячейки консоля значение v
        //Важно! Ячеек может быть 10, но индекс последней будет 9 (0-9) по этому -1
        System.out.println(arr10v2 [v]); // Вызывает её в консоль без приставки Optional int
        // Или менее симпатичная статическая инициализация через стрим:
        System.out.println(Arrays.stream(arr10v2).max() );
    }
    public static void NoTask() { // Задача: вывести в консоль через цикл,
        // временно изменить значение ячейки 1.2 yf 0 и вывести в консоль
        // использовать статический вывод со старым значением
        int arrs[][] = { //[]- строки, [][] - ячейки в строке
                {12, 34},
                {14, 2, 10},
                {10, 1, 20}
        };
        // Вариант 1:
      /*  for (int[] strokimassiva : arrs) { //будет повторяться пока в массиве есть строки
            System.out.println();   //После проверки каждой строки переводит на новую
            for (int yacheikistroki : strokimassiva) { //будет повторяться пока в каждой строке есть ячейки
                System.out.print(yacheikistroki + ", " ); // Добавляет запятую после каждой ячейки
            }
        }*/
        for (int i = 0; i < arrs.length; i++) { //arrs.length показывает длинну строк массива, будет выполняться
            //пока есть строки в массиве, когда дойдёт до 3й, выполнение оборвётся, т.к. с 3 !> 3,
            //а с 0 до 2 выполнилось как раз 3 иттерации
            System.out.println( ); // переносит на новую строку каждую полную итеррацию строки
            for (int j = 0; j < arrs[i].length; j++) { // arrs[i].length - возвращает кол-во ячеек в строке i
                //т.е. в первой иттерации это ячейка 0
                System.out.print(" " + arrs[i][j]);
            }
        }
        System.out.println( ); //переносит строку перед выполнение arrssvap
        System.out.println(Arrays.deepToString(arrs) ); // приставка deep нужна для многомерного массива
        arrssvap(arrs);
        System.out.println(Arrays.deepToString(arrs) );
    }
    static int arrssvap(int[][] arrs){
        arrs [1][2] = 0; //меняет значение ячейки
        System.out.println(Arrays.deepToString(arrs) ); //выводит его в консоль статической инициализацией
        return arrs [1][2]=10; //возвращает предыдущее значение
    }


//Наброски для вариативности:

      /*  Scanner inpurt = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int size = inpurt.nextInt( ); //значение из сканера и переводит в инт
        int[] arr = new int[size]; // объявляет значение массива интом из сканера

        for (int i = 0; i < size; i++) { // цикл заполняет ячейки массива
            System.out.println("Введите значение ячейки " + i);
            arr[i] = inpurt.nextInt( );
        }
        System.out.println(Arrays.toString(arr) ); //воводит массив без нумирации

        for (int j = 0; j <arr.length;j++){ //цикл выводящий ячейки под нумирацией
            System.out.println(arr[j]+ " " + j );
        }

        int sum = Arrays.stream(arr).sum() - arr[2];  //выдаёт сумму всех ячеек кроме второй
        System.out.println(sum );


*/
        /*int[] mass = {1,24,3,-14};
        int[] mass2 = mass.clone();
        Arrays.sort(mass2);
        System.out.println(mass2[0]);
        System.out.println(Arrays.toString(mass) );
        smenatwojat(mass);
        System.out.println(Arrays.toString(mass) );

    }
    public static void smenatwojat (int [] mass){
        int [] mass3 = mass.clone();
        mass3 [1] = 2;
        System.out.println(Arrays.toString(mass3) );

    }*/
    }






