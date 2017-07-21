import Algorithms.AbstractAlgorithm;

public class Main {
    public static void main(String[] args) throws Exception {
        String algorithmName = args[0];

        AlgorithmFabric factory = new AlgorithmFabric();
        AbstractAlgorithm algorithm =
                factory.getAlgorithm(algorithmName);

//        System.out.println("Wykonujemy algorytm" + algorithm.getName());

        algorithm.runAlgorithm(args);



//        for (String s : args) {
//            System.out.println(s);}


    }
}
