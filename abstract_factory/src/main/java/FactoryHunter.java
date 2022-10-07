public class FactoryHunter implements AbstractFactory{
    @Override
    public ActionsHunter createActions() {
        return new ActionsHunter();
    }

    @Override
    public VehicleHunter createVehicle() {
        return new VehicleHunter();
    }
}
