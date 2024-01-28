package creational.abstractFactory;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class ConsoleManufacturerTest {
    @Nested
    class PlayStationFactoryTests {

        @Test
        void should_create_console_pack() {
            ConsoleManufacturer consoleManufacturer = new ConsoleManufacturer(new PlayStationConsoleFactory());
            consoleManufacturer.packConsole();
        }
    }

    @Nested
    class SwitchFactoryTests {

        @Test
        void should_create_console_pack() {
            ConsoleManufacturer consoleManufacturer = new ConsoleManufacturer(new NintendoSwitchConsoleFactory());
            consoleManufacturer.packConsole();
        }
    }
}