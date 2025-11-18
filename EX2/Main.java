package EX2;

// Cliente - Usa o padrão Strategy
public class Main {
    public static void main(String[] args) {
        Analisador analisador = new Analisador();
        
        System.out.println("== PLATAFORMA DE ANÁLISE DE INVESTIMENTOS ===\n");
        
        // Dados do cliente
        String nomeCliente = "João Silva";
        double renda = 10000;
        double patrimonio = 50000;
        int idade = 35;
        double tolerancia = 60;
        
        System.out.println("ANÁLISE 1: Modelo Agressivo");
        analisador.setEstrategiaCalculo(new ModeloAgressivo());
        analisador.analisarCliente(nomeCliente, renda, patrimonio, idade, tolerancia);
        
        System.out.println("\nANÁLISE 2: Modelo Moderado");
        analisador.setEstrategiaCalculo(new ModeloModerado());
        analisador.analisarCliente(nomeCliente, renda, patrimonio, idade, tolerancia);
        
        System.out.println("\nANÁLISE 3: Modelo Conservador");
        analisador.setEstrategiaCalculo(new ModeloConservador());
        analisador.analisarCliente(nomeCliente, renda, patrimonio, idade, tolerancia);
        
    }}