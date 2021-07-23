import javax.swing.*;
import java.awt.*;

public class Map extends JPanel {
    private Enemy[] enemies;
    private Obstacle[] obstaclesUL;
    private Obstacle[] obstaclesDR;
    private Prize prize1;


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
                obstaclesDR[y] = new Obstacle(50 + y * 50, 17 * 45);
            else {
                obstaclesDR[y] = new Obstacle(29 * 50, 0 + i * 50);
                i++;
            }
        }
    }

    public boolean checkO(Player player, char d) {
        for (int i = 0; i < obstaclesUL.length; i++)
            for (int h = 0, w = 0; h <= DefGame.ENEMY_H && w <= DefGame.ENEMY_W; )
                switch (d) {
                    case 'L':
                        if (obstaclesUL[i].getY() + h == player.getY() &&
                                obstaclesUL[i].getX() + DefGame.ENEMY_H == player.getX()) {
                            return false;
                        }
                        h++;
                        break;
                    case 'R':
                        if (obstaclesUL[i].getY() == player.getY() &&
                                obstaclesUL[i].getX() == player.getX() + DefGame.ENEMY_H) {
                            return false;
                        }
                        if (obstaclesDR[i].getY() + h == player.getY() &&
                                obstaclesDR[i].getX() - DefGame.ENEMY_H == player.getX()) {
                            return false;
                        }
                        w++;
                        h++;
                        break;
                    default:
                        break;
                }
        return true;


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
        for (int y = 0; y < 200; y++) {
            this.obstaclesDR[y].paint(g, this);
        }


    }


}