package Övningar.Six;

public class LoopPrinter {
    GetAntalValör a = new GetAntalValör();
    GetStringFörValör b = new GetStringFörValör();
    GetAntalMinusStörstValör c = new GetAntalMinusStörstValör();
    protected int[] svenskValuta = {1000,500,200,100,50,20,10,5,2,1}; //Lista med alla mina valörer
    public void loopPrinter(int växel){
        for (int i=0; i < svenskValuta.length; i++){ //Loopar igenom min växel tills den är på 0
            int valör = svenskValuta[i]; //hittar vilken valör man är på genom att kolla antal loops med längden och dens plats i mitt valör index
            int antalValör = a.getAntalValör(växel,valör);
            if(antalValör == 0){//Bara så att den inte printar 0 av lappar
            }else{
                System.out.println(b.getStringFörValör(antalValör, valör));
                växel = c.getAntalMinusStörstValör(växel, valör, antalValör);
            }
        }
    }
}