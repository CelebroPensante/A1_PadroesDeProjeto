package EX5;

public class Logger {
    // Única instância da classe
    private static Logger instancia;
    
    private Logger() {
        System.out.println("Logger criado - única instância no sistema");
    }
    
    // Método público para acessar a instância (thread-safe)
    public static synchronized Logger getInstancia() {
        if (instancia == null) {
            instancia = new Logger();
        }
        return instancia;
    }
    
    // Métodos de logging
    public void logInfo(String mensagem) {
        System.out.println("[INFO] " + mensagem);
    }
    
    public void logErro(String mensagem) {
        System.out.println("[ERRO] " + mensagem);
    }
    
    public void logAuditoria(String mensagem) {
        System.out.println("[AUDITORIA] " + mensagem);
    }
    
    public void enviarParaServidor(String mensagem) {
        System.out.println("[SERVIDOR] Enviando: " + mensagem);
    }
}