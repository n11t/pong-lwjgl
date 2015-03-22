package de.chesmuh.ponggame.entity;

import de.chesmuh.lwjgl.engine.entity.GameObject;
import de.chesmuh.lwjgl.engine.entity.Sprite;
import de.chesmuh.lwjgl.engine.utils.Color;
import de.chesmuh.lwjgl.engine.utils.Physics;

public abstract class Panel extends GameObject {

    public static final float WIDTH = 16;
    public static final float HEIGHT = WIDTH * 7;

    protected Ball ball;

    public Panel(float x, float y, Ball ball) {
        super(x, y, new Sprite(Color.WHITE, WIDTH, HEIGHT));
        this.ball = ball;
    }

    @Override
    public void update() {
        if (Physics.checkCollision(this, this.ball)) {
            this.ball.reverseX(this.getCenterY());
        }
    }
}
