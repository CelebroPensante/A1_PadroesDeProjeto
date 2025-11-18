package EX2;

//Modelo Conservador
public class ModeloConservador implements CalculoRisco {
    public double calcularPerfilRisco(double renda, double patrimonio, int idade, double tolerancia) {
        System.out.println(" Calculando perfil CONSERVADOR:");
        
        //formula inventada pro exercício
        double risco = (renda * 0.1) + (patrimonio * 0.2) + (idade * 0.5) + (tolerancia * 0.2);

        System.out.println("   - Renda: R$" + renda);
        System.out.println("   - Patrimônio: R$" + patrimonio);
        System.out.println("   - Idade: " + idade + " anos");
        System.out.println("   - Tolerância: " + tolerancia);
        System.out.println("   - Pontuação de risco: " + risco);
        
        return risco;
    }
}