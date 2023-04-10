package TDA_RING_COLA;

import java.util.Arrays;

public class TDA_RING_COLA {
    private Object[] queue =new Object[40];
    private int inicio = -1;
    private int fin = -1;
    private int size = 0;


    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == queue.length;
    }

    public int size() {
        return size;
    }

    public void enqueue(Object dato) {
        if (isFull()) {
            System.out.println("La cola está llena");
        }
        if (isEmpty()) {
            inicio = 0;
        }
        fin = (fin + 1) % queue.length;
        queue[fin] = dato;
        size++;
    }

    public Object dequeue() {
        if (isEmpty()) {
            return "La cola está vacía";
        }
        else {
            Object dato = queue[inicio];
            inicio = (inicio + 1) % queue.length;
            size--;
            return dato;
        }
    }

    public Object peek() {
        if (isEmpty()) {
            return "La cola está vacía";
        }
        return queue[inicio];
    }

    public Object[] getQueue() {
        return queue;
    }

    public int getInicio() {
        return inicio;
    }

    public int getFin() {
        return fin;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return  Arrays.toString(queue);
    }
}
