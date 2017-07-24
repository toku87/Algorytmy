package Algorithms;

/**
 * Created by RENT on 2017-07-24.
 */
public class RokPrzestepny extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Rok przestepny";
    }

    @Override
    public void runAlgorithm(String[] input) {



        for (int i = 2; i < input.length ; i++) {
            int rok = Integer.valueOf(input[i]);
            if ((Integer.valueOf(input[i]) % 4 == 0) && (Integer.valueOf(input[i]) % 100 !=0 ) || (Integer.valueOf(input[i]) % 400 == 0)){
                System.out.println(rok + "  TAK");}
            else{
                System.out.println(rok + "  NIE");
            }

    }
}
}








