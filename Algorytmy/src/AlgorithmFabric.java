import Algorithms.*;


public class AlgorithmFabric {
    public AbstractAlgorithm getAlgorithm (String name) throws Exception {
        switch (name.toLowerCase()) {
            case "test":
                return new Test();
            case "biednycamelcase" :
                return new BiednyCamelCase();
            case "sumowanieliczbnaturalnych" :
                return new SumowanieLiczbNaturalnych();
            case "sumowanieliczb" :
                return new SumaLiczb();
            case "wydawaniekasy" :
                return new WydawanieKasy();
            case "rokprzestepny" :
                return new RokPrzestepny();

                default:
                    throw new Exception("Brak algorytmu");
        }
    }
}
