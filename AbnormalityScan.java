import java.awt.image.BufferedImage
import MapHeat
import RGB


public class AbnormalityScan
{

    public static void main(String[] args)
    {
        BufferedImage image; //scan PNG to image
        RGB [] expected;
        
        BufferedImage heatmap = MapHeat.heatmap(image, expected);

        //output image to PNG
    }
}
