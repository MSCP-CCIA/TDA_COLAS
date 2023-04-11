package TALLER;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class Main_4 {
    public static void main(String[] args) {
        listaCadena = "ABBDYCA&ACYDBBA".toCharArray();
        validarCadenaPila();
        validarCadenaCola();
        validarCadenaChar(0);
}

    public static char[] listaCadena;
    public static void validarCadenaPila() {
        Stack<Character> pila = new Stack<>();
        pila = apilar(0, pila);
        for (char c: listaCadena) {
            if (!pila.isEmpty()) {
                if (pila.peek() == c) {
                    pila.pop();
                } else {
                    if (pila.peek() != '&') {
                        System.out.println("NO PERTENECE A LA FORMA X&Y");
                        return;
                    }
                }
            } else {
                System.out.println("NO PERTENECE A LA FORMA X&Y");
                return;
            }
        }
        if (pila.isEmpty()) {
            System.out.println("SI PERTENECE A LA FORMA X&Y");
        } else {
            System.out.println("NO PERTENECE A LA FORMA X&Y");
        }
    }
    public static Stack apilar(int i, Stack<Character> pila) {
        if (listaCadena[i] == '&' || i >= listaCadena.length-1) {
            pila.push(listaCadena[i]);
            return pila;
        } else {
            pila.push(listaCadena[i]);
            return apilar(i + 1, pila);
        }
    }
    public static void validarCadenaCola() {
        Queue<Character> cola = new LinkedList<>();
        cola = encolar(0, cola);
        for (int i = listaCadena.length-1; i >= 0; i--) {
            if (!cola.isEmpty()) {
                if (cola.peek() == listaCadena[i]) {
                    cola.poll();
                } else {
                    if (cola.peek() != null) {
                        System.out.println("NO PERTENECE A LA FORMA X&Y");
                        return;
                    }
                }
            } else {
                if (listaCadena.length/2 == i + 1){
                    System.out.println("SI PERTENECE A LA FORMA X&Y");
                    return;
                } else {
                    System.out.println("NO PERTENECE A LA FORMA X&Y");
                    return;
                }
            }
        }
    }
    public static Queue encolar(int i, Queue<Character> cola) {
        if (listaCadena[i] == '&' || i >= listaCadena.length-1) {
            cola.add(listaCadena[i]);
            return cola;
        } else {
            cola.add(listaCadena[i]);
            return encolar(i + 1, cola);
        }
    }
    public static void validarCadenaChar(int i) { //i debe ser siempre 0.
        if (listaCadena[i] == '&' && listaCadena[listaCadena.length-(1+i)] == '&') {
            System.out.println("SI PERTENECE A LA FORMA X&Y");
        } else {
            if (listaCadena[i] == listaCadena[listaCadena.length-(1+i)]) {
                validarCadenaChar(i + 1);
            } else {
                System.out.println("NO PERTENECE A LA FORMA X&Y");
            }
        }
    }
}
