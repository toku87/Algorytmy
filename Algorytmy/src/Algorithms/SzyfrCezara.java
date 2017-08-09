package Algorithms;


public class SzyfrCezara extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "syfrujemy szyfrem cezara";
    }

    private String[] _litery = {"a", "b", "c", "d", "e", "f", "g", "h", "i",
            "j", "k", "l", "m", "n", "o", "p", "r", "s", "t", "u", "w", "x", "y", "z"};


    @Override
    public void runAlgorithm(String[] input) {
        for (int i = 1; i < input.length; i++) {
            String word = input[i].toLowerCase();
            char [] lettersInWord = word.toCharArray();
            for (int letter = 0; letter < lettersInWord.length ; letter++) {
                int position = getLetterPosition(Character.toString(lettersInWord[letter]));
                int move = (position + 3)%_litery.length;
                System.out.printf("%s",_litery[move]);
            }
        }
    }

    private int getLetterPosition(String letter) {
        for (int i = 0; i < _litery.length; i++) {
            if (letter.equals(_litery[i])) {
                return i;
            }
        }
        return -1;
    }
}














