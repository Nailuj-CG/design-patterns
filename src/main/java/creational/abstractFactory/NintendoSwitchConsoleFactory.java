package creational.abstractFactory;

public class NintendoSwitchConsoleFactory implements ConsoleFactory {
    @Override
    public GamePad buildGamePad() {
        return new SwitchGamePad();
    }

    @Override
    public VRGlasses buildVRGlasses() {
        return new SwitchVRGlasses();
    }

    @Override
    public EntertainmentSystem buildConsole() {
        return new NintendoSwitchSystem();
    }
}
