import javax.swing.*;
import java.awt.*;

public class Prize {
    private int x;
    private int y;
    private ImageIcon icon;

    public Prize(int x, int y) {
        this.x = x;
        this.y = y;
        this.icon = new ImageIcon("Img/KESEF.png");
    }
    public void paint(Graphics g, Map map) {
        this.icon.paintIcon(map,g,x,y);
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public ImageIcon getIcon() {
        return icon;
    }

    public void setIcon(ImageIcon icon) {
        this.icon = icon;
    }
}
