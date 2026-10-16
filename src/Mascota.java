import java.util.Objects;

public class Mascota {
    private final String nombre;
    private final String especie;

    public Mascota(String nombre, String especie) {
        this.nombre = nombre;
        this.especie = especie;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    @Override
    public String toString() {
        return nombre + " (" + especie + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mascota mascota = (Mascota) o;
        return Objects.equals(nombre, mascota.nombre)
                && Objects.equals(especie, mascota.especie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, especie);
    }
}
