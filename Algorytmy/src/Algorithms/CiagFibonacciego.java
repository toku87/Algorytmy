package Algorithms;


public class CiagFibonacciego extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "liczymy ciag Fibonacciego";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int n = Integer.parseInt(input[1]);
        System.out.println(CiagFibonacciego(n));
    }
    private int CiagFibonacciego(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return (CiagFibonacciego(n - 1)) + (CiagFibonacciego(n - 2));
    }
}
