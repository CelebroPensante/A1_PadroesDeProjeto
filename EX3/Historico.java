package EX3;

public class Historico implements Observador {
    public void atualizar(String sensor, double valor) {
        System.out.println("Histórico: Gravando " + sensor + " = " + valor);
    }
}