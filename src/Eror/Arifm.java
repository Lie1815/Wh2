package Eror;

import java.io.IOException;

public class Arifm {

    public static void ReadFromJsonFile(String FileName) {

        if (!FileName.endsWith(" .Json")){
            try {
                throw new IOException("only json");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("чтение данных");
    }


 public static void main(String[] args) {
     ReadFromJsonFile("text.sql");
    //int [] array = new int[10];
    //try {
    //array[30] = 105;
    //}catch (ArrayIndexOutOfBoundsException e){
    //System.out.println("ошибка присвоения значения");
    //}catch (ClassCastException exception){
    //    System.out.println("ошибка приведения типов");
    //}
    // String str = null;
    //System.out.println(str.toUpperCase());
    }
}
