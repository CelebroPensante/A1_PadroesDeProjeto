package EX4;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA ANTIFRAUDE ===\n");
        
        // Criando a cadeia de verificações
        Verificacao cadeia = new VerificacaoValor()
            .setProxima(new VerificacaoLocalizacao());
            

        // Testando transações
        System.out.println("TESTANDO TRANSAÇÃO 1 (NORMAL):");
        Transacao t1 = new Transacao(100.0, "Brasil", 80, "Celular Conhecido");
        boolean aprovada1 = cadeia.verificar(t1);
        System.out.println("Resultado: " + (aprovada1 ? "APROVADA" : "BARRADA"));
        
        System.out.println("\nTESTANDO TRANSAÇÃO 2 (VALOR SUSPEITO):");
        Transacao t2 = new Transacao(10000.0, "Brasil", 80, "Celular Conhecido");
        boolean aprovada2 = cadeia.verificar(t2);
        System.out.println("Resultado: " + (aprovada2 ? "APROVADA" : "BARRADA"));
        
        System.out.println("\nESTANDO TRANSAÇÃO 3 (LOCALIZAÇÃO SUSPEITA):");
        Transacao t3 = new Transacao(100.0, "País Suspeito", 80, "Celular Conhecido");
        boolean aprovada3 = cadeia.verificar(t3);
        System.out.println("Resultado: " + (aprovada3 ? "APROVADA" : "BARRADA"));
        
    }
}
