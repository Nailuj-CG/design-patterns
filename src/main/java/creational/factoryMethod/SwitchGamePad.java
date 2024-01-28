package creational.factoryMethod;

public class SwitchGamePad implements GamePad {
    @Override
    public void pressButton() {
        System.out.println("Switch button pressed!");
    }
}
