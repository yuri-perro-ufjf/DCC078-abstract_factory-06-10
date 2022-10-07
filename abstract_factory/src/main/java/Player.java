public class Player {
    private Actions actions;
    private Vehicle vehicle;

    public Player(AbstractFactory abstractFactory){
        this.actions = abstractFactory.createActions();
        this.vehicle = abstractFactory.createVehicle();
    }

    public String runPlayerAttack(){
        return this.actions.attack();
    }

    public String movePlayerWithVehicle(String distance){
        return this.vehicle.move(distance);
    }

}
