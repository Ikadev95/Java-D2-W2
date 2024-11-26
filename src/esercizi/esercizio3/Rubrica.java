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
}
