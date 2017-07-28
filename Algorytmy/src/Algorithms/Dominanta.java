package Algorithms;

public class Dominanta extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Obliczamy dominante";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int n = input.length - 1;
        int[] T = new int[n];

        int max = 0;

        for (int i = 0; i < n; i++) {
            T[i] = Integer.parseInt(input[i + 1]);
            if (T[i] > max) {
                max = T[i];
            }
        }

        int[] L = new int[max + 1];
        for (int i = 0; i < T.length; i++) {
            int liczba = T[i];
            L[liczba]++;
        }
        int result = 0;
        for (int i = 0; i <L.length ; i++) {
            if (L[i] > L[result]) {
                result = i;
            }
        }

        System.out.printf("Najczęściej wsytepuje: %d, Ile razy ??? %d", result, L[result]);


    }
}



