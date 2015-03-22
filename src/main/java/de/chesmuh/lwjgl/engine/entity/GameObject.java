package de.chesmuh.lwjgl.engine.entity;

import static org.lwjgl.opengl.GL11.*;

public abstract class GameObject {

    protected float x;
    protected float y;
    protected Sprite sprite;

    public GameObject(float x, float y, Sprite sprite) {
        super();
        this.x = x;
        this.y = y;
        this.sprite = sprite;
    }

    public void update() {

    }

    public void render() {
        glPushMatrix();
        {
            glTranslatef(this.x, this.y, 0);

            this.sprite.render();
        }
        glPopMatrix();
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public float getHeight() {
        return this.sprite.getHeight();
    }

    public float getWidth() {
        return this.sprite.getWidth();
    }

    public float getCenterX() {
        return this.x + this.getWidth() / 2;
    }

    public float getCenterY() {
        return this.y + this.getHeight() / 2;
    }

}
