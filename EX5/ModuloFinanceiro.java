package EX5;

public class ModuloFinanceiro {
    public void processarTransacao(double valor) {
        Logger logger = Logger.getInstancia();
        logger.logInfo("Processando transação: R$ " + valor);
        logger.enviarParaServidor("Transação financeira: R$ " + valor);
        
        if (valor > 10000) {
            logger.logAuditoria("Transação de alto valor: R$ " + valor);
        }
    }
}