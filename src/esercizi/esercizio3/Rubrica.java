package esercizi.esercizio3;

import java.util.HashMap;
import java.util.Map;

public class Rubrica {
    private Map<String, String> contatti;

    public Rubrica() {
        this.contatti = new HashMap<>();
    }

    public void aggiungiContatto(String nome, String telefono) {
        contatti.put(nome, telefono);
        System.out.println("Contatto aggiunto: " + nome + " -> " + telefono);
    }

    public void cancellaContatto(String nome){
        contatti.remove(nome);
        System.out.println("Contatto rimosso: " + nome);
    }

    public void ricercaDaNumero(String telefono) {
        for (String nome : contatti.keySet()) {
            if (contatti.get(nome).equals(telefono)) {
                System.out.println( "La persona associata al numero " + telefono + " è: " + nome);
            }
        }
    }

    public void cercaNumeroPerNome(String nome) {
        if (contatti.containsKey(nome)) {
            System.out.println("Il numero di " + nome + " è: " + contatti.get(nome));
        }
    }

    public void stampaContatti() {
        if (contatti.isEmpty()) {
            System.out.println("La rubrica è vuota");
        } else {
            System.out.println("Elenco contatti:");
            for (Map.Entry<String, String> entry : contatti.entrySet()) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        Rubrica rubrica = new Rubrica();

        rubrica.aggiungiContatto("Mario Rossi", "1234567890");
        rubrica.aggiungiContatto("Luigi Verdi", "9876543210");
        rubrica.aggiungiContatto("Anna Bianchi", "4561237890");

        rubrica.stampaContatti();

        rubrica.cercaNumeroPerNome("Luigi Verdi");

        rubrica.ricercaDaNumero("4561237890");

        rubrica.cancellaContatto("Mario Rossi");

        rubrica.stampaContatti();
    }
}
