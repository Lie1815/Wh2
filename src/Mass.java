import java.util.Random;

public class Mass {

    static void printMass(int [] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(i + ": " + arr[i]+ "\n");
        }
    }
    static int find(int[] array, int element){
        for(int i = 0; i < array.length; i++){
            if(array[i]==element){
                return i;
            }
        }
        return 0;
    }
    static void delete(int[] array, int nomer){
        for(int i = nomer; i < array.length-1; i++){
            array[i] = array[i+1];
        }
        array[array.length-1] = 0;
    }

    public static void main(String[] args) {
        Random ram = new Random();
        int [] mass = new int[100];
        for(int i = 0; i < mass.length; i++){
            mass[i]= (int) (Math.random() * 100);
        }
        printMass(mass);
        System.out.println("Удаляем число в позиции 4");
        delete(mass, 4);
        printMass(mass);
    }
}
