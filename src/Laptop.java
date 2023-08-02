public class Laptop {
    private Acumulator acumulator;

    public Laptop(int capacitateAcumulator) {
        this.acumulator = new Acumulator(capacitateAcumulator);
    }

    public void utilizeazaLaptop(int timpSimulare, int putereUtilizare) {
        int interval = 1000; // 1000 milisecunde = 1 secunda
        for (int t = 0; t < timpSimulare; t += interval) {
            acumulator.descarcaEnergie(putereUtilizare);
            System.out.println("Timp: " + t + " milisecunde. Nivel de energie: " + acumulator.getNivelEnergie());
            try {
                Thread.sleep(interval);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public int getNivelEnergieLaptop() {
        return acumulator.getNivelEnergie();
    }

    public boolean esteDescarcatLaptop() {
        return acumulator.esteDescarcat();
    }
}
