package collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploHashSet {
    public static void main(String[] args) {

        /*Utilizando o Set para acrescentar valores a uma lista*/
        Set<Double> notasAlunos = new HashSet<>();

        /*Acrescentando*/
        notasAlunos.add(2.3);
        notasAlunos.add(3.3);
        notasAlunos.add(4.3);

        notasAlunos.add(5.3);
        notasAlunos.add(6.3);
        notasAlunos.add(7.3);
        /*Utilizando o iterator para navegar por resta lista*/
        Iterator<Double> notasSeparadas = notasAlunos.iterator();
        while (notasSeparadas.hasNext()) {
            System.out.println(notasSeparadas.next());
        }
        for (Double nota : notasAlunos) {
            System.out.println(nota);
        }
    }
}
