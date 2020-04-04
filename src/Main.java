import javax.swing.*;
import javax.swing.plaf.InternalFrameUI;
import java.awt.image.BufferedImage;

public class Main {

    public static void main(String[] args) {
        Computer red = new Red();
        Computer green = new Green();
        Computer blue = new Blue();

        Computer[] computers = {red, green, blue};
        GradientGenerator generator = new GradientGenerator(computers, 100);

        generator.generateMap(0, 1000);
        display(generator.getVisualization());

        try {Thread.sleep(10000);} catch (InterruptedException ignored) {}
    }

    public static void display(BufferedImage image) {
        JFrame frame = new JFrame("image");
        frame.getContentPane().add(new JLabel(new ImageIcon(image)));
        frame.pack();
        frame.setVisible(true);
    }
}
