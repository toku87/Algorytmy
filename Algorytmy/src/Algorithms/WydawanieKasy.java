package Algorithms;


public class WydawanieKasy extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "wydawanie kasy";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int[] banknoty = {200, 100, 50, 20, 10, 5, 2, 1};
        int[] grosze = {50, 20, 10, 5, 2,1};
        int[] banknotypusty = {0,0,0,0,0,0,0,0};
        int[] groszepusty = {0,0,0,0,0,0};
        int kwotazlotowki = Integer.valueOf(input[1]);
        int kwotagroszy = Integer.valueOf(input[2]);

            while (kwotazlotowki >0) {
                for (int i = 0; i < banknoty.length; i++) {
                    if (kwotazlotowki >= banknoty[i]) {
                        kwotazlotowki = kwotazlotowki - banknoty[i];
                        banknotypusty[i]++;
                        System.out.println("Wydac musimy : \n" + banknotypusty[i] + "x" + banknoty[i]);
                        break;



                    }
                }
            }
        while (kwotagroszy >0) {
            for (int i = 0; i < grosze.length; i++) {
                if (kwotagroszy >= grosze[i]) {
                    kwotagroszy = kwotagroszy - grosze[i];
                    groszepusty[i]++;
                    System.out.println("Wydac musimy : \n" + groszepusty[i] + "x" + grosze[i]);
                    break;
                }

            }
        }
    }
}
