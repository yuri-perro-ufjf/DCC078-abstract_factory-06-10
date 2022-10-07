public class FactoryMage implements AbstractFactory {
    @Override
    public ActionsMage createActions() {
        return new ActionsMage();
    }

    @Override
    public VehicleMage createVehicle() {
        return new VehicleMage();
    }
}
