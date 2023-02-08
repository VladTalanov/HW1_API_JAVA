//1 Объявить два списка список ArrayList, в каждый добавить по 20 случайных чисел.
// далить из первого списка элементы отсутствующие во втором списке.
// Отсортировать первый список методом sort класса Collections.
//2 * Отсортировать второй список методом sort списка и компаратором по уменьшению.
//3 **Отсортировать первый список пузырьковой сортировкой самостоятельно, без использования доп методов и классов.

package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;


public class hw3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            list.add(random.nextInt(20));
        }
        for (int i = 0; i < 20; i++) {
            list1.add(random.nextInt(20));
        }

        list.forEach(nik -> System.out.print(nik + " "));
        System.out.println();
        list1.forEach(nik -> System.out.print(nik + " "));
        System.out.println();


        list.remove(list1);
        list.forEach(nik -> System.out.print(nik + " "));
        System.out.println();


        Collections.sort(list);
        list.forEach(nik -> System.out.print(nik + " "));
        System.out.println();

       list.sort(new Comparator<Integer>() {
           @Override
           public int compare(Integer o1, Integer o2) {
               return o2-o1;
           }
       });
        System.out.println(list);
        System.out.println();



        }
    }
