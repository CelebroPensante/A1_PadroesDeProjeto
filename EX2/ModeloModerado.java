package EX2;

//Modelo Moderado
public class ModeloModerado implements CalculoRisco {
    public double calcularPerfilRisco(double renda, double patrimonio, int idade, double tolerancia) {
        System.out.println("Calculando perfil MODERADO:");
        
        //formula inventada
        double risco = (renda * 0.2) + (patrimonio * 0.3) + (idade * 0.3) + (tolerancia * 0.2);

        System.out.println("   - Renda: R$" + renda);
        System.out.println("   - Patrimônio: R$" + patrimonio);
        System.out.println("   - Idade: " + idade + " anos");
        System.out.println("   - Tolerância: " + tolerancia);
        System.out.println("   - Pontuação de risco: " + risco);
        
        return risco;
    }
}