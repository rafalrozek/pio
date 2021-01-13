package edu.kis.vh.nursery.list;
/**
 * @Author Rafal Rozek
 *
 */
public class IntLinkedList {
    /**
     *  Pomocnicza klasa zagniezdzona
     */
    public class Node {
        public int value;
        public Node prev, next;
        public Node(int i) {
            value = i;
        }
    }

    Node last; // ostatni element w liscie
    int i;

    /**
     *
     * @param i - wartosc dodawana do listy
     *
     */
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.next = new Node(i);
            last.next.prev = last;
            last = last.next;
        }
    }

    /**
     *
     * @return true - jesli atrybut last jest rowny null
     */
    public boolean isEmpty() {
        return last == null;
    }

    /**
     *
     * @return false
     *
     */
    public boolean isFull() {
        return false;
    }

    /**
     *
     * @return -1 - jesli lista jest pusta
     * @return int - zwraca wartosc ostatnio dodanego elementu, jesli lista nie jest pusta
     */
    public int top() {
        if (isEmpty())
            return -1;
        return last.value;
    }

    /**
     * Usuwa ostatni element w liscie
     *
     * @return -1 - jesli lista jest pusta
     * @return int - zwraca wartosc usunietego elementu
     */
    public int pop() {
        if (isEmpty())
            return -1;
        int ret = last.value;
        last = last.prev;
        return ret;
    }

}
