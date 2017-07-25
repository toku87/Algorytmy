package Algorithms;


public class Silnia extends AbstractAlgorithm {


    @Override
    public String getName() {
        return "liczenie silni" ;
    }

    @Override
    public void runAlgorithm(String[] input) {
        int n = Integer.parseInt(input[1]);
        System.out.println(Silnia(n));
    }
    private int Silnia (int n) {
        if (n < 2 )
            return 1;
        return n * Silnia(n-1);
    }
}
