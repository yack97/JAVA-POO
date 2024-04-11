public class VehicleDeluxe extends Vehicle{

    public Double priceMultiplier;

    public VehicleDeluxe (String licencePlate, String color, Double priceMultiplier  ){
        super(licencePlate, color);
        this.priceMultiplier = priceMultiplier;
    }

    @Override
    public Double calculateFare(Double distance) {
         return  super.calculateFare(distance) * priceMultiplier;
    }
}
