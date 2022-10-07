import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void shouldBeShowMageAttack(){
        AbstractFactory abstractFactory = new FactoryMage();
        Player player = new Player(abstractFactory);

        assertEquals(player.runPlayerAttack(), "Mage attack!");
    }

    @Test
    void shouldBeShowHunterAttack(){
        AbstractFactory abstractFactory = new FactoryHunter();
        Player player = new Player(abstractFactory);

        assertEquals(player.runPlayerAttack(), "Hunter attack!");
    }

    @Test
    void shouldBeTravelWithMageVehicle(){
        AbstractFactory abstractFactory = new FactoryMage();
        Player player = new Player(abstractFactory);

        assertEquals(player.movePlayerWithVehicle("100"), "Mage vehicle has traveled 100km!");
    }

    @Test
    void shouldBeTravelWithHunterVehicle(){
        AbstractFactory abstractFactory = new FactoryHunter();
        Player player = new Player(abstractFactory);

        assertEquals(player.movePlayerWithVehicle("200"), "Hunter vehicle has traveled 200km!");
    }
}