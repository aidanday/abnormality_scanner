package ca.uwaterloo.enghack17.cvision;

import java.awt.image.BufferedImage;
import java.awt.Color;

public class AbnormalityScan
{
    public static void main(String[] args)
    {
        String name = args[0];
        BufferedImage image = IOImage.load_image(name);
        assert null != image;

        int num_expected = 5;
        if ((args.length > 1) && (null != args[1])) num_expected = Integer.parseInt(args[1]);
        int threshold = 10;
        if ((args.length > 2) && (null != args[2])) threshold = Integer.parseInt(args[2]);
        Color [] expected = MedianColors.find(image, num_expected, threshold);

        BufferedImage heatmap = MapHeat.heatmap(image, expected);

        final String prefix = "abnscan_";
        IOImage.save_image(heatmap, prefix + name);
    }
}
