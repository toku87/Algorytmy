package Struktury;


public class OneWayList {

    OneWayListElement _head;
    int _counter;

    public void addElementAtBeginning (int newElement) {
        OneWayListElement p = new OneWayListElement();
        p._data = newElement;
        p.next = _head;
        _head = p;
        _counter++;
    }
    public OneWayListElement getLastElement() {
        OneWayListElement iterator;
        iterator = _head;
        while (iterator.next != null) {
            iterator = iterator.next;
        }
        return iterator;
    }
    public void addElementAtEnd (int newEelement) {
        OneWayListElement p = new OneWayListElement();
        p._data = newEelement;
        OneWayListElement lastOne = getLastElement();
        lastOne.next = p;
    }
    public void getElementForward (int data){
        OneWayListElement p = new OneWayListElement();
        while (p.next !=null) {
            if (p._data == data)
                break;
        }
        p = p.next;
    }
    public void addElementBeforeElement (int elementToAdd, int elementBefore){

    }
}
