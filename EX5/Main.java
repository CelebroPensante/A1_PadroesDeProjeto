package EX5;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA CORPORATIVO ===\n");
        
        // Obtendo a instância única do Logger
        Logger logger1 = Logger.getInstancia();
        Logger logger2 = Logger.getInstancia();
        Logger logger3 = Logger.getInstancia();
        
        // Verificando que é a mesma instância
        System.out.println("Verificando instâncias:");
        System.out.println("logger1 == logger2: " + (logger1 == logger2));
        System.out.println("logger2 == logger3: " + (logger2 == logger3));
        System.out.println("Todas as referências apontam para a MESMA instância\n");
        
        // Usando o logger de diferentes partes do sistema
        System.out.println("SIMULAÇÃO DE USO DO LOGGER:");
        
        // Módulo de Autenticação
        logger1.logInfo("Usuário admin fez login");
        logger1.logAuditoria("Acesso ao módulo financeiro");
        
        // Módulo Financeiro
        logger2.logInfo("Transação de R$ 1.000,00 processada");
        logger2.enviarParaServidor("Transação financeira concluída");
        
        // Módulo de Relatórios
        logger3.logErro("Falha ao gerar relatório mensal");
        logger3.logAuditoria("Relatório de auditoria gerado");
        
        // Teste com threads (ambiente multi-thread)
        System.out.println("\nTESTANDO COM MÚLTIPLAS THREADS:");
        
        Thread thread1 = new Thread(() -> {
            Logger loggerThread1 = Logger.getInstancia();
            loggerThread1.logInfo("Thread 1 - Processamento iniciado");
        });
        
        Thread thread2 = new Thread(() -> {
            Logger loggerThread2 = Logger.getInstancia();
            loggerThread2.logInfo("Thread 2 - Processamento iniciado");
        });
        
        Thread thread3 = new Thread(() -> {
            Logger loggerThread3 = Logger.getInstancia();
            loggerThread3.logInfo("Thread 3 - Processamento iniciado");
        });
        
        thread1.start();
        thread2.start();
        thread3.start();
        
        // Aguardar threads terminarem
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }
}