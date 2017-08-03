package Algorithms;


public class SumowanieLiczbNaturalnych extends AbstractAlgorithm {


    @Override
    public String getName() {

        return "Sumowanie Liczb Naturalnych";
}
    @Override
    public void runAlgorithm(String[] input) {

        int n = Integer.parseInt(input[1]);
        int suma = 0;
        int i = 1;
        while (i < n) {
            suma = suma + i;
            System.out.printf("Iteracja : %d ::: Wartość sumy : %d : \n", i, suma);
            i ++;
        }
        System.out.println(suma);
    }
}
