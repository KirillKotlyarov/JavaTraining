package com.company;

import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        //Pass.Start();
        //Algebra.Start();
        //Cycles.Start();
        //TestOperIf.Start();
        //Pull.Fight( );
        //Pull.HumanAndFrends();
        //Arr.Pull();
        //ArrAndObjects.Pull();
algch();


    }
    // Задача:
    //Пропущенное число
    // * Вам дан массив из n-1 целых чисел, и эти целые числа находятся в диапазоне от 0 до n.
    // * В массиве нет дубликатов. В массиве отсутствует одно из целых чисел.
    // * Напишите эффективный код для поиска недостающего целого числа.
    public static void algch (){
        int ar[] = new int [] {2,3,1,7,5,4,8,0,9};
        Arrays.sort(ar );
        for (int i = 0; i < ar.length; i++){
            if (ar [i] == i){
                continue;
            }else{
                int x = ar[i] = ar[i] -1; // Массив из 10 строк с 0 до 9 и нет повторяющихся,
                //значит когда строка дойдёт до отсутствуюего числа, к примеру 6 это 7я иттерация,
                //выведется 7-1, т.е. 6
                System.out.println("Недостающее число: " + x );
                System.out.println(Arrays.toString(ar) );
                break;
            }

        }

    }
}

