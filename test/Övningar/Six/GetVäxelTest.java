package Övningar.Six;

import org.junit.jupiter.api.Test;



public class GetVäxelTest {
    GetVäxel g = new GetVäxel();

    @Test
    public void getVäxelTest(){
        int pris  = 3000;
        int pengarBetalat = 2990;
        assert(g.getVäxel(pris,pengarBetalat) == 10);
        assert(g.getVäxel(pris,pengarBetalat )!= 35);

    }

}
