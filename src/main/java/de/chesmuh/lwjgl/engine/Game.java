package de.chesmuh.lwjgl.engine;

import java.util.ArrayList;
import java.util.List;

import de.chesmuh.lwjgl.engine.entity.GameObject;

public abstract class Game {

    protected List<GameObject> objects;

    protected Game() {
        this.objects = new ArrayList<GameObject>();
    }

    public abstract void init();

    public abstract void getInput();

    public void update() {
        for (GameObject object : this.objects) {
            object.update();
        }
    };

    public void render() {
        for (GameObject object : this.objects) {
            object.render();
        }
    }

}
