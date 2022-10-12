package Övningar.Six;

import org.junit.jupiter.api.Test;

public class GetAntalMinusStörstValörTest {

    GetAntalMinusStörstValör g = new GetAntalMinusStörstValör();

    @Test
    public void getAntalMinusStörstValörTest(){
        int växel = 2632;
        int störstValör = 1000;
        int antalValör = 2;

        assert(g.getAntalMinusStörstValör(växel, störstValör, antalValör) == 632);
        assert(g.getAntalMinusStörstValör(växel, störstValör, antalValör) != 0);
        assert(g.getAntalMinusStörstValör(växel, störstValör, antalValör) != 2000);


    }
}
