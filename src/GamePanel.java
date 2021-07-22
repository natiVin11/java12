import java.awt.Dimension;
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
        for (int i = 0; i < enemies.length; i++) {
            enemies[i] = new Enemy(DefGame.assassinX, DefGame.assassinY);
            DefGame.assassinY = DefGame.assassinY + 200;
        }
        map = new Map();
        JButton button = new JButton("start game!");
        button.setBounds(DefGame.BOYTTON_X, DefGame.BOYTTON_Y, DefGame.BOYTTON_H, DefGame.BOYTTON_W);
        this.add(button);
        JLabel myText = new JLabel();
        myText.setText("Tank's");
        myText.setBounds(200, 180, 260, 150);
        this.add(myText);
        button.addActionListener((e -> {
            if (this.setId == DefGame.SEN_MAIN) {
                this.setId = DefGame.SEN_START;
                button.setVisible(false);
                myText.setVisible(false);
            } else {
                this.setId = DefGame.SEN_MAIN;
            }
        }));

        this.setLayout(null);
        this.player = new Player(DefGame.ROBOT_X + 50, DefGame.ROBOT_Y);
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        this.mainGame();
    }


    public void mainGame() {
        new Thread(() -> {
            while (true) {

                repaint();
                try {
                    for (int i = 0, flag = 1; i < enemies.length; i++) {
                        if (i % 2 != 0 && (this.enemies[i].getX() != 800))
                            enemies[i].setX(this.enemies[i].getX() + 5);
                            else if(i % 2 == 0 && (this.enemies[i].getX() != 50))
                                enemies[i].setX(this.enemies[i].getX() - 5);
                        else if (i % 2 != 0 && (this.enemies[i].getX() == 50))
                            enemies[i].setX(this.enemies[i].getX() + 5);
                        else if (i % 2 == 0 && (this.enemies[i].getX() == 800))
                                enemies[i].setX(this.enemies[i].getX() - 5);
                    }
                    Thread.sleep(100);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }).start();

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
                this.setBackground(Color.RED);
                break;
            case DefGame.SEN_START:
                this.setBackground(Color.BLACK);
                this.player.paint(g, this);
                this.map.paint(g);
                for (int i = 0; i < 2; i++) {
                    this.enemies[i].paint(g, this);
                }
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
                if (!map.checkO(player, 'L'))
                    break;
                if (checkEnemy('L'))
                    player.setX(player.getX() - 5);
                break;
            case KeyEvent.VK_RIGHT:
                player.setImageIcon(new ImageIcon("Img/player2_tank_right.png"));
                if (!map.checkO(player, 'R'))
                    break;
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


