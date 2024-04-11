public class Drive {

    private String name;
    private Vehicle vehicle;


    public Drive(String name, Vehicle vehicle) {
        this.name = name;
        this.vehicle = vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void howMuchForTrip(Double distance){
        System.out.println("That trip cost you: " + vehicle.calculateFare(distance) + "$");
    }
}
