package Algorithms;


public class NajwiekszyWspolnyDzielnik extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Obliczamy największy wspólny dzielnik";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int k = Integer.parseInt(input[1]);
        int n = Integer.parseInt(input[2]);
        System.out.println(NajwiekszyWspolnyDzielnik(k,n));
    }
    private int NajwiekszyWspolnyDzielnik(int k, int n) {
        if (k == 0) {
            return n ;
        }
        return NajwiekszyWspolnyDzielnik(n%k,k);
    }
}
