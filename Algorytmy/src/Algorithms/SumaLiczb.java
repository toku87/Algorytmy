package Algorithms;

public class SumaLiczb extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "suma liczb";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int suma = 0;
        for (int i = 1; i <input.length ; i++) {
            suma = suma + Integer.parseInt(input[i]);

            System.out.println(suma);
        }
        System.out.println("Ostateczna wartość :" + suma);

    }
}
