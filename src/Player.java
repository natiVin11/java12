import javax.swing.*;
import java.awt.*;

public class Player extends Position {

    private ImageIcon imageIcon;
    private Shot pshots;

    public Player(int x, int y){
        super(x, y);
        this.imageIcon = new ImageIcon("Img/player2_tank_down.png");
        this.pshots = new Shot(getX(),getY());
    }

    public  void shooting(int x,int y){
        pshots.diriction(x,y);
        pshots.setX(getX()-x);
        pshots.setY(getY()+y);
    }

    public ImageIcon getImageIcon() {
        return imageIcon;
    }

    public void setImageIcon(ImageIcon imageIcon) {
        this.imageIcon = imageIcon;
    }

    public void paint(Graphics g, GamePanel gamePanel) {
        this.imageIcon.paintIcon(gamePanel, g, this.getX(), this.getY());
        pshots.paint(g,gamePanel);

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
}
