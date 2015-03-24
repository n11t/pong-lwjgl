package de.chesmuh.ponggame;

import de.chesmuh.lwjgl.engine.App;

public class Main {

    public static void main(String[] args) {
        boolean versus = false;
        if (args.length >= 1 && args[0].equals("versus")) {
            versus = true;
        }
        PongGame game = new PongGame(versus);
        App app = App.create(game);
        app.run();
    }

}
