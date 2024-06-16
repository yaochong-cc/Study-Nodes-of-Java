package leiting;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class GameFrame extends JFrame {
    HeroPlane heroPlane;
    public GameFrame()
    {
        //创建HeroPlane
       heroPlane=new HeroPlane();

        //设置窗口
        this.setSize(500,700);
        this.setTitle("雷霆战机");
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//点叉叉关闭窗口
        this.setVisible(true);//窗口可视化

        //线程!!!
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    repaint();
                    try{
                        Thread.sleep(10);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }

        }).start();
    }
    public void paint(Graphics g){

        //背景
        BufferedImage image=(BufferedImage) this.createImage(this.getSize().width,this.getSize().height);
        //高效缓存的画笔
        Graphics bi=image.getGraphics();

        bi.drawImage(new ImageIcon("E:\\桌面\\ZuoJava\\Game\\src\\img\\background.jpg").getImage(),0,0,null);
        bi.drawImage(heroPlane.img,heroPlane.x,heroPlane.y,heroPlane.width,heroPlane.height,null);

        //生效
        g.drawImage(image,0,0,null);
    }

    public static void main(String[] args) {
        GameFrame frame=new GameFrame();
    }
}
