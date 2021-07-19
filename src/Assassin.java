import javax.swing.*;
import java.awt.*;

public class Assassin {
        private int x;
        private int y;
        private ImageIcon imageIcon;


        public Assassin(int x, int y) {
            this.x = x;
            this.y = y;
            this.imageIcon = new ImageIcon("Img/Robot2.png");

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

        public ImageIcon getImageIcon() {
            return imageIcon;
        }

        public void setImageIcon(ImageIcon imageIcon) {
            this.imageIcon = imageIcon;
        }
        public void paint(Graphics g, GamePanel gamePanel) {
            this.imageIcon.paintIcon(gamePanel,g,x,y);

        }
    }