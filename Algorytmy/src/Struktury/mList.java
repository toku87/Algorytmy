package Struktury;


public class mList {

    Element _head;
    Element _tail;
    int counter;

    public void goThroughListForward(mList list) {
        Element p = list._head;
        while (p.next != null) {
            p = p.next;
        }
    }

    public void goThroughListBackward(mList list) {
        Element p = list._tail;
        while (p.prev != null) {
            p = p.prev;
        }
    }

    public void addElementAtBeginning(int newElement, mList list) {
        Element p = new Element();
        p.data = newElement;
        p.prev = null;
        p.next = list._head;
        list._head = p;
        list.counter++;

        if (p.next != null) {
            Element nextEl = p.next;
            nextEl.prev = p;
        } else {
            list._tail = p;
        }

    }

    public void addElementAtEnd(int newElement, mList list) {
        Element p = new Element();
        p.data = newElement;
        p.prev = list._tail;
        p.next = null;
        list._tail = p;
        list.counter++;

        if (p.prev != null) {
            Element prevEl = p.prev;
            prevEl.prev = p;
        } else {
            list._tail = p;
        }
    }

    public Element getElementForward(int data, mList list) {
        Element p = list._head;
        while (p.next != null) {
            if (p.data == data) {
                break;
            }
            p = p.next;
        }
        return p;
    }

    public Element getElementBackward (int data, mList list) {
        Element p = list._tail;
        while (p.prev != null) {
            if (p.data == data) {
                break;
            }
            p=p.prev;
        }
        return p;
    }

    public void printAllElements (mList list) {
        Element p = list._head;
        while (p != null) {
            System.out.println(p.data);
            p = p.next;

        }
    }
    public void addElementBeforeElement ( int elementToAdd, int elementBefore, mList list) {
        Element before = list.getElementForward(elementBefore, list);

        if (before == list._head) {
            list.addElementAtBeginning(elementToAdd, list);
        }else {
            Element p = new Element();
            p.data = elementToAdd;
            p.prev = before.prev;
            p.next = before;
            Element prevBefore = before.prev;
            prevBefore.next = p;
            before.prev = p;
            list.counter++;
        }
    }
    public void addElementAfterElelemnt (int elementToAdd, int elementAfter, mList list) {
        Element after = list.getElementBackward(elementAfter, list);

        if (after == list._tail) {
            list.addElementAtEnd(elementToAdd, list);
        }else {
            Element p = new Element();
            p.data = elementToAdd;
            p.prev = after;
            p.next = after.next;
            Element afterNext = after.next;
            afterNext.prev = p;
            after.next = p;
            list.counter++;

        }
    }
}
