package Algorithms;


public class Warcaby extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "rysujemy pole do warcabów";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int liczbawierszy = Integer.parseInt(input[2]);
        int liczbakolumn = Integer.parseInt(input[1]);


        String [] kolory = {"B", input[3]};

        String tablica [][] = new String [liczbawierszy][liczbakolumn];
        int iterator = 2;
        for (int i = 0; i < liczbawierszy ; i++) {
            for (int j = 0; j <liczbakolumn ; j++) {
                if (iterator%2 == 0){
                    tablica[i][j] = kolory[1];
                }else {
                    tablica[i][j] = kolory[0];
                }
                iterator++;
            }
            iterator++;

        }
        for (int i = 0; i < liczbawierszy  ; i++) {
            for (int j = 0; j <liczbawierszy -1 ; j++) {
                System.out.printf("%s ", tablica[i][j]);
            }
            System.out.printf("\n");
        }

    }
}
