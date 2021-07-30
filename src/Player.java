import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Player extends Position {

    private ImageIcon imageIcon;
    private Shot pshots;
    private Rectangle rectangle;

    public Player(int x, int y) {
        super(x, y);
        this.imageIcon = new ImageIcon("Img/player2_tank_down.png");
        this.pshots = new Shot(getX(), getY());
        this.rectangle = new Rectangle(getX(),getY(),DefGame.ENEMY_W,DefGame.ENEMY_H);
    }

    public Rectangle getRectangle() {
        return rectangle;
    }

    public void setRectangle(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public void shooting(int dir) {
        pshots.dir(dir);
    }

    public ImageIcon getImageIcon() {
        return imageIcon;
    }

    public void setImageIcon(ImageIcon imageIcon) {
        this.imageIcon = imageIcon;
    }

    public void paint(Graphics g, GamePanel gamePanel) {
        this.imageIcon.paintIcon(gamePanel, g, this.getX(), this.getY());
        pshots.paint(g, gamePanel);
    }

    public boolean checkErea() {
        if (this.getX() < 50 || this.getY() < 50 || this.getY() > DefGame.WINDOS_W - 100 || this.getX() > DefGame.WINDOS_H - 100) {
            return false;
        }
        return true;
    }

    public boolean catchPrice(int x, int y) {
        if (this.x + DefGame.PRICE_H == x && this.y + DefGame.PRICE_W == y) {
            System.out.println("catch");
            return true;
        }
        return false;

    }

    public Shot getPshots() {
        return pshots;
    }

    public void setPshots(Shot pshots) {
        this.pshots = pshots;
    }
    public boolean checkEnemy(int x, int y) {
        if (this.getX() == x && this.getY()  == y)
            return true;
        return false;

    }
}
