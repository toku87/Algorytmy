package Algorithms;


public class SortowaniePrzezZliczanie extends AbstractAlgorithm {

    @Override
    public String getName() {
        return "Sortowanie przez zliczanie";
    }

    @Override
    public void runAlgorithm(String[] input)
    {
        int n = input.length - 2;
        int max = Integer.parseInt(input[1]) + 1;
        int[] tabSparsowanychWejscia = new int[n];

        for (int i = 0; i < n; i++)
        {
            tabSparsowanychWejscia[i] = Integer.parseInt(input[i+2]);
        }

        int[] tablicaDoZliacznia = new int[max];
        for (int i = 0; i < tabSparsowanychWejscia.length; i++ )
        {
            int liczba = tabSparsowanychWejscia[i];
            tablicaDoZliacznia[liczba]++;
        }

        for(int indeksTablicy = 0; indeksTablicy < tablicaDoZliacznia.length; indeksTablicy++)
        {
            if(tablicaDoZliacznia[indeksTablicy] > 0)
                for(int ileLiczb = tablicaDoZliacznia[indeksTablicy]; ileLiczb > 0; ileLiczb--)

                {

                    System.out.printf("%d ", indeksTablicy);
                }
        }
    }
}
