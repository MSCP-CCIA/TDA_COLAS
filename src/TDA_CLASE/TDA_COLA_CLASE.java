package TDA_CLASE;

public class TDA_COLA_CLASE {
    private Nodo frente=null;
    private Nodo fin=null;


    public boolean estaVacia() {
        return (frente == null);
    }

    public void insertar(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (estaVacia()) {
            frente = nuevoNodo;
            fin = nuevoNodo;
        } else {
            fin.setSiguiente(nuevoNodo);
            fin = nuevoNodo;
        }
    }

    public Object eliminar() {
        Object datoEliminado = frente.getDato();
        frente = frente.getSiguiente();
        if (frente == null) {
            fin = null;
        }
        return datoEliminado;
    }

    public Object obtenerFrente() {
        return frente.getDato();
    }
}
