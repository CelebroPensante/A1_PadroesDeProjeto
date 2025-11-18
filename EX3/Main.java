package EX3;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE MONITORAMENTO ===\n");
        
        // Criando sensores
        Sensor temp = new Sensor("Temperatura");
        Sensor umid = new Sensor("Umidade");
        
        // Criando módulos
        PainelDeControle painel = new PainelDeControle();
        ModuloAlertas alertas = new ModuloAlertas();
        Historico historico = new Historico();
        
        // Conectando módulos aos sensores
        temp.adicionarObservador(painel);
        temp.adicionarObservador(alertas);
        temp.adicionarObservador(historico);
        
        umid.adicionarObservador(painel);
        umid.adicionarObservador(historico);
        
        // Simulando atualizações
        System.out.println("\n📡 ATUALIZAÇÕES DOS SENSORES:");
        temp.setValor(25.5);
        umid.setValor(60.0);
        temp.setValor(35.0);  // Vai gerar alerta
        
        };
        
}