package creational.factoryMethod;

public class SwitchGamePadFactory implements GamePadFactory {
    @Override
    public GamePad create() {
        return new SwitchGamePad();
    }
}
