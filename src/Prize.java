import javax.swing.*;
import java.awt.*;

public class Prize extends Position{

    private ImageIcon icon;
    private Rectangle pr;
    public Prize(int x, int y) {
        super(x, y);
        this.icon = new ImageIcon("Img/Money.png");
        pr=new Rectangle(this.getX(),this.getY(),DefGame.PRICE_W,DefGame.PRICE_H);
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
