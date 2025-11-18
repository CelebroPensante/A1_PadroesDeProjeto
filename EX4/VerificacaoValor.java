package EX4;

public class VerificacaoValor extends Verificacao {
    public boolean verificar(Transacao transacao) {
        System.out.println("Verificando VALOR: R$" + transacao.valor);
        
        if (transacao.valor > 5000) {
            System.out.println("VALOR SUSPEITO: Transação barrada!");
            return false;
        }
        
        System.out.println("Valor OK");
        return proxima == null ? true : proxima.verificar(transacao);
    }
}
