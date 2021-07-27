import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
    private int setId;
    private Player player;
    private Enemy[] enemies;
    private Map map;
    private Shot[] shot;
    private Explode explode;
    private Object ArrayList;

    public GamePanel() {
        enemies = new Enemy[5];
        shot = new Shot[5];
        for (int i = 0; i < 5; i++) {
            enemies[i] = new Enemy(DefGame.assassinX, DefGame.assassinY);
            DefGame.assassinY = DefGame.assassinY + 100;
            shot[i] = new Shot(enemies[i].getX() - 5, enemies[i].getY() + 15);
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
                Player(DefGame.ROBOT_X + 60, DefGame.ROBOT_Y + 60);
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        this.mainGame();

    }
    private boolean check(int i, int y){
        if(shot[i].getX()==0)
            return false;
        return true;
    }
    public void mainGame() {
        new Thread(() -> {
            while (true) {

                repaint();
                for (int i = 0; i < 4; i++) {
                    if (enemies[i].getX() + i == player.getX() && enemies[i].getY() + i == player.getY())
                        gameOver();

                    if (enemies[i].getX() <= DefGame.LOW_X) {
                        enemies[i].direction();
                    } else if (enemies[i].getX() >= DefGame.WINDOS_H)
                        enemies[i].direction();
                }
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
        yesButton.setBounds(DefGame.BOYTTON_X - 650, DefGame.BOYTTON_Y - 200, DefGame.BOYTTON_H - 10, DefGame.BOYTTON_W - 10);
        JButton noButton = new JButton("No And Exit");
        noButton.setBounds(DefGame.BOYTTON_X - 650, DefGame.BOYTTON_Y - 50, DefGame.BOYTTON_H - 10, DefGame.BOYTTON_W - 10);
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
            player.setX(DefGame.ROBOT_X + 60);
            player.setY(DefGame.ROBOT_Y + 60);

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
                        this.explode = new Explode(player.getX(), player.getY(), player);
                        this.setId = DefGame.SEN_EXPLODE;
                        return false;
                    }
                    break;
                case 'R':
                    if (enemies[i].getX() == player.getX() + DefGame.ENEMY_W && enemies[i].getY() == player.getY()) {
                        this.explode = new Explode(player.getX() + 15, player.getY() + 15, player);
                        this.setId = DefGame.SEN_EXPLODE;
                        return false;
                    }
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
                while (true){
                    for (int i = 0; i < 5; i++) {
                        shot[i].paint(g, this);
                    }
                                        for (int z = 0; z < 5; z++) {
                        enemies[z].paint((Graphics2D) g, this);
                    }
                break;}
            case DefGame.SEN_GAMEOVER:
                this.setBackground(Color.BLACK);
                break;
            case DefGame.SEN_EXPLODE:
                this.explode.draw(g, this);
                this.setBackground(Color.BLACK);
                this.map.paint(g);
                for (int i = 0; i < 5; i++) {
                    this.enemies[i].paint((Graphics2D) g, this);
                }
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
                player.setImageIcon(new ImageIcon("Img/player2_tank_left.png"));
                if (!player.checkErea()) {
                    this.explode = new Explode(player.getX(), player.getY(), player);
                    this.setId = DefGame.SEN_EXPLODE;
                    break;
                }
                if (player.catchPrice(map.prize1.getX(), map.prize1.getY())) {
                    map.locatePrice();
                }
                if (!checkEnemy('L')) {
//                    gameOver();
                    break;
                } else
                    player.setX(player.getX() - 5);
                break;
            case KeyEvent.VK_RIGHT:
                player.setImageIcon(new ImageIcon("Img/player2_tank_right.png"));
                if (!player.checkErea()) {
//                    gameOver();
                    break;
                }
                int q = 10;

                if (player.catchPrice(map.prize1.getX(), map.prize1.getY())) {
                    map.locatePrice();

                }

                if (!checkEnemy('R')) {
//                    gameOver();
                    break;
                }
                player.setX(player.getX() + 5);
                break;
            case KeyEvent.VK_UP:
                player.setImageIcon(new ImageIcon("Img/player2_tank_up.png"));
                if (!player.checkErea()) {
                    gameOver();
                    break;
                }
                if (player.catchPrice(map.prize1.getX(), map.prize1.getY())) {
                    map.locatePrice();
                }
                if (!checkEnemy('U')) {
//                    gameOver();
                    break;
                } else
                    player.setY(player.getY() - 5);
                break;
            case KeyEvent.VK_DOWN:
                player.setImageIcon(new ImageIcon("Img/player2_tank_down.png"));
                if (!player.checkErea()) {
                    gameOver();
                    break;
                }
                if (player.catchPrice(map.prize1.getX(), map.prize1.getY())) {
                    map.locatePrice();
                }
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


