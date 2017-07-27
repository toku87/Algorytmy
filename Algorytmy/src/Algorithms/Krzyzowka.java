package Algorithms;


public class Krzyzowka extends AbstractAlgorithm{


    @Override
    public String getName() {
        return "krzyzowka";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int liczba = Integer.parseInt(input[1]);

        if(Math.sqrt((double)liczba) %1 == 0){
        System.out.println("JEST PIERWIASTKOWALNA BEZ RESZTY");

            double pierwiastek = Math.sqrt((double)liczba);
            int n = (int)pierwiastek;

            String litery [] ={"a","b","c","d","e","f","g","h"};

            String tablica [][] = new String[n][n] ;
            for (int i = 0; i <n ; i++) {
                for (int j = 0; j <n ; j++) {
                    tablica[i][j] = litery[i] + String.valueOf(j+1);


                }

            }

            for (int i = 0; i <n ; i++) {
                for (int j = 0; j <n ; j++) {
                    System.out.printf("%s ", tablica[i][j]);
                }
                System.out.printf("\n");


            }
        } else {
            System.out.println("NIE JEST PIERWIASTKOWALNA BEZ RESZTY");
        }





    }
}
