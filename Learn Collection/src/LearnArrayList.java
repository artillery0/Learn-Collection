import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Vector;

import javax.imageio.ImageIO;

public class LearnArrayList
{
    public static void main(String[] args) throws Exception
    {

        String str;
        List myList = new ArrayList();
        myList.add(1);
        myList.add(2);
        myList.add(3);

        myList.remove(0);
        myList.set(1, 987878);

        for (int i = 0; i < myList.size(); i++)
        {
            System.out.println(myList.get(i));
        }

        boolean[] array =
        {
                true, false, false, true
        };
        System.out.println(Array.getBoolean(array, 1));
        int[] arr =
        {
                1, 2, 3, 4
        };
        System.out.println(Array.getInt(arr, 3));
        System.out.println("-----------------");
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(1);
        pq.add(2);
        pq.add(10);
        pq.add(3);

        System.out.println("||||||||||||||||||||||||||||||||||||||");
        pq.clear();
        pq.peek();

        Vector<String> myVec = new Vector<String>();
        myVec.add("Hello");
        myVec.add("goodbye");

        captureScreen("C:\\users\\alex\\desktop\\shit.png");
    }

    public static void captureScreen(String fileName) throws Exception
    {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle screenRectangle = new Rectangle(screenSize);
        Robot robot = new Robot();
        BufferedImage image = robot.createScreenCapture(screenRectangle);
        ImageIO.write(image, "png", new File(fileName));
    }
}
