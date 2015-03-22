package de.chesmuh.ponggame.entity;

import de.chesmuh.lwjgl.engine.entity.GameObject;
import de.chesmuh.lwjgl.engine.entity.Sprite;
import de.chesmuh.lwjgl.engine.utils.Color;
import de.chesmuh.lwjgl.engine.utils.Physics;

public class Wall extends GameObject {

    public static final float STDSIZE = 16;

    private Ball ball;

    public Wall(float x, float y, float width, float height, Ball ball) {
        super(x, y, new Sprite(Color.BLUE, width, height));

        this.ball = ball;
    }

    @Override
    public void update() {
        if (Physics.checkCollision(this, this.ball)) {
            this.ball.reverseY();
        }
    }

}
