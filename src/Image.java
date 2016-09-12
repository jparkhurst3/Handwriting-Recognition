/**
 * Created by Joanna Parkhurst on 7/16/2015.
 */
import javax.imageio.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.*;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class Image extends Component{

    /**
     * Converts a given image into grayscale, always O(N)
     * @param img a BufferedImage image
     */
    public static void grayscale(BufferedImage img) {
        int width = img.getWidth();
        int height = img.getHeight();
        //ITERATES THROUGH EACH PIXEL
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                Color c = new Color(img.getRGB(j, i));
                //Formula for grayscale conversion = Luminosity method
                int red = (int)(c.getRed() * 0.21);
                int green = (int)(c.getGreen() * 0.72);
                int blue = (int)(c.getBlue() * 0.07);
                int total = red + green + blue;
                //CHANGES RGB VALUES
                Color newColor = new Color(total, total, total);
                img.setRGB(j,i,newColor.getRGB());
            }
        }
    }

    /**
     * Crops a given image so number hits top and bottom of image, worst case O(N)
     * @param img a BufferedImage image
     * @return the cropped image
     */
    public static BufferedImage crop(BufferedImage img) {
        int width = img.getWidth();
        int height = img.getHeight();
        //Find upper boundary (Y Value)
        int upperBoundary = 0;
        int count = 0;
        int y = 0;
        while (y < height) {
            int x = 0;
            while (x < width) {
                Color c = new Color(img.getRGB(x, y));
                int total = (c.getRed()) + (c.getGreen()) + (c.getBlue());
                if (total < 400) {
                    count++;
                    if (count > 5) {
                        //exit while loop and save X value
                        upperBoundary = y;
                        //round to nearest 10
                        upperBoundary = upperBoundary - (upperBoundary % 10);
                        y = height;
                        x = width;
                    }
                }
                x++;
            }
            y++;
        }
        //Find bottom boundary (Y value)
        int bottomBoundary = 0;
        count = 0;
        y = height - 1;
        while (y > 0) {
            int x = 0;
            while (x < width) {
                Color c = new Color(img.getRGB(x, y));
                int total = (c.getRed()) + (c.getGreen()) + (c.getBlue());
                if (total < 350) {
                    count++;
                    if (count > 5) {
                        //exit while loop and save X value
                        bottomBoundary = y;
                        //round to nearest 10
                        bottomBoundary = bottomBoundary + (10 - (bottomBoundary % 10));
                        if (bottomBoundary > img.getHeight()) {
                            bottomBoundary = bottomBoundary - 10;
                        }
                        y = 0;
                        x = width;
                    }
                }
                x++;
            }
            y--;
        }
        //Set width
        int cropHeight = bottomBoundary - upperBoundary;
        int cropWidth = cropHeight;
        int cropSide = (img.getWidth() - cropHeight) / 2;
        if (cropSide < 0) {
            cropSide = 0;
            cropWidth = img.getWidth();
        }
        int cropEnd = cropSide + cropWidth;
        //Create new cropped image & return
        BufferedImage cropped = img.getSubimage(cropSide, upperBoundary, cropWidth, cropHeight);
        return cropped;
    }

    /**
     * Grids the image into 100 grids, assigns a 0 or 1 to each
     * @param img the image being tested
     * @return an array of the image's black/white values
     */
    public static ArrayList<Integer> averageGrid(BufferedImage img) {
        ArrayList<Integer> averageValues = new ArrayList<>();
        int gridWidth = img.getWidth() / 10;
        int gridHeight = img.getHeight() / 10;
        int x = 0;
        int y = 0;
        //ITERATE THROUGH EACH GRID
        while (y < img.getHeight()) {
            while (x < img.getWidth()) {
                double pixTotal = 0;
                double pixBlack = 0;
                //ITERATE THROUGH PIXELS IN EACH GRID
                for (int j = 0; j < gridHeight; j++) {
                    for (int i = 0; i < gridWidth; i++) {
                        int xVal = x + i;
                        int yVal = y + j;
                        if(xVal < img.getWidth() || yVal < img.getHeight()) {
                            Color c = new Color(img.getRGB(xVal, yVal));
                            int total = (c.getRed()) + (c.getGreen()) + (c.getBlue());
                            if (total < 350) {
                                pixBlack++;
                            }
                            pixTotal++;
                        }
                    }
                }
                //ADD GRID VALUE (0 FOR WHITE OR 1 FOR BLACK) TO ARRAY
                double proportion = pixBlack/pixTotal;
                int value = 0;
                if (proportion > .5) {
                    value = 1;
                }
                averageValues.add(value);
                x = x + gridWidth;
            }
            x = 0;
            y = y + gridHeight;
        }
        return averageValues;
    }
}
