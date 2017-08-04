package Struktury;


public class Kopiec {
    int _date[];
    int _counter = 0;

    public Kopiec(int n) {
        _date = new int[n];
    }

    public void insertElement(int element) { //metoda wstawiająca elementy do kopca
        int i = _counter++;
        int j = (_counter - 1) / 2;

        while ((i > 0) && _date[j] < element) {
            _date[i] = _date[j];
            i = j;
            j = ((i - 1) / 2);
        }
        _date[i] = element;
    }

    public void printElements() {

        for (int i : _date) {
            System.out.println(i);
        }
    }
}


