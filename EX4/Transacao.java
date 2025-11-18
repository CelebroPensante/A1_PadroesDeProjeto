package EX4;

public class Transacao {
    public double valor;
    public String localizacao;
    public int historicoScore;
    public String dispositivo;
    
    public Transacao(double valor, String localizacao, int historicoScore, String dispositivo) {
        this.valor = valor;
        this.localizacao = localizacao;
        this.historicoScore = historicoScore;
        this.dispositivo = dispositivo;
    }
}