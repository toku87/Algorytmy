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
                return new SortowanieBabelkowe();
            case "sortowaniewzgledempunktu" :
                return new SortowanieWzgledemPunktu();
            case "sortowanieprzezzliczanie" :
                return new SortowaniePrzezZliczanie();
            case "prostetablice" :
                return new ProsteTablice();
            case "krzyzowka" :
                return new Krzyzowka();
            case "najwiekszywspolnydzielnik" :
                return new NajwiekszyWspolnyDzielnik();
            case "warcaby" :
                return new Warcaby();
            case "dominanta" :
                return new Dominanta();
            case "wielkanoc":
                return new Wielkanoc();
            case "tablice":
                return new Tablice();


                default:
                    throw new Exception("Brak algorytmu");
        }
    }
}
