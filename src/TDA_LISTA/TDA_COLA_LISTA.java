package TDA_LISTA;

import java.util.ArrayList;
import java.util.Arrays;

public class TDA_COLA_LISTA {
    ArrayList<Object> cola = new ArrayList<>();


    public  boolean estavacia(){
        return cola.isEmpty();
    }
    public  void encolar(Object dato){
        cola.add(dato);
    }
    public  Object decolar(){
        if (estavacia()){
            return "la cola esta vacia";
        }
        else {
            return cola.remove(0);
        }
    }
    public Object peek(){
        return cola.get(cola.size()-1);
    }
    public Object peekLast(){
        return cola.get(0);
    }
    public int size(){
        return cola.size();
    }
    @Override
    public String toString() {
        return String.valueOf(cola);
    }
}
