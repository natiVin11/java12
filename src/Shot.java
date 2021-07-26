import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

public class Shot extends Position{
    private ImageIcon shot;
    private java.awt.Graphics Graphics;

    public Shot(int x, int y ) {
        super(x, y);
        this.shot = new ImageIcon("Img/enemy_shot.png");
    }

    public void shootEnemy(){

        while(getX()<1500)
            this.setX(getX() + 5);
    }


    public void setShot(ImageIcon shot) {
        this.shot = shot;
    }

    public  void  paint(Graphics g,GamePanel gamePanel)
    {
        this.shot.paintIcon(gamePanel, g, this.getX(), this.getY());
    }

}
