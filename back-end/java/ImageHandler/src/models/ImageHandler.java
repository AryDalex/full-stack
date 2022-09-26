package models;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageHandler
{
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

                if((rgb & 0x00780000) >> 16 == 120 && (rgb & 0x00007800) >> 8 == 120 && (rgb & 0x00000078) == 120)
                {
                    int newRgb = 0xff0000ff;
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

//public class ImageHandler {
//
//    public static void handleImage(){
//
//        try {
//            ImageIO.read(new File(".src/resources/savyx.png"));
//            BufferedImage targetImage = new BufferedImage(bufferedImage.getWidth(), bufferedImage.getHeigth(), BufferedImage.TYPE_INT_RGB);
//
////            int rgb = bufferedImage.getRGB(x: 0, y: 0);
////            System.out.println(rgb);
//
//            for(int x = 0; x < bufferedImage.getWidth(); x++){
//                for(int y = 0; y < bufferedImage.getWidth(); y++){
//                    int rgb = originalImg.getRGB(x, y);
//                    int red = (rgb & 0x00FF0000) >> 16; // 2 bytes
//                    int green = (rgb & 0x0000FF00) >> 8; // 1 byte
//                    int blue = (rgb & 0x000000FF);
//                    int transparency = (rgb & 0xFF000000) >> 24;
//
//                    System.out.printf("RED Color is %d, green is %d, blue is %d & transparency is %d ", red, green, blue, transparency);
//                    System.out.println();
//
//                    if((rgb & 0x00FF0000) >> 16 == 255 && (rgb & 0x0000FF00) >> 8 == 255 && (rgb & 0x000000FF) == 255){
//                        int newRgb = 0x00FFFFFF;
//                        targetImg.getRaster().setDataElements(x, y, targetImg.getColorModel().getDataElements(newRgb, null));
//                    }
//                    else {
//                        targetImg.getRaster().setDataElements(x, y, targetImg.getColorModel().getDataElements(rgb, null));
//                    }
//                }
//            }
//
//            File outputFile = new File("./out/target.jpg");
//            ImageIO.write(targetImage, "png", outputFile);
//        } catch(IOException e){
//            throw new RuntimeException(e);
//        }
//    }
//}

//public class ImageHandler {
//
//    private int myValue;
//    private double myDoubleValue;
//
//
//    public ImageHandler() {
//    }
//
//    public ImageHandler(int myValue, double myDoubleValue) {
//        this.myValue = myValue;
//        this.myDoubleValue = myDoubleValue;
//    }
//
//
//    public int getMyValue() {
//        return myValue;
//    }
//
////    public void setMyValue(int myValue) {
////        this.myValue = myValue;
////    }
//
//    public double getMyDoubleValue() {
//        return myDoubleValue;
//    }
////
////    public void setMyDoubleValue(double myDoubleValue) {
////        this.myDoubleValue = myDoubleValue;
////    }
//}
