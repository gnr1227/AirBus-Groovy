//import java.lang.*;

public class TypeDemo {
    public static void main(String[] args) {
        byte a = 10;  //byte <=== int
        short s = 100; // short <===int
        int i = 10;   // int <=== int
        long lng = 1000; //long <== int

        //explicit conversion
        byte b = (byte) 10000;


        //here f is sufffix used to convert double to float
        float f = 10.5f;  // default type of precision is double
        float f1 = (float) 10.89;

        //Reference Type
        Integer myNumber =100;
        //primitive type
        int myNewNumber =myNumber; //int <== Integer -  Boxing

        Integer myNumber2 = myNewNumber; //Integer <=== int Unboxing

    }
}
