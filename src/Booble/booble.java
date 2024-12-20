package Booble;

public class booble {
    static void printMass(int [] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(i + ": " + arr[i]+ "\n");
        }
    }
    static boolean check(int[] mass){
        for (int i = 0; i < mass.length-1; i++) {
            if(mass[i]>mass[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] array = new int[500];

        for(int i = 0; i<array.length; i++){
            array[i] = (int) Math.floor(Math.random()*1000 );
        }
        while(!check(array)){
            for (int i = 0; i < array.length-1; i++) {
                if(array[i]>array[i+1]){
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
        }
        printMass(array);
    }
}
