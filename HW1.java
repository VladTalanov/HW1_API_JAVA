//1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
//2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
//3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
//4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
//
//Пункты реализовать в методе main
//*Пункты реализовать в разных методах
//
//int i = new Random().nextInt(k); //это кидалка случайных чисел!)

import java.util.Random;
public class Work_1 {

    public static void main(String[] args) {

        System.out.println("Первый семинар.\n" +
                "1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i\n" +
                "2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа\n" +
                "3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1\n" +
                "4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2\n" +
                "\n" +
                "Пункты реализовать в методе main\n" +
                "*Пункты реализовать в разных методах\n" +
                "\n" +
                "int i = new Random().nextInt(k); //это кидалка случайных чисел!)\n\n");
        int i = new Random().nextInt(2001);
        System.out.printf("1. Случайное целое число = %d.\n\n", i);

        // ==================================================================================================

        int n = Integer.highestOneBit(i);
        System.out.printf("2. Номер старшего значащего бита выпавшего числа - %d.\n\n", n);

        // ==================================================================================================

        System.out.print("3. Все кратные n числа в диапазоне от i до Short.MAX_VALUE: ");
        int count = 0;
        for(int j = i; j <= Short.MAX_VALUE; j++) {
            if(j % n == 0) {
                count++;
            }
        }
        int[] m1 = new int[count];
        count = 0;
        for(int j = i; j <= Short.MAX_VALUE; j++) {
            if(j % n == 0) {
                m1[count] = j;
                count++;
                System.out.printf("%d, ", j);
            }
        }
        // System.out.println("\b\b.\n");
        System.out.printf("\n Размер массива m1 = %d\n\n", m1.length);

        // ==================================================================================================

        System.out.println("4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2:");
        count = 0;
        for(int j = Short.MIN_VALUE; j <= i; j++) {
            if(j % n != 0) {
                count++;
            }
        }
        int[] m2 = new int[count];
        count = 0;
        for(int j = Short.MIN_VALUE; j <= i; j++) {
            if(j % n != 0) {
                m2[count] = j;
                count++;
                System.out.printf("%d, ", j); //
            }
        }
        System.out.println("\b\b.\n"); //
        System.out.printf("Размер массива m2 = %d\n", m2.length);
    }

}