import javax.swing.*;
import java.awt.*;

public class Enemy extends Position {
    private ImageIcon imageIcon;
    private Shot[] shot;
    int velX=10;

    enum Direction {L, R, D, U}

    Direction dir;

    public Enemy(int x, int y) {
        super(x, y);
        this.imageIcon = new ImageIcon("Img/EnemyR.png");
        this.shot = new Shot[5];
    }

    public ImageIcon getImageIcon() {
        return imageIcon;
    }

    public void setImageIcon(ImageIcon imageIcon) {
        this.imageIcon = imageIcon;
    }

    public void paint(Graphics2D g, GamePanel gamePanel) {
        this.imageIcon.paintIcon(gamePanel, g, this.getX(), this.getY());

    }

    public void direction() {
        velX=-velX;
    this.setX(getX()+velX);
    }
}