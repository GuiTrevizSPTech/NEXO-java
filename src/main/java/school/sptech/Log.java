package school.sptech;

public class Log {
    private String dataHora;
    private double usoCPU;
    private double usoRAM;
    private double usoDisco;

    public Log(String dataHora, double usoCPU, double usoRAM, double usoDisco) {
        this.dataHora = dataHora;
        this.usoCPU = usoCPU;
        this.usoRAM = usoRAM;
        this.usoDisco = usoDisco;
    }

    public String getDataHora() {
        return dataHora;
    }

    public double getUsoCPU() {
        return usoCPU;
    }

    public double getUsoRAM() {
        return usoRAM;
    }

    public double getUsoDisco() {
        return usoDisco;
    }

    public String toString() {
        return "Data: " + dataHora +
                " | CPU: " + usoCPU + "%" +
                " | RAM: " + usoRAM + "%" +
                " | Disco: " + usoDisco + "%";
    }
}
