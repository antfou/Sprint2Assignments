package Övningar.Six;

import org.junit.jupiter.api.Test;

public class GetStringFörValörTest {
    GetStringFörValör g = new GetStringFörValör();

    @Test
    public void getStringFörValörTest() {
        int typValör = 5;
        int antalValör = 1;
        assert(g.getStringFörValör(antalValör,typValör).equals("Antal 5- kronor: 1"));

    }
}