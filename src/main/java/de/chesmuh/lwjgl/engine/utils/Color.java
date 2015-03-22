package de.chesmuh.lwjgl.engine.utils;

public enum Color {

    RED(1.0f, 0.0f, 0.0f),
    GREEN(0.0f, 1.0f, 0.0f),
    BLUE(0.0f, 0.0f, 1.0f),
    YELLOW(1.0f, 1.0f, 0.0f),
    BLACK(0.0f, 0.0f, 0.0f),
    WHITE(1.0f, 1.0f, 1.0f);

    private float red;

    private float green;

    private float blue;

    private Color(float red, float green, float blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public float getRed() {
        return this.red;
    }

    public float getGreen() {
        return this.green;
    }

    public float getBlue() {
        return this.blue;
    }

}
