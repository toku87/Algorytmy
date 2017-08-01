package Algorithms;


import java.util.ArrayList;
import java.util.List;

public class DzialanieNaListach extends AbstractAlgorithm{
    @Override
    public String getName() {
        return "testujemy listę";
    }

    @Override
    public void runAlgorithm(String[] input) {

        List Kolory = new ArrayList();
        Kolory.add("Niebieski");
        Kolory.add("Czarny");
        Kolory.add("Żółty");
        Kolory.add("fioletowy");
        Kolory.add(0, "Różowy");
        int dl = Kolory.size();
        Kolory.add(dl, "Zielony");

        System.out.println(Kolory);

    }
}
