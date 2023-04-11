package TALLER;
import java.util.ArrayList;
import java.util.Stack;
public class Main_6 {
    public static void main(String[] args) {
        llenarLista(500);
        llenarPila(2, listaDeDatos.size()-1);
        System.out.println(listaDeDatos.toString());
        System.out.println(temperaturas.toString());
        System.out.println(promedio(temperaturas.size()-1, 0, 0));
    }
    public static ArrayList<ArrayList<Integer>> listaDeDatos = new ArrayList<ArrayList<Integer>>();
    public static Stack<Integer> temperaturas = new Stack<>();
    public static ArrayList<ArrayList<Integer>> llenarLista(int tamaño){
        for (int i = 0; i <tamaño; i++) {
            ArrayList<Integer> lista = new ArrayList<>();
            lista.add((int)(Math.random()*12+1));
            lista.add((int)(Math.random()*4+1));
            lista.add((int)(Math.random()*7+1));
            lista.add((int)(Math.random()*30+0));
            listaDeDatos.add(lista);
        }
        return listaDeDatos;
    }
    public static Stack llenarPila(int mes, int indice) {
        if (indice < 0) {
            return temperaturas;
        } else {
            if (listaDeDatos.get(indice).get(0) == mes) {
                temperaturas.push(listaDeDatos.get(indice).get(3));
            }
            return llenarPila(mes, indice - 1);
        }
    }
    public static int promedio(int indice, int promedio, int contador) {
        if (indice < 0) {
            return promedio/contador;
        } else {
            promedio += temperaturas.pop();
            return promedio(indice-1, promedio, contador + 1);
        }
    }
}
