package ca.uwaterloo.enghack17.cvision;

import java.awt.image.BufferedImage;
import java.awt.Color;

public class MapHeat {

    public static int[][] differences(BufferedImage image_p, Color [] expected_p) {
        int height = image_p.getHeight();
        int width = image_p.getWidth();
	
        int[][] heats = new int[width][height];

        for(int i = 0 ; i < height ; i++) {
            for(int j = 0 ; j < width ; j++) {
                Color c = new Color(image_p.getRGB(j,i));
                int diff = ColorCompare.color_diff(c, expected_i);
                c = new Color(255 - diff, 255 - diff, 255 - diff);
                heats[j][i] = c.getRGB();
	        } // end for(j)
	    } // end for(i)
        
        return heats;
    }

    public static BufferedImage heatmap(BufferedImage image_p, Color [] expected_p) {
        int height = image_p.getHeight();
        int width = image_p.getWidth();

        int[][] heats = differences(image_p, expected_p);

        BufferedImage heatimg = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        for(int i = 0 ; i < height ; i++) {
            for(int j = 0 ; j < width ; j++) {
                heatimg.setRGB(j,i,heats[j][i]);
            } // end for(j)
        } // end for(i)

         return heatimg;
    }

}
