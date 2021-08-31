package collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploList {
    public static void  main(String[] args){
        List<String> nomes = new ArrayList<>();

        nomes.add("Carlão");
        nomes.add("Pedro");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("Juliana");
        System.out.println(nomes);
        Collections.sort(nomes);
        System.out.println(nomes);
        nomes.set(4,"Antonia");
        System.out.println(nomes);
        nomes.remove(3);
    }
}
