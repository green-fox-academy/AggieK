import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangle {
    public static void mainDraw(Graphics graphics) {
        int z = 20;
        int v = (int) z/2;
        double n = Math.pow(z,2) - Math.pow((z/2),2);
        int m = (int)(Math.sqrt(n));
        int startX = 0;
        int startY = 320;


        for (int i = 0; i < 16; i++) {
        int coordX = startX;
        int coordY = startY;
            for (int j = 0; j <= 15-i ; j++) {
                graphics.setColor(Color.BLACK);
                int x[]={coordX, coordX+z, coordX+z/2};
                int y[]={coordY, coordY, coordY-m};
                graphics.drawPolygon(x,y,3);
                coordX += z;
            }
          startY -= m;
           startX += z/2;
        }
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}
