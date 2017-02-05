package ca.uwaterloo.enghack17.cvision;

import java.awt.Color;

public class ColorCompare {

    public static int color_diff(Color color1_p, Color color2_p) {
        int current = color1_p.getRed() - color2_p.getRed();
        if (current < 0) current = -current;
        int total = current;
        current = color1_p.getGreen() - color2_p.getGreen();
        if (current < 0) current = -current;
        total += current;
        current = color1_p.getBlue() - color2_p.getBlue();
        if (current < 0) current = -current;
        total += current;
        return total / 3;
    }

    public static int color_diff(Color color_p, Color [] colors_p) {
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
