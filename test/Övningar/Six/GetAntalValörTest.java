package Övningar.Six;


import org.junit.jupiter.api.Test;

public class GetAntalValörTest {

    GetAntalValör g = new GetAntalValör();

    @Test
    public void getAntalValörTest(){
        int växel = 40;
        int valör = 20;

        assert(g.getAntalValör(växel, valör) == 2);
        assert(g.getAntalValör(växel, valör) != 38);
    }

}
