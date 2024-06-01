package com.draw;

import javax.swing.*;
import java.awt.*;

public class DrawCircle extends JFrame{
    private MyPanel mp=null;
    public static void main(String[] args) {
        new DrawCircle();
    }
    public DrawCircle(){//构造器
        //初始化面板
        mp =new MyPanel();
        //把面板放入窗口
        this.add(mp);
        //设置窗口的大小
        this.setSize(400,300);
        //点击窗口小叉程序退出
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
//定义一个MyPanel类，继承JPanel类，并重写paintComponent方法，在该方法中绘制一个圆形。
class MyPanel extends JPanel {
    //MyPanel 对象就是一个画板
    //Graphics g 理解为画笔
    @Override
    //当组件第一次在屏幕上显示组件的时候，程序会自动的调用paint方法来会泽组件
    //窗口最小化，再最大化
    //窗口的大小发生变化
    //repaint函数调用
    public void paint(Graphics g){//绘图方法
        super.paint(g);
//        System.out.println("调用paint");
//        g.drawOval(1,1,100,100);
//
//        //绘制不同的图形:
//        //绘制直线：drawLine(int x1,int y1,int x2,int y2);
//        g.drawLine(10,10,100,100);
//        //绘制矩形边框：
//        g.drawRect(10,10,100,100);
//        //绘制椭圆边框：
//        g.drawOval(100,100,100,58);
//        //填充矩形
//        //设置颜色
//        g.setColor(Color.green);
//        g.fillRect(20,20,100,50);
//        //填充椭圆：
//        g.setColor(Color.red);
//        g.fillOval(20,20,200,100);
        //画图片：
        //获取图片资源：
//       Image image= Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/jdk.png"));
//        g.drawImage(image,30,30,732,331,this);

        //画字符串
        g.setColor(Color.red);
        g.setFont(new Font("隶书",Font.BOLD,50));
        g.drawString("北京",100,100);//[100,100]是“北京” 的左下角
    }

}
