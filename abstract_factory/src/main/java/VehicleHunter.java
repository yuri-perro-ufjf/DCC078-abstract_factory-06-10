public class VehicleHunter implements Vehicle {
    @Override
    public String move(String distance) {
        return "Hunter vehicle has traveled " + distance + "km!";
    }
}
