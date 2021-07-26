import javax.swing.*;
import java.awt.*;

public class Map extends JPanel {
    private Enemy[] enemies;
    private Obstacle[] obstaclesUL;
    private Obstacle[] obstaclesDR;
    Prize prize1;


    Map() {
        this.prize1 = new Prize(DefGame.PRIZEX + 70, DefGame.PRIZEY + 70);
        this.obstacles();
        this.mapGame();

    }
    public void obstacles() {
        this.obstaclesUL = new Obstacle[200];
        this.obstaclesDR = new Obstacle[200];
        int i = 0, y = 0;
        for (i = 0; i < 200; i++) {
            if (i < DefGame.X_LINE)
                obstaclesUL[i] = new Obstacle(50 + i * 50, 0);
            else {
                obstaclesUL[i] = new Obstacle(0, 0 + y * 50);
                y++;
            }
        }
        for (y = 0, i = 0; y < 200; y++) {
            if (y < DefGame.X_LINE)
                obstaclesDR[y] = new Obstacle( 0+ y * 50, 17 * 45);
            else {
                obstaclesDR[y] = new Obstacle(29 * 50, 0 + i * 50);
                i++;
            }
        }
    }

    public void mapGame() {
        new Thread(() -> {
            while (true) {

                repaint();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    public void paint(Graphics g) {
        this.prize1.paint(g, this);
        for (int i = 1; i < 200; i++) {
            this.obstaclesUL[i].paint(g, this);
        }
        for (int y = 1; y < 200; y++) {
            this.obstaclesDR[y].paint(g, this);
        }


    }

    public void locatePrice() {
            prize1.setX((DefGame.WINDOS_H-60) + (int) (Math.random() * (DefGame.WINDOS_H-60)));
            prize1.setY((DefGame.WINDOS_W-60) + (int) (Math.random() * (DefGame.WINDOS_W-60)));

        repaint();

    }
    }
