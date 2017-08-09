package Algorithms;


import java.util.Stack;

public class ONP extends AbstractAlgorithm{
    @Override
    public String getName() {
        return null;
    }

    @Override
    public void runAlgorithm(String[] input) {

        Stack <Integer> stack = new Stack<>();
        int v1 = 0;
        int v2 = 0;

        for (int i = 1; i <input.length ; i++) {
            String znak = input[i];
            switch (znak) {
                case "D" :
                    v1 = stack.pop();
                    v2 = stack.pop();
                    stack.push(v1+v2);
                    break;
                case "O" :
                    v1 = stack.pop();
                    v2 = stack.pop();
                    stack.push(v1 - v2);
                    break;
                case "M" :
                    v1 = stack.pop();
                    v2 = stack.pop();
                    stack.push(v1 * v2);
                    break;
                case "I" :
                    v1 = stack.pop();
                    v2 = stack.pop();
                    stack.push(v1 / v2);
                    break;
                case "R":
                    System.out.println(stack.peek());
                    break;
                default:
                    stack.push(Integer.parseInt(input[i]));
                    break;
            }
        }
    }
}