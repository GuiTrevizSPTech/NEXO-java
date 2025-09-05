package school.sptech;

public class Main {
    public static void main(String[] args) {
        AdministradorLog logGerenciador = new AdministradorLog();

        logGerenciador.adicionarLog(new Log("Totem0011A","2025-09-04 19:00", 82.5, 50.2, 70.1));
        logGerenciador.adicionarLog(new Log("Totem0011A","2025-09-04 19:10", 76.5, 54.2, 78.6));
        logGerenciador.adicionarLog(new Log("Totem0011A","2025-09-04 19:05", 80.1, 60.5, 54.2));
        logGerenciador.adicionarLog(new Log("Totem0011A","2025-09-04 19:20", 45.8, 30.0, 90.3));
        logGerenciador.adicionarLog(new Log("Totem0012A","2025-09-04 19:00", 80.1, 60.5, 75.2));
        logGerenciador.adicionarLog(new Log("Totem0012A","2025-09-04 19:10", 25.6, 60.5, 77.2));
        logGerenciador.adicionarLog(new Log("Totem0012A","2025-09-04 19:05", 32.1, 60.5, 59.2));
        logGerenciador.adicionarLog(new Log("Totem0012A","2025-09-04 19:00", 40.1, 60.5, 55.2));
        logGerenciador.adicionarLog(new Log("Totem0013A","2025-09-04 19:10", 45.8, 30.0, 90.9));
        logGerenciador.adicionarLog(new Log("Totem0013A","2025-09-04 19:05", 90.8, 30.0, 90.4));
        logGerenciador.adicionarLog(new Log("Totem0013A","2025-09-04 19:00", 94.8, 30.0, 90.6));
        logGerenciador.adicionarLog(new Log("Totem0013A","2025-09-04 19:20", 81.7, 30.0, 90.3));


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
