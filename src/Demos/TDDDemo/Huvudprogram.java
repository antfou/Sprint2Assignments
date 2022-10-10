package Demos.TDDDemo;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Huvudprogram {


    public static void main(String[] args){

        Reader r = new Reader();
        Iterator i = new Iterator();
        Path p = Paths.get("src/Demos/TDDDemo/data.txt");
        System.out.println(i.iterate(r.read(p)));


    }


}
