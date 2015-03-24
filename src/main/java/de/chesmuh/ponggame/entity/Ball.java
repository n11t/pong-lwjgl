package de.chesmuh.ponggame.entity;

import de.chesmuh.lwjgl.engine.entity.GameObject;
import de.chesmuh.lwjgl.engine.entity.Sprite;
import de.chesmuh.lwjgl.engine.utils.Color;

public class Ball extends GameObject {

    public static final float SIZE = 16;

    private float max_speed_x = 4f;
    private float max_speed_y = 4f;

    public static final float DAMPING = 0.05f;

    private float velocityX;
    private float velocityY;

    private float startX;
    private float startY;

    public Ball(float x, float y) {
        super(x, y, new Sprite(Color.WHITE, SIZE, SIZE));

        this.velocityX = -this.max_speed_x;
        this.velocityY = 0;

        this.startX = x;
        this.startY = y;
    }

    @Override
    public void update() {
        this.x += this.velocityX;
        this.y += this.velocityY;
    }

    public void reverseX(float centerY) {
        this.velocityX *= -1;

        this.velocityY += (this.getCenterY() - centerY) * DAMPING;

        if (this.velocityY > this.max_speed_y) {
            this.velocityY = this.max_speed_y;
        } else if (this.velocityY < -this.max_speed_y) {
            this.velocityY = -this.max_speed_y;
        }
    }

    public void reverseY() {
        this.velocityY *= -1;
    }

    public void resetPosition() {
        this.x = this.startX;
        this.y = this.startY;

        this.velocityY = 0;
        this.velocityX *= -1;
    }

    public void setMaxSpeed(float maxSpeed) {
        this.max_speed_x = maxSpeed;
        this.max_speed_y = maxSpeed;
    }

}
