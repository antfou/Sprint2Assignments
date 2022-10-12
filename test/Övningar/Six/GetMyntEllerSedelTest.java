package Övningar.Six;

import org.junit.jupiter.api.Test;

public class GetMyntEllerSedelTest {
    GetMyntEllerSedel g = new GetMyntEllerSedel();
    @Test
    public void getMyntEllerSedelTest(){
        int peng1 = 1;
        int peng2 = 5;
        int peng3 = 10;
        int peng4 = 20;
        int peng5 = 50;
        int peng6 = 100;
        int peng7 = 200;
        int peng8 = 500;
        int peng9 = 1000;

        assert(g.getMyntEllerSedel(peng1).equals(" kronor"));
        assert(g.getMyntEllerSedel(peng2).equals(" kronor"));
        assert(g.getMyntEllerSedel(peng3).equals(" kronor"));
        assert(g.getMyntEllerSedel(peng4).equals(" lappar"));
        assert(g.getMyntEllerSedel(peng5).equals(" lappar"));
        assert(g.getMyntEllerSedel(peng6).equals(" lappar"));
        assert(g.getMyntEllerSedel(peng7).equals(" lappar"));
        assert(g.getMyntEllerSedel(peng8).equals(" lappar"));
        assert(g.getMyntEllerSedel(peng9).equals(" lappar"));

    }
}
