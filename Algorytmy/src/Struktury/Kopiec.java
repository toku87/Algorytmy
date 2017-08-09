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

    public int deleteRoot() {


        int root = -1;
        int lastElement = -1;
        int i = 0;
        int j = 0;

        if (_counter > 0) {
            _counter--;
            root = _date[0];
            lastElement = _date[_counter];
            i = 0;
            j = 1;
            while (j < _counter) {
                if (j + 1 < _counter && _date[j + 1] > _date[j]) {
                    j = j + 1;
                }
                if (lastElement >= _date[j]) {
                    break;
                } else {
                    _date[i] = _date[j];
                    i = j;
                    j = 2 * j + 1;
                }
            }
            _date[i] = lastElement;
        }
        return root;
    }
    public void sortSheep() {
        int size = _counter;
        int[] sorted = new int[size];

        for (int i = 0; i < size; i++) {
            sorted[i] = deleteRoot();
        }
        for (int i : sorted) {
            System.out.println(i);
        }
    }
}


















