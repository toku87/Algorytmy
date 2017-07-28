package Algorithms;

public class BiednyCamelCase extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Biedny Camel Case";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int letters = 0;
        for(int i = 1; i<input.length; i++)
        {
            String word = input[i];
            char[] lettersInWord = word.toCharArray();
            for (int j = 0; j < lettersInWord.length; j++)

            {
                if (letters % 2 == 0)
                {
                    System.out.print(Character.toString(lettersInWord[j]).toUpperCase());
                }
                else
                {
                    System.out.print(Character.toString(lettersInWord[j]).toLowerCase());
                }
                letters++;
            }
            System.out.print(" ");
        }
    }
}
