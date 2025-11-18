package EX1;

// Sistema principal que usa a fábrica
public class Main {
    public static void main(String[] args) {
        FabricaRelatorios fabrica = new FabricaRelatorios();
        
        System.out.println("=== SISTEMA DE RELATÓRIOS ===\n");

        Relatorio diario = fabrica.criarRelatorio("diario");
        diario.gerar();
        
        Relatorio semanal = fabrica.criarRelatorio("semanal");
        semanal.gerar();

        
    }
}