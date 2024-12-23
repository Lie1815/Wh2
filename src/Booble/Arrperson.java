package Booble;

import java.util.List;

public class Arrperson {
   public static void selectionsort(List<Person> people){
       int n  = people.size();
       for(int i = 0; i < n -1; i++){
           int minIndex = i;
           for(int j = i + 1; j < n; j++){
               if (people.get(j). getAge() < people. get(minIndex). getAge()){
                   minIndex = j;
               }
           }
           Person temp = people.get(i);
           people.set(i, people.get(minIndex));
           people.set(minIndex, temp);
       }
   }
   public static void inSort(List<Person> people){
       for(int i = 0; i < people.size(); i++){
           Person key = people.get(i);
           int j = i -1;

           while (j >= 0 && key.getAge() < people.get(j).getAge()){
               people.set(j + 1, people.get(j));
               j--;
           }
           people.set(j + 1,  key);
       }
   }
}
