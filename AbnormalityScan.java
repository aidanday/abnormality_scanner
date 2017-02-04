import MapHeat;
import RGB;

public class AbnormalityScan
{

    public static void main(String[] args)
    {
        String name; // TODO get name

        BufferedImage image = IOImage.getImage(name); //scan PNG to image

        RGB [] expected; // TODO get expected RGBs
        
        BufferedImage heatmap = MapHeat.heatmap(image, expected);

        final String prefix = "abnormal_";
	IOImage.saveImage(heatmap, prefix + name); // save PNG of heatmap
    }
}
