package creational.abstractFactory;

public class PlayStationSystem implements EntertainmentSystem {
    @Override
    public void switchOn() {
        System.out.println("PlayStation running!");
    }
}
