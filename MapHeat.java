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

    private int color_diff(Color color1_p, Color colors_p) {
        return 0;
	//TODO
    }

}
