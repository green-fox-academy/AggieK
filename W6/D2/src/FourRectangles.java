
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics) {
        // draw four different size and color rectangles.
        // avoid code duplication.

        int r = 0;
        int g = 0;
        int b = 0;
        for (int i = 0; i < 4; i++) {
            r = (int) (Math.random() * 255);
            g = (int) (Math.random() * 255);
            b = (int) (Math.random() * 255);

            graphics.setColor(new Color(r, g, b));

            int x = (int) (Math.random() * 320);
            int y = (int) (Math.random() * 320);
            int w = (int) (Math.random() * 320);
            int h = (int) (Math.random() * 320);
            graphics.drawRect(x, y, w, h);
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