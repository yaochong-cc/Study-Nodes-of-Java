package tankgame;

import javax.swing.*;
import java.awt.*;

//绘图
public class MyPanel extends JPanel {
    Hero hero =null;
    public MyPanel(){
        hero =new Hero(100,100);//初始化坦克

    }
    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.fillRect(0,0,1000,750);

        //画坦克
        drawTank(hero.getX(),hero.getY(),g,0,0);
        drawTank(hero.getX()+60,hero.getY(),g,0,1);
    }
    //编写方法画坦克

    /**
     *
     * @param x 坦克左上角x坐标
     * @param y 坦克左上角y坐标
     * @param g 画笔
     * @param direct 坦克方向
     * @param type 坦克类型
     */
    public void drawTank(int x ,int y,Graphics g,int direct ,int type){
        switch(type){
            case 0://我们的坦克
                g.setColor(Color.cyan);
                break;
            case 1://敌人的坦克
                g.setColor(Color.yellow);
                break;
        }
        //根据坦克方向绘制坦克
        switch(direct){
            case 0:
                g.fill3DRect(x,y,10,60,true);//坦克左轮子
                g.fill3DRect(x+30,y,10,60,true);//坦克右轮子
                g.fill3DRect(x+10,y+10,20,40,false);
                g.fillOval(x+10,y+20,20,20);//圆形盖子
                g.drawLine(x+20,y,x+20,y+30);//炮筒
                break;

            default:
                System.out.println("还没画~");
        }
    }
}
