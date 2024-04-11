//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Vehicle VehicleStandar = new VehicleStandar("1234", "red ");
        Vehicle VehicleDeluxe = new VehicleDeluxe("5678", "blue", 3.0);

        Drive drive = new Drive("Nicolas", VehicleStandar);

        drive.howMuchForTrip(10.0);
        drive.howMuchForTrip(22.0);

        drive.setVehicle(VehicleDeluxe);
        drive.howMuchForTrip(30.0);





    }
}