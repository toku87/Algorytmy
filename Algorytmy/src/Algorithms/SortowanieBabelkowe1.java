package Algorithms;


public class SortowanieBabelkowe1 extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "sortowanie babelkowe";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int[] tab = new int[input.length - 1];

        for (int i = 0; i < input.length-1; i++) {
            tab[i] = Integer.parseInt(input[i + 1]);
        }
        for (int i = 0; i <tab.length; i++) {
            for (int j = 0; j < tab.length - 1; j++) {
                int temp = tab[j + 1];
                if (tab[j] < tab[j + 1]) {
                    tab[j + 1] = tab[i];
                    tab[j] = temp;
                }

            }

        }
        for (int i = 0; i <tab.length ; i++) {
            System.out.println(tab[i]);
        }


    }
}




















