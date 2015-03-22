package de.chesmuh.ponggame.entity;

import de.chesmuh.lwjgl.engine.entity.Sprite;
import de.chesmuh.lwjgl.engine.utils.Color;

public class Player extends Panel {

    public static final float SPEED = 4f;

    public Player(float x, float y, Ball ball) {
        super(x, y, ball);
        this.sprite = new Sprite(Color.GREEN, WIDTH, HEIGHT);
    }

    @Override
    public void update() {
        super.update();
    }

    public void move(float deltaY) {
        this.y += deltaY * SPEED;
    }

}
