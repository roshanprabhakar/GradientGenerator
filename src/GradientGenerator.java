import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.util.ArrayList;

public class GradientGenerator {

    private ArrayList<Color> gradient;
    private int visualizationHeight;

    private Computer red;
    private Computer green;
    private Computer blue;

    public GradientGenerator(Computer[] set, int visualizationHeight) {
        gradient = new ArrayList<>();
        this.visualizationHeight = visualizationHeight;

        this.red = set[0];
        this.green = set[1];
        this.blue = set[2];
    }

    public void generateMap(int tStart, int tEnd) {
        for (int i = tStart; i <= tEnd; i++) {
            gradient.add(new Color((int) red.compute(i), (int) green.compute(i), (int) blue.compute(i)));
        }
    }

    public BufferedImage getVisualization() {
        BufferedImage image = new BufferedImage(gradient.size(), visualizationHeight, BufferedImage.TYPE_3BYTE_BGR);
        for (int c = 0; c < gradient.size(); c++) {
            for (int r = 0; r < visualizationHeight; r++) {
                image.setRGB(c, r, gradient.get(c).getRGB());
            }
        }
        return image;
    }
}
