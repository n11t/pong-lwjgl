package de.chesmuh.lwjgl.engine.utils;

import org.lwjgl.input.Keyboard;

public class KeyboardUtils {

    private KeyboardUtils() {
    }

    public static boolean isUpOrW() {
        return isUp(true);
    }

    public static boolean isUp() {
        return isUp(false);
    }

    public static boolean isDownOrS() {
        return isDown(true);
    }

    public static boolean isDown() {
        return isDown(false);
    }

    public static boolean isLeft() {
        return isLeft(false);
    }

    public static boolean isLeftOrA() {
        return isLeft(true);
    }

    public static boolean isRight() {
        return isRight(false);
    }

    public static boolean isRightOrD() {
        return isRight(true);
    }

    private static boolean isUp(boolean wasd) {
        return Keyboard.isKeyDown(Keyboard.KEY_UP) || wasd && Keyboard.isKeyDown(Keyboard.KEY_W);
    }

    private static boolean isLeft(boolean wasd) {
        return Keyboard.isKeyDown(Keyboard.KEY_LEFT) || wasd && Keyboard.isKeyDown(Keyboard.KEY_A);
    }

    private static boolean isRight(boolean wasd) {
        return Keyboard.isKeyDown(Keyboard.KEY_RIGHT) || wasd && Keyboard.isKeyDown(Keyboard.KEY_D);
    }

    private static boolean isDown(boolean wasd) {
        return Keyboard.isKeyDown(Keyboard.KEY_DOWN) || wasd && Keyboard.isKeyDown(Keyboard.KEY_S);
    }
}
