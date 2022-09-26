package models;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class CoresXadrez {
    public static void main(String[] args) throws IOException
    {
        BufferedImage originalImg = ImageIO.read(new File("./src/resources/xadrez.png"));
        BufferedImage targetImg = new BufferedImage(originalImg.getWidth(), originalImg.getHeight(), BufferedImage.TYPE_INT_ARGB);

        for (int x = 2300; x < 3500/*originalImg.getWidth()*/; x++)
        {
            for (int y = 1100; y < 2800/*originalImg.getHeight()*/; y++)
            {
                int rgb = originalImg.getRGB(x, y);
                int red = (rgb & 0x00ff0000) >> 16; // 2 bytes
                int green = (rgb & 0x0000ff00) >> 8; // 1 byte
                int blue = (rgb & 0x000000ff);
                int transparency = (rgb & 0xff000000) >> 24;

//                System.out.printf("RED Color is %d, green is %d, blue is %d & transparency is %d ", red, green, blue, transparency);
//                System.out.println();

                if((rgb & 0x00ff0000) >> 16 == 120 && (rgb & 0x0000ff00) >> 8 == 120 && (rgb & 0x000000ff) == 120)
                {
                    int newRgb = 0xff00ffff;
                    targetImg.getRaster().setDataElements(x, y, targetImg.getColorModel().getDataElements(newRgb, null));
                }
                else
                {
                    targetImg.getRaster().setDataElements(x, y, targetImg.getColorModel().getDataElements(rgb, null));
                }
            }
        }
        File outputFile = new File("./out/xadrez.png");
        ImageIO.write(targetImg, "png", outputFile);
    }
}
