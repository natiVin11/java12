import java.awt.*;

class Explode {
    private int x, y;
    private int step = 0;
    private int[] diameter = {1, 4, 7, 12, 18, 26, 32, 40, 49, 30, 20, 14, 6};

    private boolean live = true;

    private Player player;

    Explode(int x, int y, Player player) {
        this.x = x;
        this.y = y;
        this.player = player;
    }

    void draw(Graphics graphics,GamePanel gamePanel) {
        if (step == diameter.length) {
            live = false;
            step = 0;
            return;
        }

        Color color = graphics.getColor();
        graphics.setColor(Color.ORANGE);
        graphics.fillOval(x, y, diameter[step], diameter[step]);
        graphics.setColor(color);
        step++;
    }
}
