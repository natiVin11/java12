import javax.swing.*;
import java.awt.*;

public class Player extends Position {

    private ImageIcon imageIcon;

    public Player(int x, int y) {
        super(x, y);
        this.imageIcon = new ImageIcon("Img/player2_tank_down.png");
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

    public boolean checkErea() {
        if (this.getX() < 50 || this.getY() < 50 || this.getY() > DefGame.WINDOS_W - 100 || this.getX() > DefGame.WINDOS_H - 100) {
            return false;
        }
        return true;
    }

    public boolean catchPrice(Prize prize) {

        return true;
    }

    public boolean catchPrice(int x, int y) {
        for (int h = 0; h < 50; h++) {
            if (this.getX() + h == x && this.getY() + h == y) {
                return true;
            }
        }
        return false;

    }
}
