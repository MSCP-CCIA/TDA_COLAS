package TDA_LISTA;

import java.util.LinkedList;

public class TDA_BICOLA_LISTA {
    LinkedList<Object> bicola = new LinkedList<>();
    public boolean estavacia(){
        return bicola.isEmpty();
    }
    public void encolarInicio(Object dato){
        bicola.add(0,dato);
    }
    public void encolarFinal(Object dato){
        bicola.add(dato);
    }
    public Object decolarInicio(){
        if(estavacia()){
            System.out.println("La cola està vacìa chatgptero");
            return null;
        }else{
            return bicola.remove(0);
        }

    }
    public Object decolarFinal(){
        if(estavacia()){
            System.out.println("La cola està vacìa");
            return null;
        }else{
            return bicola.remove(bicola.size()-1);
        }

    }
    public Object Peek(){
        return bicola.peek();
    }
    public Object PeekLast() {
        return bicola.peekLast();
    }
}
