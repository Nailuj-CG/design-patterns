package creational.factoryMethod;

public class PlayStationGamePadFactory implements GamePadFactory {
    @Override
    public GamePad create() {
        return new PlayStationGamePad();
    }
}
