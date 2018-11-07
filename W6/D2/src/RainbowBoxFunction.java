import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void mainDraw(Graphics graphics) {
        for (int i = 0; i < 8; i++) {
            int width = (int) (Math.random() * 320);
            int z = (int) (160 - width / 2);
            int r = (int) (Math.random() * 255);
            int g = (int) (Math.random() * 255);
            int b = (int) (Math.random() * 255);
            graphics.setColor(new Color(r, g, b));
            graphics.fillRect(z, z, width, width);
        }
    }


        // Don't touch the code below
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
