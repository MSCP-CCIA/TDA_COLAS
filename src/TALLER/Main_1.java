package TALLER;

import TDA_LISTA.TDA_COLA_LISTA;

import java.util.*;
import java.util.function.Supplier;

public class Main_1 {
    public static ArrayList<String> listaEstudiantes = new ArrayList<>();
    public static Queue<String> colaEstudiantes = new LinkedList<>();
    public static Queue<String> colaColados = new LinkedList<>();
    public static Queue<String> colaNoColados = new LinkedList<>();
    public static void main(String[] args) {
        Supplier<Boolean> randomBooleanSupplier = () -> new Random().nextBoolean();
        for (int i = 1; i < 31; i++) {
            listaEstudiantes.add(String.valueOf(randomBooleanSupplier.get()));
            listaEstudiantes.add(String.valueOf(i));
        }
        addTicket();
        removeStrained();
        remove();
    }
    public static void addTicket(){
        for (String estudiante: listaEstudiantes) {
            colaEstudiantes.offer(estudiante);
        }
        System.out.println(colaEstudiantes);
    }
    public static void removeStrained(){
        while (!colaEstudiantes.isEmpty()){
            if (colaEstudiantes.element()=="false"){
                colaColados.offer(colaEstudiantes.poll());
                colaColados.offer(colaEstudiantes.poll());
            }
            else {
                colaNoColados.offer(colaEstudiantes.poll());
                colaNoColados.offer(colaEstudiantes.poll());
            }
        }
        System.out.println(colaColados);
    }
    public static void remove(){
        while (!colaNoColados.isEmpty()){
            System.out.println(colaNoColados.poll());
        }
        System.out.println(colaNoColados);
    }



}
