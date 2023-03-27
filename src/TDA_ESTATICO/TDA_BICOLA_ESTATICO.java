package TDA_ESTATICO;

public class TDA_BICOLA_ESTATICO {
    private Object[] arreglo =new Object[100];
    private int maxSize = arreglo.length;
    private int frente=0;
    private int fin=-1;
    private int numElementos=0;
    public void insertarFrente(Object elemento) {
        if (estaLlena()) {
            System.out.println("La bicola está llena");
            return;
        }
        if (frente == 0) {
            frente = maxSize - 1;
        } else {
            frente--;
        }
        arreglo[frente] = elemento;
        numElementos++;
    }
    public void insertarFin(Object elemento) {
        if (estaLlena()) {
            System.out.println("La bicola está llena");
            return;
        }
        fin++;
        if (fin == maxSize) {
            fin = 0;
        }
        arreglo[fin] = elemento;
        numElementos++;
    }
    public Object eliminarFrente() {
        if (estaVacia()) {
            return"La bicola está vacía" ;
        }
        Object desencolado = arreglo[frente];
        frente++;
        if (frente == maxSize) {
            frente = 0;
        }
        numElementos--;
        return desencolado;
    }

    public Object eliminarFin() {
        if (estaVacia()) {
            System.out.println("La bicola está vacía");
            return -1;
        }
        Object desencolado = arreglo[fin];
        fin--;
        if (fin < 0) {
            fin = maxSize - 1;
        }
        numElementos--;
        return desencolado;
    }

    public boolean estaVacia() {
        return (numElementos == 0);
    }
    public boolean estaLlena() {
        return (numElementos == maxSize);
    }

    public int numElementos() {
        return numElementos;
    }
}
