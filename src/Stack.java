public class Stack {
    private static int[] stackArray;
    static int num;
    static int top;

    public Stack(int m) {
        this.num = m;
        stackArray = new int[num];
        top = -1;

    }
    public void add(int element) {
        stackArray[++top] = element;

    }
    public int delete() {
         return stackArray[top--];
    }
    public static void print() {
         for(int i = 0; i < top+1; i++){
              System.out.print(i + ": " + stackArray[i]+ "\n");
         }
    }
    public static void main(String[] args) {
        Stack stack = new Stack(4);
        stack.add(5);
        stack.add(8);
        stack.add(11);
        stack.add(30);
        
        System.out.println("вывод элементов");
        print();
        System.out.println("------------------------");
        stack.delete();
        print();
    }
 }


