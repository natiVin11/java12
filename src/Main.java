import javax.swing.*;

public class Main extends JFrame {
    public static void main(String[] args) {
        new Main();
    }
    public Main(){
        this.setVisible(true);
        this.setSize(DefGame.WINDOS_H,DefGame.WINDOS_W);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setTitle("Tanks War");
        this.setLayout(null);
        GamePanel gamePanel = new GamePanel();
        gamePanel.setBounds(0,0,DefGame.WINDOS_H,DefGame.WINDOS_W);
        gamePanel.createImage(50,50);

        gamePanel.setVisible(true);
                add(gamePanel);

    }
}