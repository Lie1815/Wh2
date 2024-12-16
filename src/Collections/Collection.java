package Collections;

import java.util.ArrayList;

public class Collection {


    public static <Test1> void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Test1> list3 = new ArrayList<>();

        //add (тип), add(int index, ) - добавление в список
        //get - возращает элемент
        //set (int index, ) - меняет элемент
        //remove() -удаляет элемент по номером
        // size() - кол во элем списка


        //реализован на основе массива
        //можно хранить nul, можно хранить дублирующие элементы
        //порядок хранения элементов соответствует порядку добавления

        list.add(5);
        list.add(32);
        list.add(45);

        // For-each выводит все данные

        for (Integer i: list){
            System.out.println(i);
        }

        //List = ArrayList, linkedList, vector, Stack
        //set (уникальные значения, множества) =  Hashset, Treeset, LinkedHashset
        //Map (словари) = hashmap, TreeMap, HashTable
        // Queue = PriorotyQueue, Arraydeque

    }
}
