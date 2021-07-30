import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Player extends Position {

    private ImageIcon imageIcon;
    private Shot pshots;

    public Player(int x, int y) {
        super(x, y);
        this.imageIcon = new ImageIcon("Img/player2_tank_down.png");
        this.pshots = new Shot(getX()+10, getY());

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
        if (this.getX() < 50 || this.getY() < 50 || this.getY() > DefGame.WINDOS_W - 150 || this.getX() > DefGame.WINDOS_H - 100) {
            return false;
        }
        return true;
    }

    public boolean catchPrice(int x, int y) {
        if (this.x>=x &&this.x>=x+ DefGame.PRICE_W&& this.y <= y&&this.x>=x+ DefGame.PRICE_H) {
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
        if (this.getX() <= x+DefGame.ROBOT_Y&&this.getX() >= x&& this.getY()
                <= y+DefGame.ROBOT_Y&&this.getY()>=y)
            return true;
        return false;

    }
}
