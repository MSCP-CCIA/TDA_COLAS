package TALLER;
import TDA_LISTA.TDA_COLA_LISTA;
import java.util.ArrayList;
import java.util.Stack;
public class Main_3 {
    static ArrayList<Integer> listaN = new ArrayList<>();
    static Stack<Integer> pilaN = new Stack<>();
    static Stack<Integer> pilaAux = new Stack<>();
    static TDA_COLA_LISTA colaNumeros = new TDA_COLA_LISTA();
    public static void main(String[] args) {
        llenarlista();
        llenarPila(listaN.size()-1);
        llenarCola(pilaN,3);
        System.out.println(colaNumeros.toString());
        System.out.println(colaNumeros.size());
        imprimir(pilaAux,pilaAux.size()-1);
    }
    public static void llenarlista(){
        for (int i = 0; i < 40; i++) {
            listaN.add(0,(int)(Math.random()*10+1));
        }
        System.out.println(listaN.toString());

    }
    public static Stack<Integer> llenarPila( int indice) {
        if (indice <0) {
            return pilaN;
        } else {
            pilaN.push(listaN.get(indice));
            return llenarPila(indice - 1);
        }
    }
    public static Stack<Integer> imprimir (Stack pila, int indice) {
        if(indice<0){
            return pila;
        }
        else{
            System.out.print(pila.pop()+" ");
            return imprimir(pila,indice-1);
        }
    }
    public static TDA_COLA_LISTA llenarCola(Stack pila, int numero){
        while(pila.size()!=0){
            if((int)pila.peek()==numero){
                colaNumeros.encolar((int)pila.pop());
            }
            else{
                pilaAux.push((int)pila.pop());
            }
        }
        return colaNumeros;
    }
}
