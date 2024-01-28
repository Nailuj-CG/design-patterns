package creational.abstractFactory;

public class ConsoleManufacturer {
    private final ConsoleFactory consoleFactory;

    public ConsoleManufacturer(ConsoleFactory consoleFactory) {
        this.consoleFactory = consoleFactory;
    }

    public void packConsole() {
        GamePad gamePad = consoleFactory.buildGamePad();
        VRGlasses vrGlasses = consoleFactory.buildVRGlasses();
        EntertainmentSystem entertainmentSystem = consoleFactory.buildConsole();

        entertainmentSystem.switchOn();
        gamePad.pressButton();
        vrGlasses.putOn();
    }
}
