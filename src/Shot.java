import javax.swing.*;
import java.awt.Graphics;

public class Shot extends Position{
    private ImageIcon shot;
    int xDir=0;
    int yDir=0;

    public Shot(int x, int y) {
        super(x, y);
        this.shot = new ImageIcon("Img/1.gif");

    }

//    public void shootEnemy(int x,int y){
//        this.setX(x + 5);
//    }

    public void setShot(ImageIcon shot) {
        this.shot = shot;
    }

    public  void  paint(Graphics g, GamePanel gamePanel)
    {
            this.shot.paintIcon(gamePanel, g, this.getX(), this.getY()+21);
        this.move();

    }
    public void move() {
        this.setX(getX() + xDir);
        this.setY(getY() + yDir);

    }
    public void diriction(int x,int y) {
        xDir=x;
        yDir=y;

    }


    }


