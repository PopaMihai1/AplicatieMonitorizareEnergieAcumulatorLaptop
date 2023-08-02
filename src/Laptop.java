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

    public static void main(String[] args) {
        int capacitateAcumulator = 10000; // Capacitatea acumulatorului în mAh (miliamperi-ora)
        Laptop laptop = new Laptop(capacitateAcumulator);

        int timpSimulare = 90000; // 90 de secunde (90000 milisecunde)
        int putereUtilizare = 100; // Cantitatea de energie consumată de laptop într-un interval (100 mAh)

        laptop.utilizeazaLaptop(timpSimulare, putereUtilizare);

        if (laptop.esteDescarcatLaptop()) {
            System.out.println("Laptopul s-a descărcat complet.");
        } else {
            System.out.println("Laptopul mai are 10% energie, trebuie conectat alimentatorul.");
        }
    }
}
