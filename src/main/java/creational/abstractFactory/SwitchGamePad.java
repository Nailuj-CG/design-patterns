package creational.abstractFactory;

public class SwitchGamePad implements GamePad {
    @Override
    public void pressButton() {
        System.out.println("Switch button pressed!");
    }
}
