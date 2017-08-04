package Algorithms;


import java.util.Stack;

public class PrzeliczanieSystemow extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "przeliczamy liczby na wybrany system";
    }

    @Override
    public void runAlgorithm(String[] input) {
        Integer L = Integer.parseInt(input[1]);
        Integer p = Integer.parseInt(input[2]);

        Stack<Integer> S = new Stack<>();

        while (L > 0) {
            S.push(L % p);
            L = Math.floorDiv(L, p);
        }

        while (!S.empty())
            System.out.println(S.pop());
    }
}
