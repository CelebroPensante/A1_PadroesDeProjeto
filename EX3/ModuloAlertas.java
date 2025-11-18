package EX3;

public class ModuloAlertas implements Observador {
    public void atualizar(String sensor, double valor) {
        System.out.println("Alertas: Monitorando " + sensor + " = " + valor);
        if (valor > 30) {
            System.out.println("ALERTA: Valor alto!");
        }
    }
}