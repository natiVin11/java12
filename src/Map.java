import javax.swing.*;
import java.awt.*;

public class Map extends JPanel {
    private Assassin[] assassins;
    private Obstacle obstacle;
    private Obstacle obstacle1;
    private Obstacle obstacle2;
    private Obstacle obstacle3;
    private Obstacle obstacle4;
    private Obstacle obstacle5;
    private Obstacle obstacle6;
    private Obstacle obstacle7;
    private Obstacle obstacle8;
    private Obstacle obstacle9;
    private Obstacle obstacle10;
    private Obstacle obstacle11;
    private Obstacle obstacle12;
    private Obstacle obstacle13;
    private Obstacle obstacle14;
    private Obstacle obstacle15;
    private Obstacle obstacle16;
    private Obstacle obstacle17;
    private Obstacle obstacle18;
    private Obstacle obstacle19;
    private Obstacle obstacle20;
    private Obstacle obstacle21;
    private Obstacle obstacle22;
    private Obstacle obstacle23;
    private Obstacle obstacle24;
    private Obstacle obstacle25;
    private Obstacle obstacle26;
    private Obstacle obstacle27;
    private Obstacle obstacle28;
    private Obstacle obstacle29;
    private Obstacle obstacle30;
    private Obstacle obstacle31;
    private Obstacle obstacle32;
    private Obstacle obstacle33;
    private Obstacle obstacle34;
    private Obstacle obstacle35;
    private Obstacle obstacle36;
    private Obstacle obstacle37;
    private Obstacle obstacle38;
    private Obstacle obstacle39;
    private Obstacle obstacle40;
    private Obstacle obstacle41;
    private Obstacle obstacle42;
    private Obstacle obstacle43;
    private Obstacle obstacle44;
    private Obstacle obstacle45;
    private Obstacle obstacle46;
    private Obstacle obstacle47;
    private Obstacle obstacle48;
    private Obstacle obstacle49;
    private Obstacle obstacle50;
    private Obstacle obstacle51;
    private Obstacle obstacle52;
    private Obstacle obstacle53;
    private Obstacle obstacle54;
    private Obstacle obstacle55;
    private Obstacle obstacle56;
    private Obstacle obstacle57;
    private Obstacle obstacle58;
    private Obstacle obstacle59;
    private Obstacle obstacle60;
    private Obstacle obstacle61;
    private Obstacle obstacle62;
    private Obstacle obstacle63;
    private Obstacle obstacle64;
    private Obstacle obstacle65;
    private Obstacle obstacle66;
    private Obstacle obstacle67;
    private Obstacle obstacle68;
    private Obstacle obstacle69;
    private Obstacle obstacle70;
    private Obstacle obstacle71;
    private Obstacle obstacle72;
    private Obstacle obstacle73;
    private Obstacle obstacle74;
    private Obstacle obstacle75;
    private Obstacle obstacle76;
    private Obstacle obstacle77;
    private Obstacle obstacle78;
    private Obstacle obstacle79;
    private Obstacle obstacle80;
    private Obstacle obstacle81;
    private Obstacle obstacle82;
    private Obstacle obstacle83;
    private Obstacle obstacle84;
    private Obstacle obstacle85;
    private Obstacle obstacle86;
    private Obstacle obstacle87;
    private Obstacle obstacle88;
    private Obstacle obstacle89;
    private Obstacle obstacle90;
    private Obstacle obstacle91;
    private Obstacle obstacle92;
    private Obstacle obstacle93;
    private Obstacle obstacle94;
    private Obstacle obstacle95;
    private Obstacle obstacle96;
    private Obstacle obstacle97;
    private Obstacle obstacle98;
    private Obstacle obstacle99;
    private Obstacle obstacle100;
    private Obstacle obstacle101;
    private Obstacle obstacle102;
    private Obstacle obstacle103;
    private Obstacle obstacle104;
    private Obstacle obstacle105;
    private Obstacle obstacle106;
    private Obstacle obstacle107;
    private Obstacle obstacle108;
    private Obstacle obstacle109;
    private Obstacle obstacle110;
    private Obstacle obstacle111;
    private Obstacle obstacle112;
    private Obstacle obstacle113;
    private Obstacle obstacle114;
    private Obstacle obstacle115;
    private Obstacle obstacle116;
    private Obstacle obstacle117;
    private Obstacle obstacle118;
    private Obstacle obstacle119;
    private Obstacle obstacle120;
    private Obstacle obstacle121;
    private Obstacle obstacle122;
    private Obstacle obstacle123;
    private Obstacle obstacle124;
    private Obstacle obstacle125;
    private Obstacle obstacle126;
    private Prize prize1;
    private Prize prize2;
    private Prize prize3;
    private Prize prize4;
    private Prize prize5;
    private Prize prize6;
    private Prize prize7;
    private Prize prize8;
    private Prize prize9;
    private Prize prize10;
    private Prize prize11;

    Map() {
        this.prize1 = new Prize(DefGame.PRIZEX+70,DefGame.PRIZEY+70);
        this.prize2 = new Prize(DefGame.PRIZEX+70,DefGame.PRIZEY+280);
        this.prize3 = new Prize(DefGame.PRIZEX+70,DefGame.PRIZEY+160);
        this.prize4 = new Prize(DefGame.PRIZEX-50,DefGame.PRIZEY+160);
        this.prize5 = new Prize(DefGame.PRIZEX-150,DefGame.PRIZEY+160);
        this.prize6 = new Prize(DefGame.PRIZEX-290,DefGame.PRIZEY+160);
        this.prize7 = new Prize(DefGame.PRIZEX-340,DefGame.PRIZEY+160);
        this.prize8 = new Prize(DefGame.PRIZEX-430,DefGame.PRIZEY+160);
        this.prize8 = new Prize(DefGame.PRIZEX-430,DefGame.PRIZEY+160);
        this.prize9 = new Prize(DefGame.PRIZEX - 70,DefGame.PRIZEY + 450);
        this.prize10 = new Prize(DefGame.PRIZEX ,DefGame.PRIZEY + 450);
        this.prize11 = new Prize(DefGame.PRIZEX + 70,DefGame.PRIZEY + 600);
        this.obstacle123 = new Obstacle(0,0);
        this.obstacle124 = new Obstacle(50,0);
        this.obstacle125 = new Obstacle(0,200);
        this.obstacle50 = new Obstacle(DefGame.obstacle_X + 250 , DefGame.ROBOT_Y+50);
        this.obstacle49 = new Obstacle(DefGame.obstacle_X + 200 , DefGame.ROBOT_Y+50);
        this.obstacle48 = new Obstacle(DefGame.obstacle_X + 150 , DefGame.ROBOT_Y+50);
        this.obstacle47 = new Obstacle(DefGame.obstacle_X + 100 , DefGame.ROBOT_Y+50);
        this.obstacle46 = new Obstacle(DefGame.obstacle_X + 350 , DefGame.ROBOT_Y+50);
        this.obstacle45 = new Obstacle(DefGame.obstacle_X + 350 , DefGame.ROBOT_Y);
        this.obstacle44 = new Obstacle(DefGame.obstacle_X - 300 , DefGame.ROBOT_Y);
        this.obstacle43 = new Obstacle(DefGame.obstacle_X - 250 , DefGame.ROBOT_Y);
        this.obstacle42 = new Obstacle(DefGame.obstacle_X - 200 , DefGame.ROBOT_Y);
        this.obstacle41 = new Obstacle(DefGame.obstacle_X - 150 , DefGame.ROBOT_Y);
        this.obstacle40 = new Obstacle(DefGame.obstacle_X - 100 , DefGame.ROBOT_Y);
        this.obstacle39  = new Obstacle(DefGame.obstacle_X - 50 , DefGame.ROBOT_Y);
        this.obstacle38 = new Obstacle(DefGame.obstacle_X , DefGame.ROBOT_Y);
        this.obstacle = new Obstacle(DefGame.obstacle_X+50,DefGame.obstacle_Y+50);
        this.obstacle1 = new Obstacle(DefGame.obstacle_X + 50,DefGame.obstacle_Y );
        this.obstacle2 = new Obstacle(DefGame.obstacle_X + 100,DefGame.obstacle_Y);
        this.obstacle3 = new Obstacle(DefGame.obstacle_X + 150,DefGame.obstacle_Y);
        this.obstacle4 = new Obstacle(DefGame.obstacle_X + 200,DefGame.obstacle_Y);
        this.obstacle5 = new Obstacle(DefGame.obstacle_X + 250,DefGame.obstacle_Y);
        this.obstacle6 = new Obstacle(DefGame.obstacle_X + 300,DefGame.obstacle_Y);
        this.obstacle7  = new Obstacle(DefGame.obstacle_X + 350,DefGame.obstacle_Y );
        this.obstacle8 = new Obstacle(DefGame.obstacle_X + 350,DefGame.obstacle_Y-50);
        this.obstacle9 = new Obstacle(DefGame.obstacle_X + 350,DefGame.obstacle_Y-100);
        this.obstacle10 = new Obstacle(DefGame.obstacle_X + 350,DefGame.obstacle_Y-150);
        this.obstacle11 = new Obstacle(DefGame.obstacle_X + 350,DefGame.obstacle_Y-200);
        this.obstacle12 = new Obstacle(DefGame.obstacle_X + 350,DefGame.obstacle_Y-250);
        this.obstacle13 = new Obstacle(DefGame.obstacle_X + 350,DefGame.obstacle_Y-300);
        this.obstacle14 = new Obstacle(DefGame.obstacle_X + 300,DefGame.obstacle_Y-300);
        this.obstacle15 = new Obstacle(DefGame.obstacle_X + 250,DefGame.obstacle_Y-300);
        this.obstacle16 = new Obstacle(DefGame.obstacle_X + 200,DefGame.obstacle_Y-300);
        this.obstacle17 = new Obstacle(DefGame.obstacle_X + 150,DefGame.obstacle_Y-300);
        this.obstacle18 = new Obstacle(DefGame.obstacle_X + 100,DefGame.obstacle_Y-300);
        this.obstacle19 = new Obstacle(DefGame.obstacle_X + 50,DefGame.obstacle_Y-300);
        this.obstacle20 = new Obstacle(DefGame.obstacle_X ,DefGame.obstacle_Y-300);
        this.obstacle21 = new Obstacle(DefGame.obstacle_X - 50,DefGame.obstacle_Y-300);
        this.obstacle22 = new Obstacle(DefGame.obstacle_X - 100,DefGame.obstacle_Y-300);
        this.obstacle23 = new Obstacle(DefGame.obstacle_X - 150,DefGame.obstacle_Y-300);
        this.obstacle24 = new Obstacle(DefGame.obstacle_X - 200,DefGame.obstacle_Y-300);
        this.obstacle25 = new Obstacle(DefGame.obstacle_X - 250,DefGame.obstacle_Y-300);
        this.obstacle26 = new Obstacle(DefGame.obstacle_X - 300,DefGame.obstacle_Y-300);
        this.obstacle27 = new Obstacle(DefGame.obstacle_X - 150,DefGame.obstacle_Y-250);
        this.obstacle28 = new Obstacle(DefGame.obstacle_X - 150,DefGame.obstacle_Y-200);
        this.obstacle29 = new Obstacle(DefGame.obstacle_X - 100,DefGame.obstacle_Y-200);
        this.obstacle30 = new Obstacle(DefGame.obstacle_X - 100,DefGame.obstacle_Y-150);
        this.obstacle31 = new Obstacle(DefGame.obstacle_X - 50,DefGame.obstacle_Y-150);
        this.obstacle32 = new Obstacle(DefGame.obstacle_X ,DefGame.obstacle_Y-150);
        this.obstacle33 = new Obstacle(DefGame.obstacle_X+50 ,DefGame.obstacle_Y-150);
        this.obstacle34 = new Obstacle(DefGame.obstacle_X+100 ,DefGame.obstacle_Y-150);
        this.obstacle35 = new Obstacle(DefGame.obstacle_X+150 ,DefGame.obstacle_Y-150);
        this.obstacle36 = new Obstacle(DefGame.obstacle_X+200 ,DefGame.obstacle_Y-150);
        this.obstacle37 = new Obstacle(DefGame.obstacle_X+250 ,DefGame.obstacle_Y-150);
        this.obstacle51 = new Obstacle(DefGame.obstacle_X+250 ,DefGame.obstacle_Y-250);
        this.obstacle52 = new Obstacle(DefGame.obstacle_X,DefGame.obstacle_Y-250);
        this.obstacle53 = new Obstacle(DefGame.obstacle_X,DefGame.obstacle_Y+50);
        this.obstacle54 = new Obstacle(DefGame.obstacle_X-50,DefGame.obstacle_Y+50);
        this.obstacle55 = new Obstacle(DefGame.obstacle_X-100,DefGame.obstacle_Y+50);
        this.obstacle56 = new Obstacle(DefGame.obstacle_X-100,DefGame.obstacle_Y+100);
        this.obstacle57 = new Obstacle(DefGame.obstacle_X-100,DefGame.obstacle_Y+150);
        this.obstacle58 = new Obstacle(DefGame.obstacle_X-50,DefGame.obstacle_Y+150);
        this.obstacle59 = new Obstacle(DefGame.obstacle_X,DefGame.obstacle_Y+150);
        this.obstacle60 = new Obstacle(DefGame.obstacle_X,DefGame.obstacle_Y+200);
        this.obstacle61 = new Obstacle(DefGame.obstacle_X,DefGame.obstacle_Y+250);
        this.obstacle62 = new Obstacle(DefGame.obstacle_X+50,DefGame.obstacle_Y+250);
        this.obstacle63 = new Obstacle(DefGame.obstacle_X+100,DefGame.obstacle_Y+250);
        this.obstacle64 = new Obstacle(DefGame.obstacle_X+150,DefGame.obstacle_Y+250);
        this.obstacle65 = new Obstacle(DefGame.ROBOT_X,DefGame.obstacle_Y);
        this.obstacle66 = new Obstacle(DefGame.ROBOT_X,DefGame.obstacle_Y-150);
        this.obstacle67 = new Obstacle(DefGame.ROBOT_X,DefGame.obstacle_Y-100);
        this.obstacle68 = new Obstacle(DefGame.ROBOT_X,DefGame.obstacle_Y-50);
        this.obstacle69 = new Obstacle(DefGame.ROBOT_X,DefGame.obstacle_Y-350);
        this.obstacle70 = new Obstacle(DefGame.ROBOT_X+100,DefGame.obstacle_Y-300);
        this.obstacle71 = new Obstacle(DefGame.ROBOT_X+100,DefGame.obstacle_Y-250);
        this.obstacle72 = new Obstacle(DefGame.ROBOT_X+100,DefGame.obstacle_Y-200);
        this.obstacle73 = new Obstacle(DefGame.ROBOT_X,DefGame.obstacle_Y);
        this.obstacle74 = new Obstacle(DefGame.ROBOT_X,DefGame.obstacle_Y+50);
        this.obstacle75 = new Obstacle(DefGame.ROBOT_X,DefGame.obstacle_Y+100);
        this.obstacle76 = new Obstacle(DefGame.ROBOT_X,DefGame.obstacle_Y+150);
        this.obstacle77 = new Obstacle(DefGame.obstacle_X+350,DefGame.obstacle_Y+50);
        this.obstacle78 = new Obstacle(DefGame.obstacle_X+350,DefGame.obstacle_Y+100);
        this.obstacle79 = new Obstacle(DefGame.obstacle_X+350,DefGame.obstacle_Y+150);
        this.obstacle80 = new Obstacle(DefGame.obstacle_X+350,DefGame.obstacle_Y+200);
        this.obstacle81 = new Obstacle(DefGame.obstacle_X+350,DefGame.obstacle_Y+250);
        this.obstacle82 = new Obstacle(DefGame.obstacle_X+300,DefGame.obstacle_Y+150);
        this.obstacle83 = new Obstacle(DefGame.obstacle_X+250,DefGame.obstacle_Y+150);
        this.obstacle84 = new Obstacle(DefGame.obstacle_X+200,DefGame.obstacle_Y+150);
        this.obstacle85 = new Obstacle(DefGame.obstacle_X+150,DefGame.obstacle_Y+150);
        this.obstacle86 = new Obstacle(DefGame.obstacle_X+350,DefGame.obstacle_Y+300);
        this.obstacle87 = new Obstacle(DefGame.obstacle_X+350,DefGame.obstacle_Y+350);
        this.obstacle88 = new Obstacle(DefGame.obstacle_X+300,DefGame.obstacle_Y+350);
        this.obstacle89 = new Obstacle(DefGame.obstacle_X+250,DefGame.obstacle_Y+350);
        this.obstacle90 = new Obstacle(DefGame.obstacle_X+200,DefGame.obstacle_Y+350);
        this.obstacle91 = new Obstacle(DefGame.obstacle_X+150,DefGame.obstacle_Y+350);
        this.obstacle92 = new Obstacle(DefGame.obstacle_X+100,DefGame.obstacle_Y+350);
        this.obstacle93 = new Obstacle(DefGame.obstacle_X+50,DefGame.obstacle_Y+350);
        this.obstacle94 = new Obstacle(DefGame.obstacle_X,DefGame.obstacle_Y+350);
        this.obstacle95 = new Obstacle(DefGame.obstacle_X-50,DefGame.obstacle_Y+350);
        this.obstacle96 = new Obstacle(DefGame.obstacle_X-100,DefGame.obstacle_Y+350);
        this.obstacle97 = new Obstacle(DefGame.obstacle_X-150,DefGame.obstacle_Y+350);
        this.obstacle98 = new Obstacle(DefGame.obstacle_X-200,DefGame.obstacle_Y+350);
        this.obstacle99 = new Obstacle(DefGame.obstacle_X-250,DefGame.obstacle_Y+350);
        this.obstacle100 = new Obstacle(DefGame.obstacle_X-300,DefGame.obstacle_Y+350);
        this.obstacle100 = new Obstacle(DefGame.obstacle_X-300,DefGame.obstacle_Y+350);
        this.obstacle101 = new Obstacle(DefGame.obstacle_X-350,DefGame.obstacle_Y+350);
        this.obstacle102 = new Obstacle(DefGame.obstacle_X-400,DefGame.obstacle_Y+350);
        this.obstacle103 = new Obstacle(DefGame.obstacle_X-400,DefGame.obstacle_Y+300);
        this.obstacle104 = new Obstacle(DefGame.obstacle_X-400,DefGame.obstacle_Y+250);
        this.obstacle105 = new Obstacle(DefGame.obstacle_X-400,DefGame.obstacle_Y-250);
        this.obstacle106 = new Obstacle(DefGame.obstacle_X-400,DefGame.obstacle_Y-300);
        this.obstacle107 = new Obstacle(DefGame.obstacle_X-400,DefGame.obstacle_Y-350);
        this.obstacle108 = new Obstacle(DefGame.obstacle_X-300,DefGame.obstacle_Y+300);
        this.obstacle109 = new Obstacle(DefGame.obstacle_X-250,DefGame.obstacle_Y+250);
        this.obstacle110 = new Obstacle(DefGame.obstacle_X-200,DefGame.obstacle_Y+250);
        this.obstacle111 = new Obstacle(DefGame.obstacle_X-300,DefGame.obstacle_Y+250);
        this.obstacle112 = new Obstacle(DefGame.obstacle_X-150,DefGame.obstacle_Y+250);
        this.obstacle113 = new Obstacle(DefGame.obstacle_X-200,DefGame.obstacle_Y+200);
        this.obstacle114 = new Obstacle(DefGame.obstacle_X-150,DefGame.obstacle_Y+50);
        this.obstacle115 = new Obstacle(DefGame.obstacle_X-150,DefGame.obstacle_Y);
        this.obstacle116 = new Obstacle(DefGame.obstacle_X-150,DefGame.obstacle_Y-50);
        this.obstacle117 = new Obstacle(DefGame.obstacle_X-200,DefGame.obstacle_Y-50);
        this.obstacle118 = new Obstacle(DefGame.obstacle_X-250,DefGame.obstacle_Y-50);
        this.obstacle119 = new Obstacle(DefGame.obstacle_X-300,DefGame.obstacle_Y-50);
        this.obstacle120 = new Obstacle(DefGame.obstacle_X-300,DefGame.obstacle_Y-100);
        this.obstacle121 = new Obstacle(DefGame.obstacle_X-250,DefGame.obstacle_Y-200);
        this.obstacle122 = new Obstacle(DefGame.obstacle_X+250,DefGame.obstacle_Y-100);
        this.mapGame();

    }
public void Assasian(){
        for(int i=0;i<10;i++)
        {
            int y=0;
            assassins[i] =new Assassin(10+y,50+y);
            y=+100;
        }
}
    public void mapGame() {
        new Thread(() -> {
            while (true) {
                repaint();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    public void paint(Graphics g) {
        this.prize1.paint(g,this);
        this.prize2.paint(g,this);
        this.prize3.paint(g,this);
        this.prize4.paint(g,this);
        this.prize5.paint(g,this);
        this.prize6.paint(g,this);
        this.prize7.paint(g,this);
        this.prize8.paint(g,this);
       this.prize9.paint(g,this);
        this.prize10.paint(g,this);
        this.prize11.paint(g,this);
        this.obstacle.paint(g,this);
        this.obstacle1.paint(g,this);
        this.obstacle2.paint(g,this);
        this.obstacle3.paint(g,this);
        this.obstacle4.paint(g,this);
        this.obstacle5.paint(g,this);
        this.obstacle6.paint(g,this);
        this.obstacle7.paint(g,this);
        this.obstacle8.paint(g,this);
        this.obstacle9.paint(g,this);
        this.obstacle10.paint(g,this);
        this.obstacle11.paint(g,this);
        this.obstacle12.paint(g,this);
        this.obstacle13.paint(g,this);
        this.obstacle14.paint(g,this);
        this.obstacle15.paint(g,this);
        this.obstacle16.paint(g,this);
        this.obstacle17.paint(g,this);
        this.obstacle18.paint(g,this);
        this.obstacle19.paint(g,this);
        this.obstacle20.paint(g,this);
        this.obstacle21.paint(g,this);
        this.obstacle22.paint(g,this);
        this.obstacle23.paint(g,this);
        this.obstacle24.paint(g,this);
        this.obstacle25.paint(g,this);
        this.obstacle26.paint(g,this);
        this.obstacle27.paint(g,this);
        this.obstacle28.paint(g,this);
        this.obstacle29.paint(g,this);
        this.obstacle30.paint(g,this);
        this.obstacle31.paint(g,this);
        this.obstacle32.paint(g,this);
        this.obstacle33.paint(g,this);
        this.obstacle34.paint(g,this);
        this.obstacle35.paint(g,this);
        this.obstacle36.paint(g,this);
        this.obstacle37.paint(g,this);
        this.obstacle38.paint(g,this);
        this.obstacle39.paint(g,this);
        this.obstacle40.paint(g,this);
        this.obstacle41.paint(g,this);
        this.obstacle42.paint(g,this);
        this.obstacle43.paint(g,this);
        this.obstacle44.paint(g,this);
        this.obstacle45.paint(g,this);
        this.obstacle46.paint(g,this);
        this.obstacle47.paint(g,this);
        this.obstacle48.paint(g,this);
        this.obstacle49.paint(g,this);
        this.obstacle50.paint(g,this);
        this.obstacle51.paint(g,this);
        this.obstacle52.paint(g,this);
        this.obstacle53.paint(g,this);
        this.obstacle54.paint(g,this);
        this.obstacle55.paint(g,this);
        this.obstacle56.paint(g,this);
        this.obstacle57.paint(g,this);
        this.obstacle58.paint(g,this);
        this.obstacle59.paint(g,this);
        this.obstacle60.paint(g,this);
        this.obstacle61.paint(g,this);
        this.obstacle62.paint(g,this);
        this.obstacle63.paint(g,this);
        this.obstacle64.paint(g,this);
        this.obstacle65.paint(g,this);
        this.obstacle66.paint(g,this);
        this.obstacle67.paint(g,this);
        this.obstacle68.paint(g,this);
        this.obstacle69.paint(g,this);
        this.obstacle70.paint(g,this);
        this.obstacle71.paint(g,this);
        this.obstacle72.paint(g,this);
        this.obstacle73.paint(g,this);
        this.obstacle74.paint(g,this);
        this.obstacle75.paint(g,this);
        this.obstacle76.paint(g,this);
        this.obstacle77.paint(g,this);
        this.obstacle78.paint(g,this);
        this.obstacle79.paint(g,this);
        this.obstacle80.paint(g,this);
        this.obstacle81.paint(g,this);
        this.obstacle82.paint(g,this);
        this.obstacle83.paint(g,this);
        this.obstacle84.paint(g,this);
        this.obstacle85.paint(g,this);
        this.obstacle86.paint(g,this);
        this.obstacle87.paint(g,this);
        this.obstacle88.paint(g,this);
        this.obstacle89.paint(g,this);
        this.obstacle90.paint(g,this);
        this.obstacle91.paint(g,this);
        this.obstacle92.paint(g,this);
        this.obstacle93.paint(g,this);
        this.obstacle94.paint(g,this);
        this.obstacle95.paint(g,this);
        this.obstacle96.paint(g,this);
        this.obstacle97.paint(g,this);
        this.obstacle98.paint(g,this);
        this.obstacle99.paint(g,this);
        this.obstacle100.paint(g,this);
        this.obstacle101.paint(g,this);
        this.obstacle102.paint(g,this);
        this.obstacle103.paint(g,this);
        this.obstacle104.paint(g,this);
        this.obstacle105.paint(g,this);
        this.obstacle106.paint(g,this);
        this.obstacle107.paint(g,this);
        this.obstacle108.paint(g,this);
        this.obstacle109.paint(g,this);
        this.obstacle110.paint(g,this);
        this.obstacle111.paint(g,this);
        this.obstacle112.paint(g,this);
        this.obstacle113.paint(g,this);
        this.obstacle114.paint(g,this);
        this.obstacle115.paint(g,this);
      this.obstacle116.paint(g,this);
        this.obstacle117.paint(g,this);
        this.obstacle118.paint(g,this);
        this.obstacle119.paint(g,this);
        this.obstacle120.paint(g,this);
        this.obstacle121.paint(g,this);
        this.obstacle122.paint(g,this);
        this.obstacle123.paint(g,this);
        this.obstacle124.paint(g,this);
        this.obstacle125.paint(g,this);

    }

}
