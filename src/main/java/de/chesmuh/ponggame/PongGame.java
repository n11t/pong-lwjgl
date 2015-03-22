package de.chesmuh.ponggame;

import org.lwjgl.opengl.Display;

import de.chesmuh.lwjgl.engine.Game;
import de.chesmuh.lwjgl.engine.utils.KeyboardUtils;
import de.chesmuh.ponggame.entity.Ball;
import de.chesmuh.ponggame.entity.Enemy;
import de.chesmuh.ponggame.entity.Panel;
import de.chesmuh.ponggame.entity.Player;
import de.chesmuh.ponggame.entity.Wall;

public class PongGame extends Game {

    private Player player;

    private Ball ball;

    private Enemy enemy;

    private int scorePlayer;

    private int scoreEnemy;

    @Override
    public void init() {
        this.scorePlayer = 0;
        this.scoreEnemy = 0;

        this.ball = new Ball(Display.getWidth() / 2 - Ball.SIZE / 2, Display.getHeight() / 2 - Ball.SIZE / 2);
        this.player = new Player(10, Display.getHeight() / 2 - Panel.HEIGHT / 2, this.ball);
        this.enemy = new Enemy(Display.getWidth() - Panel.WIDTH - 10, Display.getHeight() / 2 - Panel.HEIGHT / 2,
                this.ball);
        Wall top = new Wall(0, 0, Display.getWidth(), Wall.STDSIZE , this.ball);
        Wall bot = new Wall(0, Display.getHeight() - Wall.STDSIZE, Display.getWidth(), Wall.STDSIZE, this.ball);

        this.objects.add(this.ball);
        this.objects.add(this.player);
        this.objects.add(this.enemy);
        this.objects.add(top);
        this.objects.add(bot);
    }

    @Override
    public void getInput() {
        if (KeyboardUtils.isUpOrW()) {
            this.player.move(1);
        }
        if (KeyboardUtils.isDownOrS()) {
            this.player.move(-1);
        }
    }

    @Override
    public void update() {
        super.update();

        if (this.ball.getX() > Display.getWidth() + Ball.SIZE) {
            this.scorePlayer++;
            this.ball.resetPosition();
        } else if (this.ball.getX() < -Ball.SIZE) {
            this.scoreEnemy++;
            this.ball.resetPosition();
        }
    }

    @Override
    public void render() {
        super.render();

        Display.setTitle("Player: " + this.scorePlayer + " - Enemey: " + this.scoreEnemy);
    }
}
