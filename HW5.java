//Создать словарь HashMap. Обобщение <Integer, String>.
//Заполнить пятью ключами (индекс, ФИО+Возраст+Пол "Иванов Иван Иванович 28 м"), добавить ключь, если не было!)
//Изменить значения сделав пол большой буквой.
//Пройти по коллекции и вывести значения в формате Фамилия инициалы "Иванов И.И."
//*Сортировать значения по возрасту и вывести отсортированную коллекция как в четвёртом пункте.

import com.sun.jdi.Value;

import java.util.*;
import java.util.stream.IntStream;


public class hw5 {

    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Иванов Иван Иванович 28 м");
        hashMap.put(3, "Иванова Ольга Ивановна 26 ж");
        hashMap.put(6, "Иванов Петр Петрович 5 м");
        hashMap.put(8, "Иванова Лариса Аркадьевна 45 ж");
        hashMap.put(9, "Иванова Иванна Иванновна 56 ж");


        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.print(entry.getKey() + " " + entry.getValue() + " ");

            ArrayList<String> family = new ArrayList<>();
            ArrayList<String> name = new ArrayList<>();
            ArrayList<String> soname = new ArrayList<>();
            ArrayList<String> gender = new ArrayList<>();
            ArrayList<Integer> age = new ArrayList<>();
            LinkedList<Integer> index = new LinkedList<>();
            Set<Integer> keySet = hashMap.keySet();
            for (int i = 0; i < keySet.size(); i++) {
                String[] string = (hashMap.get(keySet.toArray()[i]).split("\n"));
                for (int j = 0; j < string.length; j++) {
                    String[] n = string[j].split(" ");
                    System.out.println(n[0] + " " + n[1] + " " + n[2].toUpperCase());
                }
            }
            for (int i = 0; i < keySet.size(); i++) {
                String[] string = (hashMap.get(keySet.toArray()[i]).split("\n"));
                for (int j = 0; j < string.length; j++) {
                    String[] n = string[j].split(" ");
                    index.add(i);
                    age.add(Integer.valueOf(n[3]));
                    family.add(n[0] + " ");
                    name.add(n[1].charAt(0) + ".");
                    soname.add(n[2].charAt(0) + ".");
                }

                ArrayList<Integer> tmp = new ArrayList<>(age);
                Collections.sort(tmp);
                // for(int i = 0; i< tmp.size(); i++){
                int j = age.indexOf(tmp.get(i));
                index.set(i, j);
            }
            System.out.println("\n сортировка по возрасту:");
            for (int i = 0; i < index.size(); i++) {
                System.out.printf(family.get((i)));
                System.out.printf(name.get((i)));
                System.out.printf(soname.get((i)));
                System.out.println();

            }
        }
    }
}