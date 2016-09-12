import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Owner on 7/17/2015.
 */
public class TestProject {
    /**
     * Tests the classes "Templates", "Image" and "Compare"
     *
     * @param args
     */
    public static void main(String[] args) {
        ///////TEST ZERO
        System.out.println("TEST ZERO:");
        BufferedImage img0 = null;
        Image test0 = new Image();
        try {
            File input = new File("C:/Users/Owner/IdeaProjects/IndividualProject_JoannaParkhurst/src/TestingImage_0.jpg");
            img0 = ImageIO.read(input);
            test0.grayscale(img0);
            BufferedImage cropped = test0.crop(img0);
            ArrayList<Integer> gridValues = test0.averageGrid(cropped);
            Compare compareTest = new Compare(gridValues);
            String compareToString = compareTest.turnIntoString();
            ArrayList<Integer> accurate = compareTest.findMatches(compareToString);
            int answer = compareTest.bestMatch(accurate);
            System.out.print("ESTIMATE = " + answer + " -->  ");
            if (answer == 0) {
                System.out.println("MATCH!!!");
            } else {
                System.out.println("no match :(");
            }
        } catch (IOException e) {
            System.out.print("NOOOO this picture doesn't exist :(");
        }

        ///////TEST ONE
        System.out.println("TEST ONE:");
        BufferedImage img1 = null;
        Image test1 = new Image();
        try {
            File input = new File("C:/Users/Owner/IdeaProjects/IndividualProject_JoannaParkhurst/src/TestingImage_TakeTwo_1.jpg");
            img1 = ImageIO.read(input);
            test1.grayscale(img1);
            BufferedImage cropped = test1.crop(img1);
            ArrayList<Integer> gridValues = test1.averageGrid(cropped);
            Compare compareTest = new Compare(gridValues);
            String compareToString = compareTest.turnIntoString();
            ArrayList<Integer> accurate = compareTest.findMatches(compareToString);
            int answer = compareTest.bestMatch(accurate);
            System.out.print("ESTIMATE = " + answer + " -->  ");
            if (answer == 1) {
                System.out.println("MATCH!!!");
            } else {
                System.out.println("no match :(");
            }
        } catch (IOException e) {
            System.out.print("NOOOO this picture doesn't exist :(");
        }

        ////////TEST TWO
        System.out.println("TEST TWO:");
        BufferedImage img2 = null;
        Image test2 = new Image();
        try {
            File input = new File("C:/Users/Owner/IdeaProjects/IndividualProject_JoannaParkhurst/src/TestingImage_2.jpg");
            img2 = ImageIO.read(input);
            test2.grayscale(img2);
            BufferedImage cropped = test2.crop(img2);
            ArrayList<Integer> gridValues = test2.averageGrid(cropped);
            Compare compareTest = new Compare(gridValues);
            String compareToString = compareTest.turnIntoString();
            ArrayList<Integer> accurate = compareTest.findMatches(compareToString);
            int answer = compareTest.bestMatch(accurate);
            System.out.print("ESTIMATE = " + answer + " -->  ");
            if (answer == 2) {
                System.out.println("MATCH!!!");
            } else {
                System.out.println("no match :(");
            }
        } catch (IOException e) {
            System.out.print("NOOOO this picture doesn't exist :(");
        }

        ////////TEST THREE
        System.out.println("TEST THREE:");
        BufferedImage img3 = null;
        Image test3 = new Image();
        try {
            File input = new File("C:/Users/Owner/IdeaProjects/IndividualProject_JoannaParkhurst/src/TestingImage_3.jpg");
            img3 = ImageIO.read(input);
            test3.grayscale(img3);
            BufferedImage cropped = test3.crop(img3);
            ArrayList<Integer> gridValues = test3.averageGrid(cropped);
            Compare compareTest = new Compare(gridValues);
            String compareToString = compareTest.turnIntoString();
            ArrayList<Integer> accurate = compareTest.findMatches(compareToString);
            int answer = compareTest.bestMatch(accurate);
            System.out.print("ESTIMATE = " + answer + " -->  ");
            if (answer == 3) {
                System.out.println("MATCH!!!");
            } else {
                System.out.println("no match :(");
            }
        } catch (IOException e) {
            System.out.print("NOOOO this picture doesn't exist :(");
        }

        ////////TEST FOUR
        System.out.println("TEST FOUR:");
        BufferedImage img4 = null;
        Image test4 = new Image();
        try {
            File input = new File("C:/Users/Owner/IdeaProjects/IndividualProject_JoannaParkhurst/src/TestingImage_TakeTwo_4.jpg");
            img4 = ImageIO.read(input);
            test4.grayscale(img4);
            BufferedImage cropped = test4.crop(img4);
            ArrayList<Integer> gridValues = test4.averageGrid(cropped);
            Compare compareTest = new Compare(gridValues);
            String compareToString = compareTest.turnIntoString();
            ArrayList<Integer> accurate = compareTest.findMatches(compareToString);
            int answer = compareTest.bestMatch(accurate);
            System.out.print("ESTIMATE = " + answer + " -->  ");
            if (answer == 4) {
                System.out.println("MATCH!!!");
            } else {
                System.out.println("no match :(");
            }
        } catch (IOException e) {
            System.out.print("NOOOO this picture doesn't exist :(");
        }

        ////////TEST FIVE
        System.out.println("TEST FIVE:");
        BufferedImage img5 = null;
        Image test5 = new Image();
        try {
            File input = new File("C:/Users/Owner/IdeaProjects/IndividualProject_JoannaParkhurst/src/TestingImage_TakeTwo_5.jpg");
            img5 = ImageIO.read(input);
            test5.grayscale(img5);
            BufferedImage cropped = test5.crop(img5);
            ArrayList<Integer> gridValues = test5.averageGrid(cropped);
            Compare compareTest = new Compare(gridValues);
            String compareToString = compareTest.turnIntoString();
            ArrayList<Integer> accurate = compareTest.findMatches(compareToString);
            int answer = compareTest.bestMatch(accurate);
            System.out.print("ESTIMATE = " + answer + " -->  ");
            if (answer == 5) {
                System.out.println("MATCH!!!");
            } else {
                System.out.println("no match :(");
            }
        } catch (IOException e) {
            System.out.print("NOOOO this picture doesn't exist :(");
        }


        ////////TEST SIX
        System.out.println("TEST SIX:");
        BufferedImage img6 = null;
        Image test6 = new Image();
        try {
            File input = new File("C:/Users/Owner/IdeaProjects/IndividualProject_JoannaParkhurst/src/TestingImage_TakeTwo_6.jpg");
            img6 = ImageIO.read(input);
            test6.grayscale(img6);
            BufferedImage cropped = test6.crop(img6);
            ArrayList<Integer> gridValues = test6.averageGrid(cropped);
            Compare compareTest = new Compare(gridValues);
            String compareToString = compareTest.turnIntoString();
            ArrayList<Integer> accurate = compareTest.findMatches(compareToString);
            int answer = compareTest.bestMatch(accurate);
            System.out.print("ESTIMATE = " + answer + " -->  ");
            if (answer == 6) {
                System.out.println("MATCH!!!");
            } else {
                System.out.println("no match :(");
            }
        } catch (IOException e) {
            System.out.print("NOOOO this picture doesn't exist :(");
        }

        ////////TEST SEVEN
        System.out.println("TEST SEVEN:");
        BufferedImage img7 = null;
        Image test7 = new Image();
        try {
            File input = new File("C:/Users/Owner/IdeaProjects/IndividualProject_JoannaParkhurst/src/TestingImage_7.jpg");
            img7 = ImageIO.read(input);
            test7.grayscale(img7);
            BufferedImage cropped = test7.crop(img7);
            ArrayList<Integer> gridValues = test7.averageGrid(cropped);
            Compare compareTest = new Compare(gridValues);
            String compareToString = compareTest.turnIntoString();
            ArrayList<Integer> accurate = compareTest.findMatches(compareToString);
            int answer = compareTest.bestMatch(accurate);
            System.out.print("ESTIMATE = " + answer + " -->  ");
            if (answer == 7) {
                System.out.println("MATCH!!!");
            } else {
                System.out.println("no match :(");
            }
        } catch (IOException e) {
            System.out.print("NOOOO this picture doesn't exist :(");
        }

        /////////TEST EIGHT
        System.out.println("TEST EIGHT:");
        BufferedImage img8 = null;
        Image test8 = new Image();
        try {
            File input = new File("C:/Users/Owner/IdeaProjects/IndividualProject_JoannaParkhurst/src/TestingImage_8.jpg");
            img8 = ImageIO.read(input);
            test8.grayscale(img8);
            BufferedImage cropped = test8.crop(img8);
            ArrayList<Integer> gridValues = test8.averageGrid(cropped);
            Compare compareTest = new Compare(gridValues);
            String compareToString = compareTest.turnIntoString();
            ArrayList<Integer> accurate = compareTest.findMatches(compareToString);
            int answer = compareTest.bestMatch(accurate);
            System.out.print("ESTIMATE = " + answer + " -->  ");
            if (answer == 8) {
                System.out.println("MATCH!!!");
            } else {
                System.out.println("no match :(");
            }
        } catch (IOException e) {
            System.out.print("NOOOO this picture doesn't exist :(");
        }

        //////////TEST NINE
        System.out.println("TEST NINE:");
        BufferedImage img9 = null;
        Image test9 = new Image();
        try {
            File input = new File("C:/Users/Owner/IdeaProjects/IndividualProject_JoannaParkhurst/src/TestingImage_9.jpg");
            img9 = ImageIO.read(input);
            test9.grayscale(img9);
            BufferedImage cropped = test9.crop(img9);
            ArrayList<Integer> gridValues = test9.averageGrid(cropped);
            Compare compareTest = new Compare(gridValues);
            String compareToString = compareTest.turnIntoString();
            ArrayList<Integer> accurate = compareTest.findMatches(compareToString);
            int answer = compareTest.bestMatch(accurate);
            System.out.print("ESTIMATE = " + answer + " -->  ");
            if (answer == 9) {
                System.out.println("MATCH!!!");
            } else {
                System.out.println("no match :(");
            }
        } catch (IOException e) {
            System.out.print("NOOOO this picture doesn't exist :(");
        }

        System.out.println("DONE!");



    }
}
