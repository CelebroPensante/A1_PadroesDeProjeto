package EX5;

public class TesteSingleton {
    public static void main(String[] args) {
        System.out.println("=== TESTE DO SINGLETON ===\n");
        
        // Testando de diferentes módulos
        ModuloAutenticacao auth = new ModuloAutenticacao();
        ModuloFinanceiro financeiro = new ModuloFinanceiro();
        
        auth.autenticarUsuario("joao.silva");
        financeiro.processarTransacao(15000.0);
        
        // Verificando que é a mesma instância em todos os lugares
        Logger logger1 = Logger.getInstancia();
        Logger logger2 = Logger.getInstancia();
        
        System.out.println("\nCONFIRMAÇÃO SINGLETON:");
        System.out.println("Mesma instância? " + (logger1 == logger2));
        System.out.println("HashCode logger1: " + logger1.hashCode());
        System.out.println("HashCode logger2: " + logger2.hashCode());
    }
}