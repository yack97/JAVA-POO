public abstract class Vehicle {

    private static Double PRICE_PER_KM = 100.0;

    private String LicencePlate;
    private String Color;

    public Vehicle(String licencePlate, String color) {
        LicencePlate = licencePlate;
        Color = color;
    }

    public Double calculateFare(Double distance){
        return distance * PRICE_PER_KM;
    }


}
