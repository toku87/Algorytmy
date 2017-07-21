import Algorithms.AbstractAlgorithm;
import Algorithms.BiednyCamelCase;
import Algorithms.Test;


public class AlgorithmFabric {
    public AbstractAlgorithm getAlgorithm (String name) throws Exception {
        switch (name.toLowerCase()) {
            case "test":
                return new Test();
            case "biednycamelcase" :
                return new BiednyCamelCase();

                default:
                    throw new Exception("Brak algorytmu");
        }
    }
}
