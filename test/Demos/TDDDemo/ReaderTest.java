package Demos.TDDDemo;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReaderTest {
Path p = Paths.get("test/Demos/TDDDemo/data.txt");
    Reader r = new Reader();

    @Test
    public void transformIntegerTest(){
        String s1 = "345";
        String s2 = "45 ";


        assert(r.transformToInt(s1) == 345);
        assert(r.transformToInt(s2) == 45);
    }


    @Test
    public void readToIntListTest(){

        List<Integer> l = r.read(p);

        assert(l.size() == 10);
        assert(l.get(0) == 199);
        assert(l.get(1) != 199);
        assert(l.get(1) == 200);

    }

}
