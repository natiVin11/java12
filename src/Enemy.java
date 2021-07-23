import javax.swing.*;
import java.awt.*;

public class Enemy extends Position {

    enum direction {
        L, R, U, D;
    }

    private ImageIcon imageIcon;

    public Enemy(int x, int y) {
        super(x, y);
        this.imageIcon = new ImageIcon("Img/EnemyL.png");
    }

    public ImageIcon getImageIcon() {
        return imageIcon;
    }

    public void setImageIcon(ImageIcon imageIcon) {
        this.imageIcon = imageIcon;
    }

    public void paint(Graphics g, GamePanel gamePanel) {
        this.imageIcon.paintIcon(gamePanel, g, this.getX(), this.getY());

    }

    public static void randomMobment(Enemy enemy) {
        int velY = 10, velX = 10;
        if (enemy.getY() >= 700) {
            velY = -velY;
        }
        if (enemy.getY() <= 50)
            velY = -velY;
        enemy.setY(enemy.getY() + velY);
        if (enemy.getX() >= 1350) {
            velX = -velX;
        }
        if (enemy.getX() <= 50)
            velX = -velX;
        enemy.setX(enemy.getX() - velX);
    }
}