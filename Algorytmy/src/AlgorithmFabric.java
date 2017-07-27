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
            case "silnia" :
                return new Silnia();
            case "sumaliczbrekur" :
                return new SumaLiczbRekur();
            case "silniacase" :
                return new SilniaCase();
            case "ciagfibonacciego":
                return new CiagFibonacciego();
            case "szyfrcezara" :
                return new SzyfrCezara();
            case "sortowaniebabelkowe" :
                return new SortowanieBabelkowe1();
            case "sortowaniewzgledempunktu" :
                return new SortowanieWzgledemPunktu();
            case "sortowanieprzezzliczanie" :
                return new SortowaniePrzezZliczanie();
            case "prostetablice" :
                return new ProsteTablice();
            case "krzyzowka" :
                return new Krzyzowka();

                default:
                    throw new Exception("Brak algorytmu");
        }
    }
}
