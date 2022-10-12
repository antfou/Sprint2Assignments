package Övningar.Six;

public class GetStringFörValör extends GetMyntEllerSedel{
    public String getStringFörValör(int antalValör, int valör){
        return "Antal " + valör + "-" + getMyntEllerSedel(valör)+ ": "+antalValör;
    }
}
