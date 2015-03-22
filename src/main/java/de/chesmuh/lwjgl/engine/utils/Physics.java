package de.chesmuh.lwjgl.engine.utils;

import java.awt.Rectangle;

import de.chesmuh.lwjgl.engine.entity.GameObject;

public class Physics {

    public static boolean checkCollision(GameObject gameObject1, GameObject gameObject2) {
        Rectangle r1 = new Rectangle((int) gameObject1.getX(), (int) gameObject1.getY(), (int) gameObject1.getWidth(),
                (int) gameObject1.getHeight());
        Rectangle r2 = new Rectangle((int) gameObject2.getX(), (int) gameObject2.getY(), (int) gameObject2.getWidth(),
                (int) gameObject2.getHeight());
        return r1.intersects(r2);
    }

}
