package event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class BallMove extends JFrame{
    MyPanel mp=new MyPanel();
    public static void main(String[] args) {
        BallMove ballMove =new BallMove();
    }
    public BallMove(){
        mp=new MyPanel();
        this.add(mp);
        this.setSize(400,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
//面板，可以画出小球
//KeyListener 是监听器。
class MyPanel extends JPanel implements KeyListener {
    @Override
    public void paint (Graphics g){
        super.paint(g);
        g.fillOval(0,10,20,20);
    }
    //有字符输入，该方法触发
    @Override
    public void keyTyped(KeyEvent e){

    }
    //当某个键按下时触发
    @Override
    public void keyPressed(KeyEvent e){
        System.out.println((char)e.getKeyCode()+"被按下");

    }
    //当某个键松开时触发
    @Override
    public void keyReleased(KeyEvent e){

    }
}