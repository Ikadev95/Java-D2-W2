package esercizi.esercizio1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("indica il numero di parole che vuoi inserire: ");
        int numeroDiParole = scanner.nextInt();
        scanner.nextLine();

        System.out.println("inserisci le parole:");

        Set<String> paroleDistinte = new HashSet<>();
        Set<String> paroleDuplicate = new HashSet<>();

        for (int i = 0; i < numeroDiParole; i++) {
            String s = scanner.nextLine();
            if(!paroleDistinte.add(s)){
                paroleDuplicate.add(s);
            }
        }

        System.out.println("Parole duplicate: " + paroleDuplicate);

        System.out.println("Numero di parole distinte: " + paroleDistinte.size());

        System.out.println("Elenco delle parole distinte: " + paroleDistinte);

        scanner.close();
    }
}
