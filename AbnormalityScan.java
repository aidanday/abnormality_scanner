import java.awt.image.BufferedImage;
import javax.imageio.*;

import MapHeat;
import RGB;


public class AbnormalityScan
{

    public static void main(String[] args)
    {
        String name; // TODO get name

        BufferedImage image = getImage(name); //scan PNG to image

        RGB [] expected; // TODO get expected RGBs
        
        BufferedImage heatmap = MapHeat.heatmap(image, expected);

        saveImage(heatmap, name); // save PNG of heatmap
    }

    private static BufferedImage getImage(String name_p) {
        return ImageIO.read(new File(name_p));
    }

    private static void saveImage(BufferedImage image_p, String name_p) {
    }
}
