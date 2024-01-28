package creational.abstractFactory;

public class PlayStationConsoleFactory implements ConsoleFactory {
    @Override
    public GamePad buildGamePad() {
        return new PlayStationGamePad();
    }

    @Override
    public VRGlasses buildVRGlasses() {
        return new PlayStationVRGlasses();
    }

    @Override
    public EntertainmentSystem buildConsole() {
        return new PlayStationSystem();
    }
}
