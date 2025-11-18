package EX5;

public class ModuloAutenticacao {
    public void autenticarUsuario(String usuario) {
        Logger logger = Logger.getInstancia();
        logger.logInfo("Autenticando usuário: " + usuario);
        logger.logAuditoria("Tentativa de login - " + usuario);
    }
}