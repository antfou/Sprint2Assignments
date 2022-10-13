package Övningar.Six;

import java.util.Random;
import java.util.Scanner;


//Det går att använda booleans för att se om du är inne i ett test eller inte, så ifall test är true så kan man köra där scanners har en txt sträng istället för system in.
public class Terminalen {
    Scanner sc = new Scanner(System.in);
    Random r = new Random();
    public int prisAvProdukt(){
        int pris = r.nextInt(20000)+1;
        return pris;
    }
    //Släng in input handlers i olika metoder så det går att try catcha samt testa.
    //Använd assert throw och assert does not throw i testerna.
    public int getBetalning() {
        int temp = 0;
        int pengarBetalat;
        try{
            System.out.println("Vilket belopp betalar du?");
            if (sc.hasNextInt()) {
                temp = sc.nextInt();
                System.out.println("Du betalar: " + temp + ":-");
            } else {
                System.out.println("Du kan inte betala med något annat än en siffra");
            }
        }catch (Exception e){
            e.printStackTrace();
            sc.nextLine();
        }
        pengarBetalat = temp;
        return pengarBetalat;
    }

    public void snåljåp(int växel, int pris, int pengarBetalat){
        if(växel == 0){
            System.out.println("Det blev ingen växel över.");
        }else if(växel < 0){
            int saknas = pris - pengarBetalat;
            System.out.println("Du saknar:" + saknas + "kr");
        }
    }
}
