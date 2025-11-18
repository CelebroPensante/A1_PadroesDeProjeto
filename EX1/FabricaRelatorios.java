package EX1;

// Fábrica responsável por criar os relatórios
public class FabricaRelatorios {
    public Relatorio criarRelatorio(String tipo) {
        switch(tipo.toLowerCase()) {
            case "diario":
                return new RelatorioDiario();
            case "semanal":
                return new RelatorioSemanal();
            default:
                throw new IllegalArgumentException("Tipo de relatório não suportado: " + tipo);
        }
    }
}