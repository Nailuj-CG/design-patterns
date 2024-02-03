package creational.builder;

import creational.builder.components.*;

public class PlayStationGamePadBuilder implements GamePadBuilder {
    private PlayStationFrame frame;
    private PlayStationJoySticks joySticks;
    private PlayStationDPad dPad;
    private PlayStationButtons buttons;
    private PlayStationTriggers triggers;

    @Override
    public PlayStationGamePad getResult() {
        return new PlayStationGamePad(
                this.frame,
                this.joySticks,
                this.dPad,
                this.buttons,
                this.triggers
        );
    }

    @Override
    public void buildFrame() {
        this.frame = new PlayStationFrame();
    }

    @Override
    public void buildJoySticks() {
        this.joySticks = new PlayStationJoySticks();
    }

    @Override
    public void buildButtons() {
        this.buttons = new PlayStationButtons();
    }

    @Override
    public void buildTriggers() {
        this.triggers = new PlayStationTriggers();
    }

    @Override
    public void buildDPad() {
        this.dPad = new PlayStationDPad();
    }
}
