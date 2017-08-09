package Algorithms;


import java.util.Stack;

public class OdwrotnaNotacja2 extends AbstractAlgorithm{
    @Override
    public String getName() {
        return "Wykonujemy odwrotna notację ver 2.0";
    }

    @Override
    public void runAlgorithm(String[] input) {

        Stack<String> stack = new Stack<>();
        String myInput = "( a + b ) * c =";
        String[] myInputArr = myInput.split(" ");
        String helper = " ";

        for (String element: myInputArr) {
            switch (element) {
                case "=":
                    while (!stack.empty()){
                        System.out.printf("%s", stack.pop());
                    }
                    break;
                case "(":
                    stack.push(element);
                    break;
                case ")":
                    helper = stack.pop();
                    while (!helper.equals("(")){
                        System.out.printf("%s",helper);
                        helper = stack.pop();
                    }
                    break;
                case "+":
                case "-":
                case "*":
                case "/":
                case "^":
                    while (!stack.empty()){
                        if (getOperatorPriority(element) == 3 ||
                                getOperatorPriority(element) >= getOperatorPriority(stack.peek())){
                            break;
                        }else {
                            System.out.printf("s", stack.pop());
                        }
                    }
                    stack.push(element);
                    break;
                default:
                    System.out.printf("%s",element);
                    break;
            }

        }

    }
    public int getOperatorPriority (String operator){
        switch (operator){
            case "+" :
            case "-":
                return 1;
            case "*":
            case "/":
                return 2;
            case "^":
                return 3;
        }
        return -1;
    }
}
