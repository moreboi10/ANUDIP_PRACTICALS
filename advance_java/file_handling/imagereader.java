import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class imagereader {
    public static void main(String[] args) {
        try {
            File fileobj = new File("image1.jpg");
            BufferedImage image = ImageIO.read(fileobj); // imageIO used to read binary image file and convert it into byte stream
            System.out.println("The image has been read successfully.");
            System.out.println("Width: " + image.getWidth());
            System.out.println("Height: " + image.getHeight());

        } catch (IOException e) {
            System.out.println("The message that appears is : "+e.getMessage());
        }

    }
}
