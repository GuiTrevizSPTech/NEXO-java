package school.sptech;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scannerLine = new Scanner(System.in);
        AdministradorLog logGerenciador = new AdministradorLog();

        String continuar;

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

        do {
            Integer escolha;

            System.out.println("Escolha uma das opções abaixo:");
            System.out.println("1 - Ordenados por Data/Hora");
            System.out.println("2 - Ordenados por porcentagem de CPU");
            System.out.println("3 - Ordenados por porcentagem de RAM");
            System.out.println("4 - Ordenados por porcentagem de Disco");
            System.out.println("5 - todos os dados");
            escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("=== Capturas ordenadas por Data/Hora ===");
                    logGerenciador.ordenarPorData();
                    break;
                case 2:
                    System.out.println("=== Capturas ordenadas por porcentagem de CPU ===");
                    logGerenciador.ordenarPorCPU();
                    break;
                case 3:
                    System.out.println("=== Capturas ordenadas por porcentagem de RAM ===");
                    logGerenciador.ordenarPorRAM();
                    break;
                case 4:
                    System.out.println("=== Capturas ordenadas por Porcentagem de Disco ===");
                    logGerenciador.ordenarPorDisco();
                    break;
                case 5:
                    System.out.println("=== Captura de todos os dados ===");
                    logGerenciador.mostrarTodosLogs();
                    break;
                default:
                    break;
            }

            System.out.println("\nVocê deseja ver outras informações de forma diferente que podemos te mostrar?\n");
            continuar = scannerLine.nextLine();

        } while(continuar.equalsIgnoreCase("sim"));
    }

}
