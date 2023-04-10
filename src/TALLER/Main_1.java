package TALLER;
import TDA_RING_COLA.TDA_RING_COLA;
import java.util.*;
import java.util.function.Supplier;
public class Main_1 {
    public static ArrayList<String> listaEstudiantes = new ArrayList<>();
    public static TDA_RING_COLA colaEstudiantes = new TDA_RING_COLA();
    public static Queue<String> colaColados = new LinkedList<>();
    public static void main(String[] args) {
        Supplier<Boolean> randomBooleanSupplier = () -> new Random().nextBoolean();
        for (int i = 1; i < 21; i++) {
            listaEstudiantes.add(String.valueOf(randomBooleanSupplier.get()));
            listaEstudiantes.add(String.valueOf(i));
        }
        addTicket();
        removeStrained();
        System.out.println(colaEstudiantes);
    }
    public static void addTicket(){
        for (String estudiante: listaEstudiantes) {
            colaEstudiantes.enqueue(estudiante);

        }
        System.out.println(colaEstudiantes);
    }
    public static void removeStrained(){
        while ((colaEstudiantes.getInicio()!=colaEstudiantes.getQueue().length-2)){
            if (colaEstudiantes.peek()=="false"){
                colaColados.offer(String.valueOf(colaEstudiantes.dequeue()));
                colaColados.offer(String.valueOf(colaEstudiantes.dequeue()));
            }
            else {
                colaEstudiantes.enqueue(colaEstudiantes.dequeue());
                colaEstudiantes.enqueue(colaEstudiantes.dequeue());
            }
        }
        System.out.println(colaColados);
    }
}
