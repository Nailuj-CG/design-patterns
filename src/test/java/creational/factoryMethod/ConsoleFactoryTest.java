package creational.factoryMethod;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class ConsoleFactoryTest {

    @Nested
    class PlayStationFactoryTests {

        @Test
        void should_create_game_pad() {
            ConsoleFactory.create(ConsoleFactory.PLAYSTATION);
        }
    }

    @Nested
    class SwitchFactoryTests {

        @Test
        void should_create_game_pad() {
            ConsoleFactory.create("SWITCH");
        }
    }
}