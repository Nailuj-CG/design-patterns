package creational.abstractFactory;

public interface ConsoleFactory {
    GamePad buildGamePad();

    VRGlasses buildVRGlasses();

    EntertainmentSystem buildConsole();
}
