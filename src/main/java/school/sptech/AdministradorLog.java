package school.sptech;

import java.util.ArrayList;

public class AdministradorLog {

    private ArrayList<Log> logs;

    public AdministradorLog() {
        logs = new ArrayList<>();
    }

    // Adicionar log
    public void adicionarLog(Log log) {
        logs.add(log);
    }

    // Mostrar todos os logs
    public void mostrarTodosLogs() {
        if (logs.isEmpty()) {
            System.out.println("Nenhum log registrado.");
        } else {
            for (Log log : logs) {
                System.out.println(log);
            }
        }
    }

    // Selection sort para ordenar por data (mais antigo primeiro)
    public void ordenarPorData() {
        for (int i = 0; i < logs.size() - 1; i++) {
            int indiceMenor = i;
            for (int j = i + 1; j < logs.size(); j++) {
                if (logs.get(j).getDataHora().compareTo(logs.get(indiceMenor).getDataHora()) < 0) {
                    indiceMenor = j;
                }
            }
            Log temp = logs.get(i);
            logs.set(i, logs.get(indiceMenor));
            logs.set(indiceMenor, temp);
        }
    }

    // Selection sort para ordenar por uso de CPU
    public void ordenarPorCPU() {
        selectionSort(logs, "getUsoCPU");
//        for (int i = 0; i < logs.size() - 1; i++) {
//            int indiceMenor = i;
//            for (int j = i + 1; j < logs.size(); j++) {
//                if (logs.get(j).getUsoCPU() < logs.get(indiceMenor).getUsoCPU()) {
//                    indiceMenor = j;
//                }
//            }
//            Log temp = logs.get(i);
//            logs.set(i, logs.get(indiceMenor));
//            logs.set(indiceMenor, temp);
//        }
    }

    public void selectionSort(ArrayList<Log> logs, String componente) {
        for (int i = 0; i < logs.size() - 1; i++) {
            int indiceMenor = i;
            for (int j = i + 1; j < logs.size(); j++) {
                System.out.println(componente+logs.get(i).executar(componente));
                if (logs.get(i).executar(componente) < logs.get(indiceMenor).executar(componente)) {
                    indiceMenor = j;
                }
            }
            Log temp = logs.get(i);
            logs.set(i, logs.get(indiceMenor));
            logs.set(indiceMenor, temp);
        }

    }

    // Selection sort para ordenar por uso de RAM
    public void ordenarPorRAM() {

        selectionSort(logs, "getUsoRAM");
//        for (int i = 0; i < logs.size() - 1; i++) {
//            int indiceMenor = i;
//            for (int j = i + 1; j < logs.size(); j++) {
//                if (logs.get(j).getUsoRAM() < logs.get(indiceMenor).getUsoRAM()) {
//                    indiceMenor = j;
//                }
//            }
//            Log temp = logs.get(i);
//            logs.set(i, logs.get(indiceMenor));
//            logs.set(indiceMenor, temp);
//        }
    }

    // Selection sort para ordenar por uso de Disco
    public void ordenarPorDisco() {
        selectionSort(logs, "getUsoDisco");
//        for (int i = 0; i < logs.size() - 1; i++) {
//            int indiceMenor = i;
//            for (int j = i + 1; j < logs.size(); j++) {
//                if (logs.get(j).getUsoDisco() < logs.get(indiceMenor).getUsoDisco()) {
//                    indiceMenor = j;
//                }
//            }
//            Log temp = logs.get(i);
//            logs.set(i, logs.get(indiceMenor));
//            logs.set(indiceMenor, temp);
//        }
    }

    // Mostrar somente data e CPU
    public void mostrarDataECpu() {
        for (Log log : logs) {
            System.out.println("ID: "+ log.getIdentificadorTotem() + " | Data: " + log.getDataHora() + " | CPU: " + log.getUsoCPU() + "%");
        }
    }

    // Mostrar logs com CPU acima de um limite
    public void mostrarLogsCpuAcimaDe(double limite) {
        boolean encontrou = false;
        for (Log log : logs) {
            if (log.getUsoCPU() > limite) {
                System.out.println(log);
                encontrou = true;
            }
        }
        if (!encontrou) {
            System.out.println("Nenhum log com CPU acima de " + limite + "%.");
        }
    }

    // Mostrar logs com RAM acima de um limite
    public void mostrarLogsRamAcimaDe(double limite) {
        boolean encontrou = false;
        for (Log log : logs) {
            if (log.getUsoRAM() > limite) {
                System.out.println(log);
                encontrou = true;
            }
        }
        if (!encontrou) {
            System.out.println("Nenhum log com RAM acima de " + limite + "%.");
        }
    }

    // Mostrar logs com Disco acima de um limite
    public void mostrarLogsDiscoAcimaDe(double limite) {
        boolean encontrou = false;
        for (Log log : logs) {
            if (log.getUsoDisco() > limite) {
                System.out.println(log);
                encontrou = true;
            }
        }
        if (!encontrou) {
            System.out.println("Nenhum log com Disco acima de " + limite + "%.");
        }
    }
}
