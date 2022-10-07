public class VehicleMage implements Vehicle {
    @Override
    public String move(String distance) {
        return "Mage vehicle has traveled " + distance + "km!";
    }
}
