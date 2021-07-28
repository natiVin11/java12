import javax.swing.*;
import java.awt.*;

public class Enemy extends Position {
    private ImageIcon imageIcon;
    private Shot[] shot;
    private Shot bullet;
    int velX = 7;

    public Enemy(int x, int y) {
        super(x, y);
        this.imageIcon = new ImageIcon("Img/EnemyR.png");
        this.shot = new Shot[5];
        bullet=new Shot(getX(),getY()+21);
    }

    public Shot[] getShot() {
        return shot;
    }

    public void setShot(Shot[] shot) {
        this.shot = shot;
    }

    public Shot getBullet() {
        return bullet;
    }

    public void setBullet() {
        this.bullet = new Shot(getX(),getY());
    }

    public int getVelX() {
        return velX;
    }

    public void setVelX(int velX) {
        this.velX = velX;
    }

    public ImageIcon getImageIcon() {
        return imageIcon;
    }

    public void setImageIcon(ImageIcon imageIcon) {
        this.imageIcon = imageIcon;
    }

    public void paint(Graphics g, GamePanel gamePanel) {
        this.imageIcon.paintIcon(gamePanel, g, this.getX(), this.getY());

    }

    public void direction(int x) {
        if (x == 0)
            this.setX(getX() - velX);
        else if(x!=0){
            velX = -velX;
            this.setX(getX() + velX);}

    }
}