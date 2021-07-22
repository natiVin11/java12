import javax.swing.*;
import java.awt.*;

public class Obstacle extends Position{

        private ImageIcon imageIcon;

    public Obstacle(int x, int y) {
        super(x, y);
        this.imageIcon = new ImageIcon("Img/solid_brick.jpg");
    }



        public ImageIcon getImageIcon() {
            return imageIcon;
        }

        public void setImageIcon(ImageIcon imageIcon) {
            this.imageIcon = imageIcon;
        }
        public void paint(Graphics g, Map map) {
            this.imageIcon.paintIcon(map,g,this.getX(),this.getY());

        }


}