import Algorithms.AbstractAlgorithm;

public class Main {
    public static void main(String[] args) throws Exception {
        String algorithmName = args[0];

        AlgorithmFabric factory = new AlgorithmFabric();
        AbstractAlgorithm algorithm =
                factory.getAlgorithm(algorithmName);

//        for (String s : args) {
//            System.out.println(s);}


    }
}
