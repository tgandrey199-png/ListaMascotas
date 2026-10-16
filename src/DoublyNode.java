public class DoublyNode<T> {
    private T data;
    private DoublyNode<T> next;
    private DoublyNode<T> prev;

    public DoublyNode(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    DoublyNode<T> getNext() {
        return next;
    }

    void setNext(DoublyNode<T> next) {
        this.next = next;
    }

    DoublyNode<T> getPrev() {
        return prev;
    }

    void setPrev(DoublyNode<T> prev) {
        this.prev = prev;
    }

    @Override
    public String toString() {
        return "[" + data + "]";
    }
}
