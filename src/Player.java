import javax.swing.*;
import java.awt.*;

public class Player extends Position{

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
        this.imageIcon.paintIcon(gamePanel,g,this.getX(),this.getY());

    }
}
