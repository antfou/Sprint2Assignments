package Övningar.Six;

public class GetMyntEllerSedel {
    public String getMyntEllerSedel(int peng){
        String valutaTyp;
        if(peng < 20){
            valutaTyp = " kronor";
        }else{
            valutaTyp = " lappar";
        }

        return valutaTyp;
    }
}
