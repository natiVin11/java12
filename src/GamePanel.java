import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

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
        background1.setBounds(0, 0, 1500, 900);
        this.add(background1);
        button.addActionListener((e -> {
                this.setId = DefGame.SEN_START;
                button.setVisible(false);
                myText.setVisible(false);
                background1.setVisible(false);
            }));


    setLayout(null);
        this.player =new

    Player(DefGame.ROBOT_X +50, DefGame.ROBOT_Y);

    addKeyListener(this);

    setFocusable(true);

    setFocusTraversalKeysEnabled(false);
        this.

    mainGame();

}
    public void mainGame() {
        new Thread(() -> {
            while (true) {
                repaint();
                try {
                    {
                        for (int i = 0; i < 5; i++) {
                            Enemy.randomMobment(enemies[i]);
                        }
                    }
                    Thread.sleep(100);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }).start();

    }
public void gameOver(){
    this.setId=DefGame.SEN_GAMEOVER;
    JLabel gameOver = new JLabel(new ImageIcon("Img/GameOver.jpeg"));
    gameOver.setBounds(0, 0, 1500, 900);
    JButton yesButton = new JButton("Yes");
    yesButton.setBounds(DefGame.BOYTTON_X-650, DefGame.BOYTTON_Y-200, DefGame.BOYTTON_H-10, DefGame.BOYTTON_W-10);
    JButton noButton = new JButton("No And Exit");
    noButton.setBounds(DefGame.BOYTTON_X-650, DefGame.BOYTTON_Y-50, DefGame.BOYTTON_H-10, DefGame.BOYTTON_W-10);
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
    }));}

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

    public void action(ActionEvent e) {

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
                    gameOver();
                    break;
                }
                if (checkEnemy('L'))
                    player.setX(player.getX() - 5);
                break;
            case KeyEvent.VK_RIGHT:
                player.setImageIcon(new ImageIcon("Img/player2_tank_right.png"));
                if (!map.checkO(player, 'R')){
                    break;}
                if (checkEnemy('R'))
                    player.setX(player.getX() + 5);

                break;
            case KeyEvent.VK_UP:
                player.setImageIcon(new ImageIcon("Img/player2_tank_up.png"));
                if (checkEnemy('U'))
                    player.setY(player.getY() - 5);
                break;
            case KeyEvent.VK_DOWN:
                player.setImageIcon(new ImageIcon("Img/player2_tank_down.png"));
                if (checkEnemy('D'))
                    player.setY(player.getY() + 5);
                break;
        }
        repaint();

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }


}


