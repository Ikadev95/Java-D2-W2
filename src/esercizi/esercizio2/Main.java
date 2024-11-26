package esercizi.esercizio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static List<Integer> listaOrdinata (int n){

        List<Integer> result = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            int num = (int) (Math.random() * 100) +1;
            result.add(num);
        }

        Collections.sort(result);
        return result;
    }
    public static List<Integer> duplicaEInverti(List<Integer> lista) {
        List<Integer> result = new ArrayList<Integer>();
        List<Integer> listaInvertita = new ArrayList<>(lista);
        Collections.reverse(listaInvertita);
        result.addAll(lista);
        result.addAll(listaInvertita);
        return result;
    }
    public static void stampaPariDispari(boolean bol, List<Integer> lista){
        if(bol){
            System.out.println("Stampa posizioni pari: ");
            for (int i = 0; i < lista.size(); i++) {
                if(i % 2 == 0){
                    System.out.print(lista.get(i) + " ");
                }
            }
            System.out.println();
        }
        else {
            System.out.println("stampa posizioni dispari: ");
            for (int i = 0; i < lista.size(); i++) {
                if(!(i% 2 == 0)){
                    System.out.print(lista.get(i) + " ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int n = 10;
        List<Integer> listaCasuale = listaOrdinata(n);
        System.out.println("Lista casuale ordinata: " + listaCasuale);

        List<Integer> listaDuplicataEInvertita = duplicaEInverti(listaCasuale);
        System.out.println("Lista duplicata e invertita: " + listaDuplicataEInvertita);

        stampaPariDispari(true,listaDuplicataEInvertita);
        stampaPariDispari(false, listaDuplicataEInvertita);
    }
}
