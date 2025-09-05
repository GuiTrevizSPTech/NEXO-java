package school.sptech;

public class Main {
    public static void main(String[] args) {
        AdministradorLog logGerenciador = new AdministradorLog();

        logGerenciador.adicionarLog(new Log("2025-09-04 19:00", 30.5, 50.2, 70.1));
        logGerenciador.adicionarLog(new Log("2025-09-04 19:10", 80.1, 60.5, 55.2));
        logGerenciador.adicionarLog(new Log("2025-09-04 19:05", 45.8, 30.0, 90.3));

        System.out.println("=== Todos os Logs ===");
        logGerenciador.mostrarTodosLogs();

        System.out.println("\n=== Ordenando por CPU ===");
        logGerenciador.ordenarPorCPU();
        logGerenciador.mostrarTodosLogs();

        System.out.println("\n=== Logs com CPU > 50% ===");
        logGerenciador.mostrarLogsCpuAcimaDe(50);

        System.out.println("\n=== Mostrar somente Data e CPU ===");
        logGerenciador.mostrarDataECpu();
    }

}
