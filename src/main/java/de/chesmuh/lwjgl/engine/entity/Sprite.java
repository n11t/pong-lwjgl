package de.chesmuh.lwjgl.engine.entity;

import static org.lwjgl.opengl.GL11.*;
import de.chesmuh.lwjgl.engine.utils.Color;
import de.chesmuh.lwjgl.engine.utils.Draw;

public class Sprite {

    private Color color;

    private float width;

    private float height;

    public Sprite(Color color, float width, float height) {
        super();
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public void render() {
        Draw.changeColor(this.color);
        glBegin(GL_QUADS);
        {
            glVertex2f(0, 0);
            glVertex2f(0, this.height);
            glVertex2f(this.width, this.height);
            glVertex2f(this.width, 0);
        }
        glEnd();
    }

    public float getWidth() {
        return this.width;
    }

    public float getHeight() {
        return this.height;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public void setHeight(float height) {
        this.height = height;
    }

}
