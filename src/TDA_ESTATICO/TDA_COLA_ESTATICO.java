package TDA_ESTATICO;

public class TDA_COLA_ESTATICO {

    private Object[] arreglo =new Object[100];
    private int maxSize = arreglo.length;
    private int frente=0;
    private int fin=-1;
    private int numElementos=0;

    public void insertar(Object elemento) {
        if (estaLlena()) {
            System.out.println("La cola está llena");
        }
        else{
            fin++;
            arreglo[fin] = elemento;
            numElementos++;
        }
    }
    public Object eliminar() {
        if (estaVacia()) {
            return"La cola está vacía";
        }
        Object desencolado = arreglo[frente];
        frente++;
        numElementos--;
        return desencolado;
    }
    public boolean estaVacia() {
        return (numElementos == 0);
    }
    public boolean estaLlena() {
        return (numElementos == maxSize);
    }

    public int size() {
        return numElementos;
    }
}
