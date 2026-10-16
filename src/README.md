# Lista doblemente ligada de Mascotas

Proyecto Java basado en el repositorio de ejemplo DoublyLinkedList. La clase `Book` fue reemplazada por una clase propia llamada `Mascota`.

## Clases

- `Mascota.java`: representa una mascota con nombre y especie.
- `DoublyNode.java`: nodo que guarda el dato y referencias al nodo anterior y siguiente.
- `DoublyLinkedList.java`: implementa la lista doblemente ligada y sus recorridos.
- `Main.java`: crea una lista, agrega tres mascotas y ejecuta la transversa inversa.

## Ejecución

Abre el proyecto en IntelliJ IDEA y ejecuta la clase `Main`.

La salida esperada es similar a:

```text
Transversa inversa de la lista de mascotas:
[Luna (Conejo)] [Michi (Gato)] [Max (Perro)]
```

La transversa inversa empieza en el último nodo (`tail`) y avanza usando la referencia al nodo anterior (`prev`).
