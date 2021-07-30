import java.awt.*;

class Explode {
    private int x, y;
    private int step = 0;
    private int[] diameter = {1, 4, 7, 12, 18, 26, 32, 40, 49};

    Explode(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void draw(Graphics graphics, GamePanel gamePanel) {
        if (step == diameter.length) {
            step = 0;
            gamePanel.gameOver();
        }
        Color color = graphics.getColor();
        graphics.setColor(Color.ORANGE);
        graphics.fillOval(x, y, diameter[step], diameter[step]);
        graphics.setColor(color);
        step++;
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
}
