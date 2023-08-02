public class Main {
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
