import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Map extends JPanel {
    private Obstacle[] obstaclesUL;
    private Obstacle[] obstaclesDR;
    public Prize prize1;
    private Random r = new Random();



    Map() {
        this.prize1 = new Prize(DefGame.PRIZEX + 70, DefGame.PRIZEY + 70);
        this.obstacles();
        this.mapGame();
        this.r = new Random();


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
        int newX=r.nextInt(DefGame.WINDOS_H-DefGame.LOW_X) +DefGame.LOW_X;
        int newY=r.nextInt(DefGame.WINDOS_W-DefGame.LOW_Y)+DefGame.LOW_Y;
        this.prize1.setX(newX);
        this.prize1.setY(newY);
        mapGame();
    }

}