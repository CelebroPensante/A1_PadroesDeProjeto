package EX3;

import java.util.*;

public class Sensor {
    private List<Observador> observadores = new ArrayList<>();
    private String nome;
    
    public Sensor(String nome) {
        this.nome = nome;
    }
    
    public void adicionarObservador(Observador obs) {
        observadores.add(obs);
        System.out.println( obs.getClass().getSimpleName() + " agora observa " + nome);
    }
    
    public void setValor(double valor) {
        System.out.println("\n--- " + nome + " atualizou para: " + valor + " ---");
        for (Observador obs : observadores) {
            obs.atualizar(nome, valor);
        }
    }
}