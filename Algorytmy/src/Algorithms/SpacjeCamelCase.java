package Algorithms;


public class SpacjeCamelCase extends AbstractAlgorithm{
    @Override
    public String getName() {
        return "Drukujemy CamelCase bez spacji";
    }

    @Override
    public void runAlgorithm(String[] input) {
    int firstLetter  = 1;
        String s1 = "";
        for (int i = 1; i <input.length ; i++) {
            String word = input[i];
            System.out.println(s1 = Character.toString(word.charAt(0)).toUpperCase());
        }
    }
}
