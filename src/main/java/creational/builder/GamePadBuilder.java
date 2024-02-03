package creational.builder;

public interface GamePadBuilder {
    PlayStationGamePad getResult();

    void buildFrame();

    void buildJoySticks();

    void buildButtons();

    void buildTriggers();

    void buildDPad();
}
