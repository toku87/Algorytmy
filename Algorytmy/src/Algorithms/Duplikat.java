package Algorithms;


public class Duplikat extends AbstractAlgorithm{
    @Override
    public String getName() {
        return "Szukamy duplikatu w ciągu liczb";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int n = input.length -1;
        int [] tab = new int[n];

        for (int i = 0; i <tab.length ; i++) {
            tab[i] = Integer.parseInt(input[i + 1]);
        }


        for (int i = 0; i <tab.length ; i++) {
            for (int j = 0; j <i ; j++) {
                if (tab[i]==tab[j])
                {
                    System.out.printf("Pierwszym duplikatem w tablicy jest : %d. " +
                            "Występuje na indeksach %d %d",  tab[i], i, j);
                    return;

                }
            }
        }
        System.out.println("Nie znaleziono duplikatu");
    }
}
