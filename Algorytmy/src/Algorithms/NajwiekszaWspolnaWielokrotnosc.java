package Algorithms;

public class NajwiekszaWspolnaWielokrotnosc extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Liczymy największy wspólną wielokrotność";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int k = Integer.parseInt(input[1]);
        int n = Integer.parseInt(input[2]);
        System.out.println("Największą wspólną wielokrotnością liczb "
                + input[1] + " i " + input[2] + " jest liczba " + NajwiekszaWspolnaWielokrotnosc(k,n));
    }
    private int NajwiekszyWspolnyDzielnik(int k, int n) {
        if (k == 0) {
            return n;
        }
        return NajwiekszyWspolnyDzielnik(n % k, k);
    }
    private int NajwiekszaWspolnaWielokrotnosc (int k, int n) {
        int nww = (k * n) / NajwiekszyWspolnyDzielnik(n,k);
        return nww;
    }
}
