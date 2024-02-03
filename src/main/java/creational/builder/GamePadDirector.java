package creational.builder;

public class GamePadDirector {
    private final GamePadBuilder builder;

    public GamePadDirector(GamePadBuilder builder) {
        this.builder = builder;
    }

    public void makePlayStationGamePad() {
        this.builder.buildFrame();
        this.builder.buildJoySticks();
        this.builder.buildButtons();
        this.builder.buildDPad();
        this.builder.buildTriggers();
    }

    public GamePad getGamePad() {
        return this.builder.getResult();
    }
}
