package generics;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Generics {

    // byte = Byte, short = Short, int = Integer, long = Long
    //char = Character, boolian = Boolean
    public static void main(String[] args) {


       Integer age = 5;
       Integer age2 = 24;
       int f = 10;
       Integer fNew = Integer.valueOf(f); //автоупаковка примитива в обьект
        System.out.println(fNew);


        Character charObject = 'q';
        char cgarPrimitiv  = charObject.charValue(); //распаковка из обьекта в примитив


        Integer d = 320;
        Integer d2 = 320;


        int d3 = 320;
        int d4 = 320;
        System.out.println(d.equals(d2));
        System.out.println(d3 == d4);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Integer.toBinaryString(332));
        System.out.println(Integer.toHexString(16));
        System.out.println(Integer.toOctalString(58));
        System.out.println (Integer.parseInt("8686"));

        System.out.println(Double.parseDouble("67.32"));

        System.out.println(Double.POSITIVE_INFINITY);
        System.out.println(Double.NEGATIVE_INFINITY     );
    }
}