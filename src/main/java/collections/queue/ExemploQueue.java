package collections.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploQueue {
    public static void main(String[] args){
        Queue<String> nomes = new LinkedList<>();
        nomes.add("Paulo");
        nomes.add("Paulao");
        nomes.add("Paulinho");
        System.out.println(nomes);
        /*Esse metodo poll, remove o primeiro elemento da lista e o retorna*/
        String clienteASerAtendido = nomes.poll();

        System.out.println(clienteASerAtendido);
        /*Esse metodo peak, não remove o primeiro elemento da lista e o retorna*/
        String clienteQueEstaEmprimeiroSemRemover = nomes.peek();
        System.out.println(clienteASerAtendido);
        System.out.println(nomes);
        /*Navegando pelos clientes para saber qual esta em qual*/
        for(String client: nomes){
            System.out.println(">>>>>>> " + client);
        }
        Iterator<String> iterable = nomes.iterator();
        while(iterable.hasNext()){
            System.out.println(iterable.next());
        }
    }
}
