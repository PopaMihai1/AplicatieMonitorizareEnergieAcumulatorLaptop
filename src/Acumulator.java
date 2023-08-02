public class Acumulator {
    private int capacitateMaxima;
    private int nivelEnergie;

    public Acumulator(int capacitateMaxima) {
        this.capacitateMaxima = capacitateMaxima;
        this.nivelEnergie = capacitateMaxima;
    }

    public void descarcaEnergie(int cantitate) {
        nivelEnergie -= cantitate;
        if (nivelEnergie < 0) {
            nivelEnergie = 0;
        }
    }

    public int getNivelEnergie() {
        return nivelEnergie;
    }

    public int getCapacitateMaxima() {
        return capacitateMaxima;
    }

    public boolean esteDescarcat() {
        return nivelEnergie == 0;
    }
}
