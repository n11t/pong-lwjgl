package de.chesmuh.lwjgl.engine.entity;

public class Frame {

    private int length;
    private Sprite sprite;
    private int numDisplayed;

    private Frame(Sprite sprite, int length) {
        this.sprite = sprite;
        this.length = length;
        this.numDisplayed = 0;
    }

    public boolean render() {
        this.sprite.render();

        this.numDisplayed++;

        if (this.numDisplayed >= this.length) {
            this.numDisplayed = 0;
            return true;
        }

        return false;
    }

}
