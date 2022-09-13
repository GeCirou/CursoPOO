package Java;

class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        UberX uberx = new UberX("AMQ123", new Account("Andres Herrera", "AND123"), "Chevrolet", "Sonic");
        uberx.setPassenger(4);
        uberx.printDataCar();

        UberVan uberVan = new UberVan("AFG866", new Account("Andres Herrera", "KJD876"));
        uberVan.setPassenger(6);
    
        /*Car car2 = new Car("Qwe567", new Account("Andrea Herrera", "NJR548"));
        car2.passenger = 3;*/
    }
}