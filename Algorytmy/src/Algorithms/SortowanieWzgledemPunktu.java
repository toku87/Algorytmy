package Algorithms;


public class SortowanieWzgledemPunktu extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Sortowanie względem punktu";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int n = Integer.parseInt(input[1]);
        int tablicaPunktow[][] = new int[n][3];

        int iterator = 2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                tablicaPunktow[i][j] = Integer.parseInt(input[iterator]);
                iterator++;
            }
        }

        int tablicaWynikow[][] = new int[n][2];
        for (int i = 0; i < n; i++) {
            tablicaWynikow[i][0] = tablicaPunktow[i][0];
            double x = Math.pow((double) tablicaPunktow[i][1], 2d);
            double y = Math.pow((double) tablicaPunktow[i][2], 2d);
            double sqrt = Math.sqrt(x + y);
            int round = (int) Math.round(sqrt);
            tablicaWynikow[i][1] = round;

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (tablicaWynikow[j][1] > tablicaWynikow[j + 1][1]) {
                    int temp[] = new int[2];
                    temp[0] = tablicaWynikow[j][0];
                    temp[1] = tablicaWynikow[j][1];
                    tablicaWynikow[j][0] = tablicaWynikow[j + 1][0];
                    tablicaWynikow[j][1] = tablicaWynikow[j + 1][1];
                    tablicaWynikow[j + 1][0] = temp[0];
                    tablicaWynikow[j + 1][1] = temp[1];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            int punkt = tablicaWynikow[i][0];
            for (int j = 0; j < n; j++) {
                if (punkt == tablicaPunktow[j][0])
                    System.out.printf("Punkt : %d; X:  %d;  Y:  %d \n", punkt, tablicaPunktow[j][1], tablicaPunktow[j][2]);
            }
        }
    }
}






