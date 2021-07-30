import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
    private int setId;
    private final Player player;
    private Map map;
    private Explode explode;
    private Enemy en1;
    private Enemy en2;
    private Enemy en3;
    private Enemy en4;
    private Enemy en5;
    private Enemy en6;
    private int[] randX = {750, 800, 850, 900, 950, 1000, 1050, 1100, 1150, 1200};
    private int[] randY = {100, 80, 115, 810, 150, 200, 250, 300, 350, 400, 420, 450, 500, 550};
    private Random r = new Random();
    private int xPos = r.nextInt(5);
    private int yPos = r.nextInt(5);
    int direction = 0;
    boolean shoot = false;


    public GamePanel() {
        Font tr = new Font("TimesRoman", Font.PLAIN, 22);
        en1 = new Enemy(randX[xPos], randY[yPos]);
        en2 = new Enemy(randX[xPos + 2], randY[yPos++]);
        en3 = new Enemy(randX[xPos++], randY[yPos + 2]);
        en4 = new Enemy(randX[xPos + 3], randY[yPos++]);
        en5 = new Enemy(randX[xPos + 2], randY[yPos + 2]);
        en6 = new Enemy(randX[xPos + 3], randY[yPos++]);
        map = new Map();
        JButton button = new JButton("start game!");
        button.setBounds(DefGame.BOYTTON_X, DefGame.BOYTTON_Y, DefGame.BOYTTON_H, DefGame.BOYTTON_W);
        this.add(button);
        JLabel myText = new JLabel();
        myText.setText("Created BY Dario Hajduk & Nati Winter");
        myText.setFont(tr);
        myText.setBounds(1050, 650, 500, 150);
        myText.setForeground(Color.cyan);
        this.add(myText);
        JLabel background1 = new JLabel(new ImageIcon("Img/Background.jpeg"));
        background1.setBounds(0, 0, DefGame.WINDOS_H, DefGame.WINDOS_W);
        this.add(background1);
        button.addActionListener((e -> {
            this.setId = DefGame.SEN_START;
            button.setVisible(false);
            myText.setVisible(false);
            background1.setVisible(false);
        }));
        setLayout(null);
        this.player = new
                Player(DefGame.ROBOT_X, DefGame.ROBOT_Y);
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        this.mainGame();

    }

    public void mainGame() {
        new Thread(() -> {
            while (true) {
                repaint();
                if (player.checkEnemy( en1.getX(), en1.getY()) ||
                        player.checkEnemy(en2.getX() , en2.getY()) ||
                        player.checkEnemy(en3.getX() , en3.getY()) ||
                        player.checkEnemy(en4.getX(),en4.getY()) ||
                        player.checkEnemy(en5.getX(),en5.getY()) ||
                        player.checkEnemy(en6.getX(),en6.getY())) {
                    this.explode = new Explode(player.getX(), player.getY());
                    this.setId = DefGame.SEN_EXPLODE;

                }
                en1.direction();
                en2.direction();
                en3.direction();
                en4.direction();
                en5.direction();
                en6.direction();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

        }).start();

    }

    public void gameOver() {//Game Over screen - appears when Player get stuck in the walls\Enemies\shots
        this.setId = DefGame.SEN_GAMEOVER;
        JLabel gameOver = new JLabel(new ImageIcon("Img/GameOver.jpeg"));
        gameOver.setBounds(0, 0, DefGame.WINDOS_H, DefGame.WINDOS_W);
        JButton yesButton = new JButton("Yes");
        yesButton.setBounds(DefGame.BOYTTON_X - 650, DefGame.BOYTTON_Y - 200, DefGame.BOYTTON_H -
                DefGame.PRICE_W, DefGame.BOYTTON_W - DefGame.PRICE_W);
        JButton noButton = new JButton("No And Exit");
        noButton.setBounds(DefGame.BOYTTON_X - 650, DefGame.BOYTTON_Y - 50, DefGame.BOYTTON_H -
                DefGame.PRICE_W, DefGame.BOYTTON_W - DefGame.PRICE_W);
        this.add(noButton);
        this.add(yesButton);
        this.add(gameOver);
        noButton.setVisible(true);
        yesButton.setVisible(true);
        gameOver.setVisible(true);
        yesButton.addActionListener((e -> { //Try again button
            this.setId = DefGame.SEN_START;
            noButton.setVisible(false);
            yesButton.setVisible(false);
            gameOver.setVisible(false);
            player.setX(DefGame.ROBOT_X);
            player.setY(DefGame.ROBOT_Y);

        }));
        noButton.addActionListener((e -> {
            System.exit(0);
        }));
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        switch (this.setId) {
            case DefGame.SEN_MAIN:
                this.repaint();
                break;
            case DefGame.SEN_START:
                this.setBackground(Color.BLACK);
                this.player.paint(g, this);
                this.map.paint(g);
                while (true) {
                    int speed = 5;
                    en1.paint(g, this, en1.getX(), en1.getY());
                    en2.paint(g, this, en1.getX(), en1.getY());
                    en3.paint(g, this, en1.getX(), en1.getY());
                    en4.paint(g, this, en1.getX(), en1.getY());
                    en5.paint(g, this, en1.getX(), en1.getY());
                    en6.paint(g, this, en1.getX(), en1.getY());
                    if (player.catchPrice(map.prize1.x, map.prize1.y)) {
                        if ((xPos + 1) < 6 && yPos++ < 6 ) {
                            map.prize1.setX(randX[xPos++]);
                            map.prize1.setY(randY[yPos++]);
                        }
                        else if((xPos--) > 0 && yPos-- > 0)
                        {
                            map.prize1.setX(randX[xPos--]);
                            map.prize1.setY(randY[yPos--]);
                        }
                    }
                    break;
                }
            case DefGame.SEN_GAMEOVER:
                this.setBackground(Color.BLACK);
                break;
            case DefGame.SEN_EXPLODE:
                this.explode.draw(g, this);
                this.setBackground(Color.BLACK);
                this.map.paint(g);
        }
        repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        Random ran = new Random();
        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT:
                direction = 1;
                player.setImageIcon(new ImageIcon("Img/player2_tank_left.png"));
                if (!player.checkErea()) {
                    this.explode = new Explode(player.getX(), player.getY());
                    this.setId = DefGame.SEN_EXPLODE;
                    break;
                }
                player.setX(player.getX() - 5);
                break;
            case KeyEvent.VK_RIGHT:
                direction = 3;
                player.setImageIcon(new ImageIcon("Img/player2_tank_right.png"));
                if (!player.checkErea()) {
                    this.explode = new Explode(player.getX(), player.getY());
                    this.setId = DefGame.SEN_EXPLODE;
                    break;
                }
                player.setX(player.getX() + 5);
                break;
            case KeyEvent.VK_UP:
                direction = 0;
                player.setImageIcon(new ImageIcon("Img/player2_tank_up.png"));
                if (!player.checkErea()) {
                    this.explode = new Explode(player.getX(), player.getY());
                    this.setId = DefGame.SEN_EXPLODE;
                    break;
                }

                player.setY(player.getY() - 5);
                break;
            case KeyEvent.VK_DOWN:
                direction = 2;
                player.setImageIcon(new ImageIcon("Img/player2_tank_down.png"));
                if (!player.checkErea()) {
                    this.explode = new Explode(player.getX(), player.getY());
                    this.setId = DefGame.SEN_EXPLODE;
                    break;
                }

                player.setY(player.getY() + 5);
                break;
            case KeyEvent.VK_SPACE:
                break;
        }
        repaint();

    }


    @Override
    public void keyReleased(KeyEvent e) {

    }


}


