package Algorithms;


import java.util.Arrays;

public class WydawaniePieniedzy extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "wydawanie kasy";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int[] banknoty = {200, 100, 50, 20, 10, 5, 2, 1};
        int[] grosze = {50, 20, 10, 5, 2,1};
        int[] iloscbanknotow = {0,0,0,0,0,0,0,0};
        int[] iloscgroszy = {0,0,0,0,0,0};
        int kwotazlotowki = Integer.valueOf(input[1]);
        int kwotagroszy = Integer.valueOf(input[2]);

            while (kwotazlotowki >0) {
                for (int i = 0; i < banknoty.length; i++) {
                    if (kwotazlotowki >= banknoty[i]) {
                        kwotazlotowki = kwotazlotowki - banknoty[i];
                        iloscbanknotow[i]++;
                        break;
                    }
                }
            }
        while (kwotagroszy >0) {
            for (int i = 0; i < grosze.length; i++) {
                if (kwotagroszy >= grosze[i]) {
                    kwotagroszy = kwotagroszy - grosze[i];
                    iloscgroszy[i]++;
                    break;
                }

            }
        }
        for (int i = 0; i <banknoty.length ; i++) {
            System.out.printf("%d x %d złotych \n", iloscbanknotow[i], banknoty[i]);
            }
            for (int j = 0; j < grosze.length ; j++) {
                System.out.printf("%d x %d groszy \n", iloscgroszy[j], grosze[j]);
            }
        }
    }



