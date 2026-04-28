import java.util.ArrayDeque;
import java.util.Stack;

public class Navegacion {
private ArrayDeque<String> historial;
public Navegacion (){
    historial=new ArrayDeque<>();
}

public void push(String pagina){
    historial.push(pagina);
}


public void pop (){
    if(historial.isEmpty()){
        System.out.println("no hay paginas ingrsadas");
    }else{
        historial.pop();
    }

}


public void peek(){
    if(historial.isEmpty()){
        System.out.println("no hay paginas actuales");
    }else{
        System.out.println("su pagina actual es "+ historial.peek());
    }
}




}
