package Algorithms;


public class RokPrzestepny extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Rok przestepny";
    }

    @Override
    public void runAlgorithm(String[] input) {



        for (int i = 2; i < input.length ; i++) {
            int rok = Integer.valueOf(input[i]);
            if ((rok % 4 == 0) && (rok % 100 !=0 ) || (rok % 400 == 0)){
                System.out.println(rok + "  TAK");}
            else{
                System.out.println(rok + "  NIE");
            }

    }
}
}








