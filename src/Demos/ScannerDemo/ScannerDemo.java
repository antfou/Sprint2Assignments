package Demos.ScannerDemo;

import java.util.Scanner;

public class ScannerDemo {
    public ScannerDemo(){
        Scanner sc = new Scanner(System.in);
        /*String temp;
        while(true){ //Endast för chars och strings
            System.out.println("Skriv ett ord.");
            temp = sc.next();
            System.out.println("Du skrev ut: " + temp);
        }*/
        int temp;
        while(true) {
            System.out.println("Skriv en siffra: "); //Endast för ints
            if (sc.hasNextInt()) { //Kollar om du skrev in en int
                temp = sc.nextInt();
                System.out.println("Du skrev: " + temp);
            }else {
                System.out.println("Det där var fan inte en siffra!");
                sc.next();//Den "tömmer" det som stod i scannern för att läsa in igen.
            }
        }


    }

    public static void main(String[] args) {
    ScannerDemo sc = new ScannerDemo();

    }
}