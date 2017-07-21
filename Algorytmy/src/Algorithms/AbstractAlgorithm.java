package Algorithms;


public abstract class AbstractAlgorithm {

    public AbstractAlgorithm() {
        System.out.println("Konstruktor ABSTRACT algorithm");
    }
    public abstract String getName ();
    public abstract void runAlgorithm(String [] input);
}
