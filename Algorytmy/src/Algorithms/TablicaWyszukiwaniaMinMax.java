package Algorithms;

import java.util.Random;

public class TablicaWyszukiwaniaMinMax extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "rysujemy tablice";
    }

    @Override
    public void runAlgorithm(String[] input) {

        Random mRand = new Random(12);
        int[] tab = new int[10];
        int[] parzyste = new int[10];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = mRand.nextInt();

//            System.out.println(tab[i]);
        }

        for (int i = 0, j = 0; i < parzyste.length; i++, j = j + 2) {
            parzyste[i] = j;
//            System.out.println(parzyste[i]);
        }

        int n = input.length - 1;
        int[] tablica = new int[n];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int iterator = 0;
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = Integer.parseInt(input[i+1]);

            if (tablica[i] > max) {
                max = tablica[i];
                iterator++;
            }
        }
        System.out.println(max + " " + String.valueOf(iterator));

        int iterator2 = 0;
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = Integer.parseInt(input[i+1]);
            if (tablica[i] < min) {
                min = tablica[i];
                iterator++;
            }
        }
        System.out.println(min + " " + String.valueOf(iterator2));
    }
}





