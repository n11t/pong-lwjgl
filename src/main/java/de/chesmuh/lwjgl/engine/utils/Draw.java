package de.chesmuh.lwjgl.engine.utils;

import static org.lwjgl.opengl.GL11.*;

public class Draw {

    private Draw() {
    }

    public static void changeColor(Color color) {
        changeColor(color, 1.0f);
    }

    public static void changeColor(Color color, float alpha) {
        glColor4f(color.getRed(), color.getGreen(), color.getBlue(), alpha);
    }

    public static void drawRect(float x, float y, float width, float height) {
        drawRect(x, y, width, height, 0);
    }

    public static void drawRect(float x, float y, float width, float height, float rotate) {
        glPushMatrix();
        {
            glTranslatef(x, y, 0);
            glRotatef(rotate, 0, 0, 1);

            glBegin(GL_QUADS);
            {
                glVertex2f(0, 0);
                glVertex2f(0, height);
                glVertex2f(width, height);
                glVertex2f(width, 0);
            }
            glEnd();
        }
        glPopMatrix();
    }

}
