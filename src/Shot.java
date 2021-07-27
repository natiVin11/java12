import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.font.ImageGraphicAttribute;

public class Shot extends Position{
    private ImageIcon shot;
    private java.awt.Graphics Graphics;

    public Shot(int x, int y ) {
        super(x, y);
        this.shot = new ImageIcon("Img/1.gif");

    }


//    public void shootEnemy(int x,int y){
//        this.setX(x + 5);
//    }

    public void setShot(ImageIcon shot) {
        this.shot = shot;
    }

    public  void  paint(Graphics g,GamePanel gamePanel)
    {
            move();
            this.shot.paintIcon(gamePanel, g, this.getX(), this.getY());
    }

    private void move() {
         this.setX(getX()-5);

        }
    }

