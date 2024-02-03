package creational.builder;

public class ClientCode {

    public static GamePad buildGamePad() {
        GamePadBuilder gamePadBuilder = new PlayStationGamePadBuilder();
        GamePadDirector gamePadDirector = new GamePadDirector(gamePadBuilder);
        gamePadDirector.makePlayStationGamePad();

        return gamePadDirector.getGamePad();
    }
}
