package Algorithms;


public class SumaLiczbRekur extends AbstractAlgorithm{
    @Override
    public String getName() {
        return "sumujemy liczby silnia";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int n = Integer.parseInt(input[1]);
        System.out.println(SumaLiczbRekur(n));
    }
    private int SumaLiczbRekur(int n) {
        if (n <2)
            return 1;
        return n + SumaLiczbRekur(n - 1);
    }
}
