package Övningar.Six;

public class Huvudprogram {
    GetVäxel a = new GetVäxel();
    LoopPrinter b = new LoopPrinter();
    public void huvuprogram(){
        int pris = 2990;
        int pengarBetalat =6231;
        b.loopPrinter(a.getVäxel(pengarBetalat,pris));
    }

    public static void main(String[] args){
        Huvudprogram KÖR = new Huvudprogram();
        KÖR.huvuprogram();
    }
}
