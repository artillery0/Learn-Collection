import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

public class LearnIteration
{
    public static void main(String[] comandLineInput)
    {

        List<String> myList = new ArrayList<String>();
        myList.add("Java");
        myList.add("C++");
        myList.add("Python");
        myList.add("Javascript");
        myList.add("mySQL");
        myList.add("GitHub");

        Iterator<String> myIter = myList.iterator();

        while (myIter.hasNext())
        {
            System.out.println(myIter.next());
        }

        System.out.println("------------------");
        ListIterator<String> myIter2 = myList.listIterator();

        while (myIter2.hasNext())
        {
            myIter2.set(myIter2.next() + "%20");
        }

        System.out.println("-----------------");

        while (myIter2.hasPrevious())
        {
            System.out.println(myIter2.previous());
        }

    }
}
