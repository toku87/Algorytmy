package Algorithms;

public class SilniaCase  extends AbstractAlgorithm{
    @Override
    public String getName() {
        return "sprawdzamy jaka silnia";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int b = Integer.parseInt(input[1]);

        switch (b) {
            case 1 :
                System.out.println("0  1");
                break;
            case 2 :
                System.out.println("0  2");
                break;
            case 3 :
                System.out.println("0  6");
                break;
            case 4 :
                System.out.println("2  4");
                break;
            case 5 :
            case 6 :
            case 8 :
                System.out.println("2  0");
                break;
            case 7 :
                System.out.println("4  0");
                break;
            case 9 :
                System.out.println("8  0");
                break;
                default:
                    System.out.println("0  0");

        }

    }
}
