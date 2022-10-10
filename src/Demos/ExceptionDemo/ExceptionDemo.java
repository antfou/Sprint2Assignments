package Demos.ExceptionDemo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
    //Exception-sväljning är INTE OK, lämna aldrig en try-catch, skriv ut en stacktrace åtminstånde, du vill veta vad som gått fel.
    //Exceptions som inte kräver attt man deklarerar throws "unchecked exceptions" (RuntimeExceptions).
    //T.ex NullPointerException = när man försöker referera till en variabel som inte är instansierad.
    //T.ex IndexOutOfBoundsException = när man försöker hitta ett index som inte finns i en array.

    public double divide(int i) throws ArithmeticException{
        String[] s = new String[10];
        System.out.println(s[11]); //Kommer att ge mig en IndexOutOfBoundsException utan att jag throwat den.
        //throw new ArithmeticException();
        return 10/i;
        /*try {
            return 10 / i;
        }catch (ArithmeticException t){
            System.out.println("ArithmeticException"); //Kollar om de delar med 0
            t.printStackTrace();
        }
        return 0;
*/    }

    public ExceptionDemo(){
        Scanner sc = new Scanner(System.in);
        int temp = 4;
        try {
            temp = sc.nextInt();
            double d = divide(temp);
            System.out.println(temp);
            System.out.println(d);
        }catch(InputMismatchException r){
            System.out.println("InputMismatchException");
            r.printStackTrace();
        }catch(ArithmeticException y){
            System.out.println("Du kan inte dela med 0");
            y.printStackTrace();
        }catch(Exception e){
            System.out.println("WHOOPS");
            e.printStackTrace();
        }
    }
    public static void main (String[] args){
        ExceptionDemo e = new ExceptionDemo();

    }
}