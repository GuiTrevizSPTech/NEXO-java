package school.sptech;

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
            Double porcentagem;

            System.out.println("Escolha uma das opções abaixo:");
            System.out.println("1 - Ordenados por Data/Hora");
            System.out.println("2 - Ordenados por porcentagem de CPU");
            System.out.println("3 - Ordenados por porcentagem de RAM");
            System.out.println("4 - Ordenados por porcentagem de Disco");
            System.out.println("5 - ID Totem, data/hora e CPU");
            System.out.println("6 - ID Totem, data/hora e RAM");
            System.out.println("7 - ID Totem, data/hora e Disco");
            System.out.println("8 - CPU acima de ...%");
            System.out.println("9 - RAM acima de ...%");
            System.out.println("10 - Disco acima de ...%");
            System.out.println("11 - todos os dados");
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
                    System.out.println("=== ID Totem, data/hora e CPU ===");
                    logGerenciador.mostrarDataECpu();
                    break;
                case 6:
                    System.out.println("=== ID Totem, data/hora e RAM ===");
                    logGerenciador.mostrarDataERam();
                    break;
                case 7:
                    System.out.println("=== ID Totem, data/hora e Disco ===");
                    logGerenciador.mostrarDataEDisco();
                    break;
                case 8:
                    System.out.println("=== CPU acima de ...% ===");
                    System.out.println("Digite a porcentagem para verificar capturas elevadas:");
                    porcentagem = sc.nextDouble();

                    logGerenciador.mostrarLogsCpuAcimaDe(porcentagem);
                    break;
                case 9:
                    System.out.println("=== RAM acima de ...% ===");
                    System.out.println("Digite a porcentagem para verificar capturas elevadas:");
                    porcentagem = sc.nextDouble();

                    logGerenciador.mostrarLogsRamAcimaDe(porcentagem);
                    break;
                case 10:
                    System.out.println("=== Disco acima de ...% ===");
                    System.out.println("Digite a porcentagem para verificar capturas elevadas:");
                    porcentagem = sc.nextDouble();

                    logGerenciador.mostrarLogsDiscoAcimaDe(porcentagem);
                    break;
                case 11:
                    System.out.println("=== Captura de todos os dados ===");
                    logGerenciador.mostrarTodosLogs();
                    break;
                default:
                    System.out.println("# Por favor, Digite um número compatível com as escolhas feitas acima");
                    break;
            }

            System.out.println("\nVocê deseja ver outras informações de forma diferente que podemos te mostrar? [sim / nao]\n");
            continuar = scannerLine.nextLine();

        } while(continuar.equalsIgnoreCase("sim"));
    }

}
