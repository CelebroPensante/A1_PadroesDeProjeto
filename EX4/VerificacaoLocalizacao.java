package EX4;

public class VerificacaoLocalizacao extends Verificacao {
    public boolean verificar(Transacao transacao) {
        System.out.println("Verificando LOCALIZAÇÃO: " + transacao.localizacao);
        
        if (transacao.localizacao.equals("País Suspeito")) {
            System.out.println("LOCALIZAÇÃO SUSPEITA: Transação barrada!");
            return false;
        }
        
        System.out.println("Localização OK");
        return proxima == null ? true : proxima.verificar(transacao);
    }
}