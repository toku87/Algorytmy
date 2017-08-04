package Algorithms;

import Struktury.Kopiec;

public class TestKopca  extends AbstractAlgorithm{

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void runAlgorithm(String[] input) {

      int n = input.length - 1;
        Kopiec kopiec = new Kopiec(n);

        for (int i = 1; i <input.length ; i++) {
            int newElement = Integer.parseInt(input[i]);
            kopiec.insertElement(newElement);
        }
        kopiec.printElements();
        }
    }

