package ca.uwaterloo.enghack17.cvision;

import java.awt.image.BufferedImage;
import java.awt.Color;

class MedianColors {
    public static Color [] find(BufferedImage image_p, int num_expected_p, int threshold_p) {
        int height = image_p.getHeight();
        int width = image_p.getWidth();

        FrequencyList fl = new FrequencyList();

        for(int i = 0 ; i < height ; i++) {
            for(int j = 0 ; j < width ; j++) {
                fl.insert(new Color(image_p.getRGB(j,i)), threshold_p);
            } // end for(j)
        } // end for(i)

       Color [] array = fl.head(num_expected_p);
       int length = 0;
       for(int k = 0 ; k < num_expected_p ; k++) {
           if (null != array[k]) length++;
       } // end for(k)
       Color [] expected = new Color[length];
       for(int p = 0 ; p < length ; p++) expected[p] = array[p];
       return expected;
    }
}
