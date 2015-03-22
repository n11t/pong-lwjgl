package de.chesmuh.lwjgl.engine.entity;

import java.util.ArrayList;
import java.util.List;

public class Animation {

    private List<Frame> frames;

    private int currentFrameCounter;

    public Animation() {
        super();
        this.frames = new ArrayList<Frame>();
        this.currentFrameCounter = 0;
    }

    public void render() {
        Frame currentFrame = this.frames.get(this.currentFrameCounter);
        if (currentFrame.render()) {
            this.currentFrameCounter++;
            this.currentFrameCounter %= this.frames.size();
        }
    }

}
