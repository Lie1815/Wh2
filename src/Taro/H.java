package Taro;

import java.util.Random;
import java.util.Scanner;

public class H {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(" задайте вопрос: ");

        String  vopr = scan.nextLine();
        Random ran = new Random();
        int rand = ran.nextInt(6);

        switch (rand){
            case 0:
                System.out.println("слушай свою интуицию ");
                break;

            case 1:
                System.out.println("верь в себя, и у тебя все получиться");
                break;
            case 2 :
                System.out.println("");
                break;
            case 3:
                 System.out.println(" ");
                 break;
            case 4:
                System.out.println(" ");
                break;



        }
    }

}
