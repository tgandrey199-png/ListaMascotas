public class Main {
    public static void main(String[] args) {
        // Crear una lista doblemente ligada de mascotas.
        DoublyLinkedList<Mascota> mascotas = new DoublyLinkedList<>();

        // Agregar tres elementos al final de la lista.
        mascotas.insertLast(new Mascota("Max", "Perro"));
        mascotas.insertLast(new Mascota("Michi", "Gato"));
        mascotas.insertLast(new Mascota("Luna", "Conejo"));

        System.out.println("Transversa inversa de la lista de mascotas:");
        mascotas.traverseBackward();
    }
}
