package Algorithms;


public class BiednyCamelCase extends AbstractAlgorithm {


    @Override
    public String getName() {
        return "biednycamelcase";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int literka = 0;

        for (int i = 1; i < input.length ; i++) {
            String word = input[i];
            char[] Array = word.toCharArray();
            for (int j = 0; j < Array.length ; j++) {

                if (literka %2 == 0 ) {
                    Character.toString(Array[j]).toUpperCase();
                }
                else {
                    Character.toString(Array[j]).toLowerCase();
                }
                literka++;
            }

        }

    }
}
