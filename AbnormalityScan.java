import java.awt.image.BufferedImage;
import java.awt.Color;

import MapHeat;

public class AbnormalityScan
{
    public static void main(String[] args)
    {
        String name = args[0];
        BufferedImage image = IOImage.load_image(name); //scan PNG to image

	Color [] expected; // TODO get expected RGBs

        BufferedImage heatmap = MapHeat.heatmap(image, expected);

        final String prefix = "processed_";
	IOImage.save_image(heatmap, prefix + name); // save PNG of heatmap
    }
}
