import javax.swing.*;
import java.awt.*;

public class Enemy extends Position {
    private ImageIcon imageIcon;
    private Shot[] shot;
    private Shot bullet;
    int velX = 10;
    boolean flag = true;


    public Enemy(int x, int y) {
        super(x, y);
        this.imageIcon = new ImageIcon("Img/EnemyR.png");
        bullet = new Shot(getX(), getY() + 21);
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
        this.bullet = new Shot(getX(), getY());
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

    public void paint(Graphics g, GamePanel gamePanel, int x, int y) {
        this.imageIcon.paintIcon(gamePanel, g, this.getX(), this.getY());
        bullet.paint(g,gamePanel);

    }

    public void direction() {
        if (flag) {
            setImageIcon(new ImageIcon("Img/EnemyR.png"));
        }
        else{
            setImageIcon(new ImageIcon("Img/EnemyL.png"));
           }

        this.setX(this.getX() - velX);
        if (this.getX() < 60 || this.getX() > 1300) {
            velX = (-1) * (velX);
            flag = !flag;
        }

    }
    public boolean checkEnemy(int x,int y) {
        if (this.getX() == x  && this.getY() == y)
            return true;
        return false;

    }
}