package collections.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class ExemploLinkediHashSet {
    public static void main(String[] args){
        Set<Integer> valores = new LinkedHashSet<>();
        valores.add(1);
        valores.add(2);
        valores.add(3);
        valores.add(4);
        valores.add(5);
        valores.add(6);

        Iterator<Integer> iterator = valores.iterator();

        while(iterator.hasNext()){
            System.out.println("Utilizando o while" + iterator.next());
        }
        for(Integer nota: valores){
            System.out.println(nota);
        }
    }
}
