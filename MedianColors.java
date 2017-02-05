import java.awt.image.BufferedImage;
import java.awt.Color;

package ca.uwaterloo.enghack17.cvision;

public MedianColors {
    public static Color [] find(BufferedImage image_p, int num_expected_p) {
        int height = image_p.getHeight();
	int width = image_p.getWidth();
	final int threshold = 40;

	FrequencyList fl;

	for(int i = 0 ; i < height ; i++) {
	    for(int j = 0 ; j < width ; j++) {
	        fl.insert(image_p.getRGB(j,i), threshold);
	    } // end for(j)
	} // end for(i)

	return fl.head(num_expected_p);
    }
}
