package leiting;

import javax.swing.*;
import java.awt.*;

public class HeroPlane {
    int x=400,y=580;
    int width=100;int height=50;

    Image img =new ImageIcon("E:\\桌面\\ZuoJava\\Game\\src\\img\\zdj1.jpg").getImage();

    public HeroPlane() {
    }

    public HeroPlane(int x, int y, int width, int height) {
        this.x = x;
        this.y=y;
        this.width=width;
        this.height=height;

    }
}
