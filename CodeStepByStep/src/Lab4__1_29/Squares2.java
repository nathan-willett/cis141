package Lab4__1_29;

/*
 * Modify your Squares program from the previous exercise into a new class Squares2 that draws the following 
 * figures. (Go back to that problem and copy/paste your code here as a starting point.)
 * 
 * The drawing panel is now 400 by 300 pixels in size. The first figure is at the same position, (50,50). 
 * The other figures are at positions (250, 10) and (180, 115), respectively. Use one or more parameterized 
 * static methods to reduce the redundancy of your solution.
 */

import graphics.DrawingPanel;
import java.awt.*;

public class Squares2 {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(300, 200);
        panel.setBackground(Color.CYAN);
        Graphics g = panel.getGraphics();
        g.setColor(Color.RED);
        for (int i = 1; i <= 5; i++) {
            g.drawRect(50, 50, 20 * i, 20 * i);
        }
    }
}
