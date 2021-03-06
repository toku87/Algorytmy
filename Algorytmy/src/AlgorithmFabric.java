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
            case "wydawaniepieniedzy" :
                return new WydawaniePieniedzy();
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
            case "tablicawyszukiwaniaminmax":
                return new TablicaWyszukiwaniaMinMax();
            case "testowanielisty" :
                return new TestowanieListy();
            case "dzialanienalistach":
                return new DzialanieNaListach();
            case "prostedrzewo" :
                return new ProsteDrzewo();
            case "testkopca" :
                return new TestKopca();
            case "przeliczaniesystemow":
                return new PrzeliczanieSystemow();
            case "onp":
                return new ONP();
            case "duplikat":
                return new Duplikat();
            case "todelete":
                return new ToDelete();
            case "odwrotnanotacja2":
                return new OdwrotnaNotacja2();
            case "nww":
                return new NajwiekszaWspolnaWielokrotnosc();
            case "spacjecamelcase":
                return new SpacjeCamelCase();

                default:
                    throw new Exception("Brak algorytmu");
        }
    }
}
