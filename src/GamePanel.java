import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.concurrent.atomic.AtomicInteger;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
    private int setId;
    private Player player;
    private Enemy[] enemies;
    private Map map;

    public GamePanel() {
        enemies = new Enemy[5];
        for (int i = 0; i < 5; i++) {
            enemies[i] = new Enemy(DefGame.assassinX, DefGame.assassinY);
            DefGame.assassinY = DefGame.assassinY + 200;
        }
        map = new Map();
        JButton button = new JButton("start game!");
        button.setBounds(DefGame.BOYTTON_X, DefGame.BOYTTON_Y, DefGame.BOYTTON_H, DefGame.BOYTTON_W);
        this.add(button);
        JLabel myText = new JLabel();
        myText.setText("Created BY Dario Hajduk & Nati Winter");
        myText.setBackground(Color.red);
        myText.setBounds(1250, 650, 500, 150);
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

                Player(DefGame.ROBOT_X + 50, DefGame.ROBOT_Y);

        addKeyListener(this);

        setFocusable(true);

        setFocusTraversalKeysEnabled(false);
        this.

                mainGame();

    }

    public void mainGame() {
        AtomicInteger velX = new AtomicInteger(10);
        AtomicInteger velY = new AtomicInteger(10);
        new Thread(() -> {
            while (true) {
                repaint();
                try {
                    for(int i=0;i<50;i++)
                    if (enemies[1].getX() +i== player.getX() && enemies[1].getY()+i == player.getY())
                        gameOver();
                    if (enemies[1].getY() == 500) {
                        velY.set((-1) * velY.get());
                    }
                    if (enemies[1].getY() == 250)
                        velY.set((-1) * velY.get());
                    enemies[1].setY(enemies[1].getY() + velY.get());

                    if (enemies[1].getX() == 1400) {
                        velX.set((-1) * velX.get());
                    }
                    if (enemies[1].getX() == 150)
                        velX.set((-1) * velX.get());
                    enemies[1].setX(enemies[1].getX() - velX.get());
                    Thread.sleep(100);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }).start();

    }

    public void gameOver() {
        this.setId = DefGame.SEN_GAMEOVER;
        JLabel gameOver = new JLabel(new ImageIcon("Img/GameOver.jpeg"));
        gameOver.setBounds(0, 0, DefGame.WINDOS_H, DefGame.WINDOS_W);
        JButton yesButton = new JButton("Yes");
        yesButton.setBounds(DefGame.BOYTTON_X - 650, DefGame.BOYTTON_Y - 200, DefGame.BOYTTON_H - 10, DefGame.BOYTTON_W - 10);
        JButton noButton = new JButton("No And Exit");
        noButton.setBounds(DefGame.BOYTTON_X - 650, DefGame.BOYTTON_Y - 50, DefGame.BOYTTON_H - 10, DefGame.BOYTTON_W - 10);
        this.add(noButton);
        this.add(yesButton);
        this.add(gameOver);
        noButton.setVisible(true);
        yesButton.setVisible(true);
        gameOver.setVisible(true);
        yesButton.addActionListener((e -> {
            this.setId = DefGame.SEN_START;
            noButton.setVisible(false);
            yesButton.setVisible(false);
            gameOver.setVisible(false);
        }));
        noButton.addActionListener((e -> {
            System.exit(0);
        }));
    }

    public boolean checkEnemy(char d) {
        for (int i = 0; i < enemies.length; i++) {
            switch (d) {
                case 'L':
                    if (enemies[i].getX() == player.getX() - DefGame.ENEMY_W && enemies[i].getY() == player.getY()
                    ) {
                        return false;
                    }
                    break;
                case 'R':
                    if (enemies[i].getX() == player.getX() + DefGame.ENEMY_W && enemies[i].getY() == player.getY())
                        return false;
                    break;

                case 'U':

                    if (enemies[i].getX() == player.getX() && enemies[i].getY() + DefGame.ENEMY_H == player.getY())
                        return false;
                    break;
                case 'D':
                    if (enemies[i].getX() == player.getX() && enemies[i].getY() - DefGame.ENEMY_H == player.getY())
                        return false;
                    break;
            }
        }
        return true;
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
                for (int i = 0; i < 5; i++) {
                    this.enemies[i].paint(g, this);
                }
                break;
            case DefGame.SEN_GAMEOVER:
                this.setBackground(Color.BLACK);
                break;
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override

    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT:
                player.setImageIcon(new ImageIcon("Img/player2_tank_left.png"));
                if (!map.checkO(player, 'L')) {
                    break;
                }
                if (!checkEnemy('L')) {
                    gameOver();
                    break;
                } else
                    player.setX(player.getX() - 5);
                break;
            case KeyEvent.VK_RIGHT:
                player.setImageIcon(new ImageIcon("Img/player2_tank_right.png"));
                if (!map.checkO(player, 'R')) {
                    gameOver();
                    break;
                }
                map.locatePrice(player.getY(), player.getX());

                if (!checkEnemy('R')) {
                    gameOver();
                    break;
                }
                player.setX(player.getX() + 5);
                break;
            case KeyEvent.VK_UP:
                player.setImageIcon(new ImageIcon("Img/player2_tank_up.png"));
                if (!checkEnemy('U')) {
                    gameOver();
                    break;
                } else
                    player.setY(player.getY() - 5);
                break;
            case KeyEvent.VK_DOWN:
                player.setImageIcon(new ImageIcon("Img/player2_tank_down.png"));
                if (!checkEnemy('D')) {
                    gameOver();
                    break;
                }
                player.setY(player.getY() + 5);
                break;
        }
        repaint();

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }


}


