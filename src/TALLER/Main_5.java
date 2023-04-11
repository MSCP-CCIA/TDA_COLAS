package TALLER;
import java.util.*;
import java.util.function.Supplier;
public class Main_5 {
    public static PriorityQueue<String> colaLetras = new PriorityQueue<>(Comparator.reverseOrder());
    public static Queue<String> colaTerminada = new LinkedList<>();
    public static ArrayList<String> listaLetras = new ArrayList<>();
    public static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static String generateRandomString(int length) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        llenarCola();
        ordenarCola(colaLetras.size() - 1);
        System.out.println(listaLetras);
        eliminarRepetidos(listaLetras.size() - 1);
        System.out.println(colaTerminada);
    }
    public static void llenarCola() {
        for (int i = 0; i < 30; i++) {
            colaLetras.add(generateRandomString(1));
        }
        System.out.println(colaLetras);
    }
    public static ArrayList ordenarCola(int indice) {
        if (indice < 0) {
            return listaLetras;
        } else {
            listaLetras.add(colaLetras.poll());
            return ordenarCola(indice - 1);
        }
    }
    public static Queue eliminarRepetidos(int indice) {
        if (indice < 1) {
            colaTerminada.add(listaLetras.get(0));
            return colaTerminada;
        } else {
            if (!(listaLetras.get(indice).equals(listaLetras.get(indice-1)))) {
                colaTerminada.add(listaLetras.get(indice));
            }
            return eliminarRepetidos(indice - 1);
        }
    }
}

