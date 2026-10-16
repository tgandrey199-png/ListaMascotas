public class DoublyLinkedList<T> {
    private DoublyNode<T> head;
    private DoublyNode<T> tail;
    private int size;

    public DoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        return size;
    }

    // Recorre la lista desde el primer elemento hasta el último.
    public void traverse() {
        DoublyNode<T> current = head;
        while (current != null) {
            System.out.print(current + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    // Transversa inversa: recorre desde el último elemento hasta el primero.
    public void traverseBackward() {
        DoublyNode<T> current = tail;
        while (current != null) {
            System.out.print(current + " ");
            current = current.getPrev();
        }
        System.out.println();
    }

    public void insertFirst(T data) {
        DoublyNode<T> newNode = new DoublyNode<>(data);

        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.setNext(head);
            head.setPrev(newNode);
            head = newNode;
        }
        size++;
    }

    public void insertLast(T data) {
        DoublyNode<T> newNode = new DoublyNode<>(data);

        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            newNode.setPrev(tail);
            tail = newNode;
        }
        size++;
    }

    public boolean contains(T data) {
        DoublyNode<T> current = head;
        while (current != null) {
            if (current.getData().equals(data)) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    public boolean remove(T data) {
        DoublyNode<T> current = head;
        while (current != null && !current.getData().equals(data)) {
            current = current.getNext();
        }

        if (current == null) {
            return false;
        }

        if (current.getPrev() == null) {
            head = current.getNext();
        } else {
            current.getPrev().setNext(current.getNext());
        }

        if (current.getNext() == null) {
            tail = current.getPrev();
        } else {
            current.getNext().setPrev(current.getPrev());
        }

        size--;
        return true;
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }
}
