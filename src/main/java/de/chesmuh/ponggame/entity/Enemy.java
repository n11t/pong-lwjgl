package de.chesmuh.ponggame.entity;

import de.chesmuh.lwjgl.engine.entity.Sprite;
import de.chesmuh.lwjgl.engine.utils.Color;

public class Enemy extends Panel {

    public static final float SPEED = 4f;
    public static final float DAMPING = 0.05f;

    public static final float MAX_SPEED_Y = 4f;
    public static final float MAX_SPEED_X = 4f;

    public Enemy(float x, float y, Ball ball) {
        super(x, y, ball);
        this.sprite = new Sprite(Color.RED, WIDTH, HEIGHT);
    }

    @Override
    public void update() {
        super.update();

        float move = (this.ball.getCenterY() - this.getCenterY()) * DAMPING;

        if (move > MAX_SPEED_Y) {
            move = MAX_SPEED_Y;
        } else if (move < -MAX_SPEED_Y) {
            move = -MAX_SPEED_Y;
        }
        this.y += move;
    }

}
