package de.chesmuh.lwjgl.engine;

import static org.lwjgl.opengl.GL11.GL_COLOR_BUFFER_BIT;
import static org.lwjgl.opengl.GL11.GL_DEPTH_TEST;
import static org.lwjgl.opengl.GL11.GL_MODELVIEW;
import static org.lwjgl.opengl.GL11.GL_PROJECTION;
import static org.lwjgl.opengl.GL11.glClear;
import static org.lwjgl.opengl.GL11.glClearColor;
import static org.lwjgl.opengl.GL11.glDisable;
import static org.lwjgl.opengl.GL11.glLoadIdentity;
import static org.lwjgl.opengl.GL11.glMatrixMode;
import static org.lwjgl.opengl.GL11.glOrtho;

import org.lwjgl.LWJGLException;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

public class App {

    private Game game;

    private App(Game game) {
        this.game = game;
    }

    public static App create(Game game) {
        return new App(game);
    }

    public void run() {
        this.initDisplay();
        this.initGL();
        this.initGame();

        this.gameLoop();

        this.cleanUp();

        System.exit(0);
    }

    private void initDisplay() {
        try {
            Display.setDisplayMode(new DisplayMode(800, 600));
            Display.create();

            Keyboard.create();
        } catch (LWJGLException exn) {
            exn.printStackTrace();
            System.exit(1);
        }

        Display.setVSyncEnabled(true);
    }

    private void initGL() {
        glMatrixMode(GL_PROJECTION);
        glLoadIdentity();
        glOrtho(0, Display.getWidth(), 0, Display.getHeight(), -1, 1);
        glMatrixMode(GL_MODELVIEW);

        glDisable(GL_DEPTH_TEST);
        glClearColor(0f, 0f, 0f, 1);
    }

    private void getInput() {
        this.game.getInput();
    }

    private void update() {
        this.game.update();
    }

    private void render() {
        glClear(GL_COLOR_BUFFER_BIT);
        glLoadIdentity();

        this.game.render();

        Display.update();
        Display.sync(60);
    }

    private void initGame() {
        this.game.init();
    }

    private void gameLoop() {
        while (!Display.isCloseRequested()) {
            this.getInput();
            this.update();
            this.render();
        }
    }

    private void cleanUp() {
        Display.destroy();
        Keyboard.destroy();
    }

    public static void main(String[] args) {
        App app = App.create(new Game() {
            @Override
            public void init() {
            }

            @Override
            public void getInput() {
            }
        });
        app.run();
    }

}
