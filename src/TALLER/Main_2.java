package TALLER;

import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;

public class Main_2 {
    public static void main(String[] args) {
        llenarBodega(5);
        mostrar();
        eliminar(7, Bodega.size()-1);
        mostrar();
    }
    public static Random ran = new Random();
    public static ArrayList<Stack> Bodega = new ArrayList<>();
    public static Stack<Contenedor> aux = new Stack<>();

    public static boolean comprobarContenedor(Contenedor cont, Stack<Contenedor> pila) {
        if (pila.isEmpty()) {
            while (!aux.isEmpty()) {
                pila.push(aux.pop());
            }
            return false;
        } else {
            if (pila.peek().getCodigo() == cont.getCodigo()) {
                while (!aux.isEmpty()) {
                    pila.push(aux.pop());
                }
                return true;
            } else {
                aux.push(pila.pop());
                return comprobarContenedor(cont, pila);
            }
        }
    }

    public static Stack llenarPila(int i, Stack<Contenedor> pila) {
        if (i < 1) {
            return pila;
        } else {
            Contenedor contenedor = new Contenedor(ran.nextInt(1, 11), "Empresa " + i);
            if (comprobarContenedor(contenedor, pila)) {
                return llenarPila(i, pila);
            } else {
                pila.push(contenedor);
                return llenarPila(i - 1, pila);
            }
        }
    }


    public static void llenarBodega(int i) {
        while (Bodega.size() < i) {
            Stack<Contenedor> pila = new Stack<>();
            Bodega.add(llenarPila(ran.nextInt(1, 10), pila));
        }
    }


    public static void eliminar(int codigo, int i) {
        if (i < 0) {
            System.out.println("Elemento no encontrado");
        } else {
            if (!Bodega.get(i).isEmpty()) {
                Contenedor cont = (Contenedor) Bodega.get(i).peek();
                if (cont.getCodigo() != codigo) {
                    aux.push((Contenedor) Bodega.get(i).pop());
                    eliminar(codigo, i);
                } else {
                    Bodega.get(i).pop();
                    while (!aux.isEmpty()) {
                        Bodega.get(i).push(aux.pop());
                    }
                    System.out.println("Elemento eliminado de la pila " + (i + 1));
                }
            } else {
                while (!aux.isEmpty()) {
                    Bodega.get(i).push(aux.pop());
                }
                eliminar(codigo, i - 1);
            }
        }
    }

    public static void mostrar() {
        for (Stack i : Bodega) {
            System.out.println(i.toString());
        }
    }
}
