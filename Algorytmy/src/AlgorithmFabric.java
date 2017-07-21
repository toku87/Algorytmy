import Algorithms.AbstractAlgorithm;
import Algorithms.Test;


public class AlgorithmFabric {
    public AbstractAlgorithm getAlgorithm (String name) throws Exception {
        switch (name.toLowerCase()) {
            case "test":
                return new Test();

                default:
                    throw new Exception("Brak algorytmu");
        }
    }
}
