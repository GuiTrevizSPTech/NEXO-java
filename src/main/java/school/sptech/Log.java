package school.sptech;

import java.lang.reflect.Method;

public class Log {
    private String identificadorTotem;
    private String dataHora;
    private double usoCPU;
    private double usoRAM;
    private double usoDisco;

    public Log(String identificadorTotem, String dataHora, double usoCPU, double usoRAM, double usoDisco) {
        this.identificadorTotem = identificadorTotem;
        this.dataHora = dataHora;
        this.usoCPU = usoCPU;
        this.usoRAM = usoRAM;
        this.usoDisco = usoDisco;
    }

    public String getIdentificadorTotem() { return identificadorTotem; }

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
        return "ID: " + identificadorTotem +
                " | Data: " + dataHora +
                " | CPU: " + usoCPU + "%" +
                " | RAM: " + usoRAM + "%" +
                " | Disco: " + usoDisco + "%";
    }

    public Double executar(String comando){
        try{
            Method metodo = this.getClass().getMethod(comando);
            return (Double) metodo.invoke(this);

        }catch (Exception e){
            return  0.0;
        }
    }
}
