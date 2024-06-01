package tankgame02;

import tankgame02.Hero;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

//绘图
public class MyPanel extends JPanel implements KeyListener {
    Hero hero =null;

    Vector<Enemy> enemyTanks =new Vector<>();
    int enemyTankSize=3;
    public MyPanel(){
        hero =new Hero(100,100);//初始化坦克
        hero.setSpeed(4);
        for(int i=0;i<enemyTankSize;i++){
            Enemy enemyTank =new Enemy(100*(i+1),0);
            enemyTank.setDirect(2);
            enemyTanks.add(enemyTank);
        }

    }
    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.fillRect(0,0,1000,750);

        //画自己的坦克
        drawTank(hero.getX(),hero.getY(),g,hero.getDirect(),0);
        //画敌人的坦克
        for(int i=0;i<enemyTanks.size();i++){
            //取出坦克
            Enemy enemyTank =enemyTanks.get(i);
            drawTank(enemyTank.getX(),enemyTank.getY(),g,enemyTank.getDirect(),1);
        }
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
        //根据坦克方向绘制对应的坦克
        switch(direct){
            case 0://向上
                g.fill3DRect(x,y,10,60,true);//坦克左轮子
                g.fill3DRect(x+30,y,10,60,true);//坦克右轮子
                g.fill3DRect(x+10,y+10,20,40,false);
                g.fillOval(x+10,y+20,20,20);//圆形盖子
                g.drawLine(x+20,y,x+20,y+30);//炮筒
                break;
            case 1://right
                g.fill3DRect(x,y,60,10,true);//坦克左轮子
                g.fill3DRect(x,y+30,60,10,true);//坦克右轮子
                g.fill3DRect(x+10,y+10,40,20,false);
                g.fillOval(x+20,y+10,20,20);//圆形盖子
                g.drawLine(x+30,y+20,x+60,y+20);//炮筒
                break;
            case 2://down
                g.fill3DRect(x,y,10,60,true);//坦克左轮子
                g.fill3DRect(x+30,y,10,60,true);//坦克右轮子
                g.fill3DRect(x+10,y+10,20,40,false);
                g.fillOval(x+10,y+20,20,20);//圆形盖子
                g.drawLine(x+20,y+30,x+20,y+60);//炮筒
                break;
            case 3://left
                g.fill3DRect(x,y,60,10,true);//坦克左轮子
                g.fill3DRect(x,y+30,60,10,true);//坦克右轮子
                g.fill3DRect(x+10,y+10,40,20,false);
                g.fillOval(x+20,y+10,20,20);//圆形盖子
                g.drawLine(x+30,y+20,x,y+20);//炮筒
                break;

            default:
                System.out.println("还没画~");
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
//  处理wdsa
    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_W){
            //改变坦克方向
            hero.setDirect(0);
            //修改坐标
            hero.moveUp();
        }else if(e.getKeyCode()==KeyEvent.VK_D){
            hero.setDirect(1);
            hero.moveRight();
        }else if(e.getKeyCode()==KeyEvent.VK_S){
            hero.setDirect(2);
            hero.moveDown();
        }else if(e.getKeyCode()==KeyEvent.VK_A){
            hero.setDirect(3);
            hero.moveLeft();
        }

        //让面板重绘
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
