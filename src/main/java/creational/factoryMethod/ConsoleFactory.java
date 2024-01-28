package creational.factoryMethod;

public class ConsoleFactory {

    public static final String PLAYSTATION = "PLAYSTATION";

    public static void create(String console) {
        GamePadFactory gamePadFactory;

        if (PLAYSTATION.equals(console)) {
            gamePadFactory = new PlayStationGamePadFactory();
        } else {
            gamePadFactory = new SwitchGamePadFactory();
        }

        GamePad gamePad = gamePadFactory.create();
        gamePad.pressButton();
    }
}
