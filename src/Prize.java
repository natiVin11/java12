import javax.swing.*;
import java.awt.*;

public class Prize extends Position{

    private ImageIcon icon;

    public Prize(int x, int y) {
        super(x, y);
        this.icon = new ImageIcon("Img/Money.png");
    }


    public void paint(Graphics g, Map map) {
        this.icon.paintIcon(map,g,this.getX(),this.getY());
    }


    public ImageIcon getIcon() {
        return icon;
    }

    public void setIcon(ImageIcon icon) {
        this.icon = icon;
    }
}
