package EX3;

public class PainelDeControle implements Observador {
    public void atualizar(String sensor, double valor) {
        System.out.println("Painel: " + sensor + " = " + valor);
    }
}