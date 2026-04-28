package control;

import model.Contact;
import model.Node;

public class CircularLinkedList {
    private Node tail;
    private int size;


    public CircularLinkedList() {
        this.tail = null;
        this.size = 0;

    }

    //insertar al final de la lista
    public void add(Contact contact) {
        Node newNode = new Node(contact);

        if (tail == null) {
            //lista vacia
            tail = newNode;
            tail.setNext(tail);

        } else {
            //lista con mas de un elemto
            newNode.setNext(tail.getNext());
            tail.setNext(newNode);
            tail = newNode;
        }
        size++;

    }

    //buscar por nombre

    public Contact findByName(String name) {
        if (tail == null) return null;
        Node current = tail.getNext();//primer nombre

        do {

            if (current.getValue().getFullName().equalsIgnoreCase(name)) {
                return current.getValue();
            }
            current = current.getNext();

        } while (current != tail.getNext());
        return null;
    }

    public boolean deleteByname(String name) {
        if (tail == null) return false;

        Node current = tail.getNext();
        Node previous = tail;
        do {

            if (current.getValue().getFullName().equalsIgnoreCase(name)) {
                // case 1: unico nodo
                if (current == tail && current.getNext() == tail) {
                tail = null;
                }
                // case 2: cuando el nodo es el primero, osea eliminar primer nodo
                else if (current==  tail.getNext()){
                    tail. setNext(current.getNext());
                }
                // case 3: cuando el nodo a eliminar sea el ultimo
                else if (current==tail){
                    previous.setNext(current.getNext());
                    tail = previous;                }

// case 4: eliminar el nodo intermedio
            else {
                previous.setNext(current.getNext());
            }
            size --;
            return true;
            }
        } while (current != tail.getNext());
        return false;
    }
}
