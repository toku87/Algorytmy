package Algorithms;


import java.util.ArrayList;
import java.util.List;

public class ToDelete extends AbstractAlgorithm {


    @Override
    public String getName() {
        return "Usuwamy wartości z listy";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int toDelete = Integer.parseInt(input[1]);

        List<Integer> lista = new ArrayList<>();

        for (int i = 0; i < input.length - 2; i++) {
            lista.add(Integer.parseInt(input[i + 2]));
        }
        for (int i = 0; i < lista.size(); i++) {
            while (lista.get(i).equals(toDelete)) {
                lista.remove(i);
            }
        }
        for (Integer i : lista)
            System.out.printf("%d ",i);
    }
}







