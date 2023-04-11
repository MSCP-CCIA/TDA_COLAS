package TALLER;

public class Contenedor {
    private int codigo;
    private String nombre;

    public Contenedor(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Contenedor{" + "codigo=" + codigo + ", nombre=" + nombre + '}';
    }
}
