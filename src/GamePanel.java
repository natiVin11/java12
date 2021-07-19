import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GamePanel extends JPanel implements ActionListener,KeyListener {
    private int setId;
    private Player player;
    private Assassin[] assassins;
    private Map map;


public GamePanel() {
    assassins=new Assassin[5];
    for(int i=0;i<2;i++)
    {
        assassins[i]=new Assassin(DefGame.assassinX+i , DefGame.assassinY+i*200  );
    }
    JButton button = new JButton("start game!");
    button.setBounds(DefGame.BOYTTON_X, DefGame.BOYTTON_Y, DefGame.BOYTTON_H, DefGame.BOYTTON_W);
    this.add(button);
    JLabel myText = new JLabel();
    myText.setText("Hello!");
    myText.setBounds(30, 180, 260, 70);
    this.add(myText);
  button.addActionListener((e -> {
      if (this.setId == DefGame.SEN_MAIN) {
          this.setId = DefGame.SEN_START;
          button.setVisible(false);
          myText.setVisible(false);
      }else {
          this.setId = DefGame.SEN_MAIN;
      }}));

    this.setLayout(null);
    this.player = new Player(DefGame.ROBOT_X +50,DefGame.ROBOT_Y + 50);
    this.map = new Map();
    addKeyListener(this);
    setFocusable(true);
    setFocusTraversalKeysEnabled(false);
    this.mainGame();
}


public void mainGame(){
    new Thread(() ->{
        while (true){

        repaint();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e){
            e.printStackTrace();
        }}
    }).start();

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
            this.player.paint(g,this);
             this.map.paint(g);
             for(int i=0;i<2;i++) {
                 this.assassins[i].paint(g, this);
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
        int c=e.getKeyCode();
        for (int i=0;i<2;i++) {
            if (c == KeyEvent.VK_LEFT) {
                if((assassins[i].getX()+50== player.getX() && assassins[i].getY()==player.getY())==false)
                    player.setX(player.getX() - 5);
            }
            if (c == KeyEvent.VK_RIGHT) {
                if((assassins[i].getX()-50== player.getX() && assassins[i].getY()==player.getY())==false)
                    player.setX(player.getX() + 5);

            }
            if (c == KeyEvent.VK_UP) {
                if((assassins[i].getX()-50== player.getX() && assassins[i].getY()-50==player.getY())==false)
                    player.setY(player.getY() - 5);
            }
            if (c == KeyEvent.VK_DOWN) {
                if((assassins[i].getX()-50== player.getX() && assassins[i].getY()+50==player.getY())==false)
                    player.setY(player.getY() + 5);
            }

        }
        repaint();

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}


