package creational.builder;

import creational.builder.components.*;

public class PlayStationGamePad implements GamePad {
    private final PlayStationFrame frame;
    private final PlayStationJoySticks joySticks;
    private final PlayStationDPad dPad;
    private final PlayStationButtons buttons;
    private final PlayStationTriggers triggers;

    public PlayStationGamePad(
            PlayStationFrame frame,
            PlayStationJoySticks joySticks,
            PlayStationDPad dPad,
            PlayStationButtons buttons,
            PlayStationTriggers triggers
    ) {
        this.frame = frame;
        this.joySticks = joySticks;
        this.dPad = dPad;
        this.buttons = buttons;
        this.triggers = triggers;
    }

    public PlayStationFrame getFrame() {
        return frame;
    }

    public PlayStationJoySticks getJoySticks() {
        return joySticks;
    }

    public PlayStationDPad getdPad() {
        return dPad;
    }

    public PlayStationButtons getButtons() {
        return buttons;
    }

    public PlayStationTriggers getTriggers() {
        return triggers;
    }
}
