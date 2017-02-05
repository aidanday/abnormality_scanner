package ca.uwaterloo.enghack17.cvision;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.*;

public class IOImage {

    public static BufferedImage load_image(String name_p) {
        try {
            return ImageIO.read(new File(name_p));
        } catch (IOException e) {
        	return null;
        }
    }
    
    public static void save_image(BufferedImage image_p, String name_p) {
        final String format = "png";

	try {
	    File outputfile = new File(name_p);
	    ImageIO.write(image_p, format, outputfile);
	} catch (IOException e) {
	}
    }
}
