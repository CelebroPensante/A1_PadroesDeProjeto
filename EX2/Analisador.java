package EX2;

public class Analisador {
    private CalculoRisco estrategiaCalculo;
    
    // Define a estratégia dinamicamente
    public void setEstrategiaCalculo(CalculoRisco estrategia) {
        this.estrategiaCalculo = estrategia;
    }
    
    // Executa o cálculo usando a estratégia atual
    public void analisarCliente(String nomeCliente, double renda, double patrimonio, int idade, double tolerancia) {
        System.out.println("\n=== ANÁLISE DO CLIENTE: " + nomeCliente + " ===");

        double perfilRisco = estrategiaCalculo.calcularPerfilRisco(renda, patrimonio, idade, tolerancia);

        // Interpreta o resultado
        String classificacao;
        if (perfilRisco > 70) {
            classificacao = "ALTO RISCO";
        } else if (perfilRisco > 40) {
            classificacao = "RISCO MODERADO";
        } else {
            classificacao = "BAIXO RISCO";
        }
        
        System.out.println(" RESULTADO FINAL: " + classificacao + " (Pontuação: " + perfilRisco + ")");
    }
}