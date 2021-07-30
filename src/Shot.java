import javax.swing.*;
import java.awt.Graphics;

public class Shot extends Position {
    private ImageIcon shot;
    int direction=0;


    public Shot(int x, int y) {
        super(x, y);
        this.shot = new ImageIcon("Img/1.gif");

    }

    public void setShot(ImageIcon shot) {
        this.shot = shot;
    }

    public void paint(Graphics g, GamePanel gamePanel) {
        this.shot.paintIcon(gamePanel, g, this.getX(), this.getY() + 21);
//        this.move();
    }

    public void move() {
        x-=5;
//        switch (direction){
//            case 0:
//                y+=5;
//                break;
//            case 1:
//                x+=5;
//                break;
//            case 2:
//                y-=5;
//                break;
//            case 3:
//                break;
//        }
//
    }
    public void dir(int dir){
        direction=dir;
        move();
    }




}


