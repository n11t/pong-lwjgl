package de.chesmuh.lwjgl.engine.utils;

import org.lwjgl.input.Keyboard;

public class KeyboardUtils {

    private KeyboardUtils() {
    }

    public static boolean isOneKeyDown(int... keys) {
        for (int key : keys) {
            if (Keyboard.isKeyDown(key)) {
                return true;
            }
        }
        return false;
    }

}
