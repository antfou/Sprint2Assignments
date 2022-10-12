package Övningar.Six;

public class Huvudprogram {
    GetVäxel a = new GetVäxel();
    LoopPrinter b = new LoopPrinter();
    Terminalen c = new Terminalen();
    public void huvuprogram(){
        int pris = c.prisAvProdukt();
        System.out.println("Produkten kostar: " + pris + ":-");
        int pengarBetalat = c.getBetalning();
        int växel = a.getVäxel(pengarBetalat,pris);
        if(växel <= 0) {
            c.snåljåp(växel, pris, pengarBetalat);
        }else if(växel > 0) {
            b.loopPrinter(a.getVäxel(pengarBetalat, pris));
        }
    }

    public static void main(String[] args){
        Huvudprogram KÖR = new Huvudprogram();
        KÖR.huvuprogram();
    }
}
