import javax.swing.*;
import java.awt.*;

public class Prize extends Position{

    private ImageIcon icon;


    public Prize(int x, int y) {
        super(x, y);
        this.icon = new ImageIcon("Img/Money.png");
    }

    public void setRandomPosition() {
        setX((int) (Math.random() * 50));
        setY((int) (Math.random() * 50));
    }

    public void paint(Graphics g, Map map, int prizwX, int i) {
        this.icon.paintIcon(map,g,this.getX(),this.getY());
    }


    public ImageIcon getIcon() {
        return icon;
    }

    public void setIcon(ImageIcon icon) {
        this.icon = icon;
    }
}
