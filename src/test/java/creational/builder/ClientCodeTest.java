package creational.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ClientCodeTest {

    @Test
    void should_create_a_playstation_game_pad() {
        // when
        GamePad gamePad = ClientCode.buildGamePad();

        // then
        assertInstanceOf(PlayStationGamePad.class, gamePad);
        assertNotNull(((PlayStationGamePad) gamePad).getFrame());
        assertNotNull(((PlayStationGamePad) gamePad).getJoySticks());
        assertNotNull(((PlayStationGamePad) gamePad).getdPad());
        assertNotNull(((PlayStationGamePad) gamePad).getButtons());
        assertNotNull(((PlayStationGamePad) gamePad).getTriggers());
    }
}