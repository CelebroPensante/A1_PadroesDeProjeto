package EX2;

// Modelo Agressivo
public class ModeloAgressivo implements CalculoRisco {
    public double calcularPerfilRisco(double renda, double patrimonio, int idade, double tolerancia) {
        System.out.println(" Calculando perfil AGRESSIVO:");

        //criei essa formula apenas para demonstração do exercício
        double risco = (renda * 0.3) + (patrimonio * 0.5) + (idade * 0.1) + (tolerancia * 0.1);

        System.out.println("   - Renda: R$" + renda);
        System.out.println("   - Patrimônio: R$" + patrimonio);
        System.out.println("   - Idade: " + idade + " anos");
        System.out.println("   - Tolerância: " + tolerancia);
        System.out.println("   - Pontuação de risco: " + risco);
        
        return risco;
    }
}