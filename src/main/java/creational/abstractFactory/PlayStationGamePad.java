package creational.abstractFactory;

public class PlayStationGamePad implements GamePad {
    @Override
    public void pressButton() {
        System.out.println("PlayStation button pressed!");
    }
}
