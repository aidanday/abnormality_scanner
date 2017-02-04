import java.awt.BufferedImage;
import java.awt.image.*;
import javax.imageio.*;

public class IOImage {

    public static BufferedImage load_image(String name_p) {
       try {
           return ImageIO.read(new File(name_p));
       } catch (IOException e) {
       }
    }
    
    public static void save_image(BufferedImage image_p, String name_p) {
    }
}
