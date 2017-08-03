package Algorithms;

import Struktury.mList;

public class TestowanieListy extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "testowanie listy";
    }

    @Override
    public void runAlgorithm(String[] input) {

        mList lista = new mList();
        lista.addElementAtBeginning(14,lista);
        lista.addElementAtBeginning(14, lista);
        lista.addElementBeforeElement(45,14,lista);
        lista.printAllElements(lista);
    }
}
