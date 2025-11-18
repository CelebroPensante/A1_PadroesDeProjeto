package EX4;

public abstract class Verificacao {
    protected Verificacao proxima;
    
    public Verificacao setProxima(Verificacao proxima) {
        this.proxima = proxima;
        return this;
    }
    
    public abstract boolean verificar(Transacao transacao);
}