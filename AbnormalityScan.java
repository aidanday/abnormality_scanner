import java.awt.image.BufferedImage;
import java.awt.Color;

package ca.uwaterloo.enghack17.cvision;

public class AbnormalityScan
{
    public static void main(String[] args)
    {
        String name = args[0];
        BufferedImage image = IOImage.load_image(name);

	final int num_expected = 5;
	Color [] expected = MedianColors.find(image, num_colors);

        BufferedImage heatmap = MapHeat.heatmap(image, expected);

        final String prefix = "processed_";
	IOImage.save_image(heatmap, prefix + name);
    }
}
