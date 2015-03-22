package de.chesmuh.ponggame;

import de.chesmuh.lwjgl.engine.App;

public class Main {

    public static void main(String[] args) {
        PongGame game = new PongGame();
        App app = App.create(game);
        app.run();
    }

}
