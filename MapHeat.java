import java.awt.image.BufferedImage;
import java.awt.Color;


public class MapHeat {

    public static int [] differences(BufferedImage image_p, Color [] expected_p) {
        int height = image_p.getHeight();
	int width = image_p.getWidth();
	
	int heats [width][height];

        for(int i = 0 ; i < height ; i++) {
	    for(int j = 0 ; j < width ; i++) {
	        Color c{image_p.getRGB(j,i)}
		heats[j][i] = color_diff(c, expected_p);
	    } // end for(j)
	} // end for(i)
    }

    public static void heatmap(BufferedImage image_p, Color [] expected_p) {
        int height = image_p.getHeight();
	int width = image_p.getWidth();

	int heats [width][height] = differences(image_p, expected_p);

	BufferedImage heatimg{width, height, BufferedImage.TYPE_INT_ARGB};

	for(int i = 0 ; i < height ; i++) {
	    for(int j = 0 ; j < width ; j++) {
	        heatimg.setRGB(j,i,heats[j][i]);
	    } // end for(j)
	} // end for(i)

	return heatimg;
    }

    private int color_diff(Color color1_p, Color color2_p) {
	int current = color1_p.getRed() - color2_p.getRed();
	if (current < 0) current = -current;
	int total = current;
	current = color1_p.getGreen() - color2_p.getGreen();
	if (current < 0) current = -current;
	total += current;
	current = color1_p.getBlue() - color2_p.getBlue();
	if (current < 0) current = -current;
	total += current;
	total /= 3;
	return total;
    }

    private int color_diff(Color color_p, Color [] colors_p) {
        int length = colors_p.length;
        int min_diff = color_diff(color_p, colors_p[0]);
	int temp;

	for (int i = 1 ; i < length ; i++) {
	    temp = color_diff(color_p, colors_p[i]);
	    if (temp < min_diff) min_diff = temp;
	} // end for(i)

	return min_diff;
    }

}
