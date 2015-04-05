import java.util.HashMap;

public class LearnHash
{
    public static void main(String[] args)
    {

        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int[] arr =
        {
                1, 2, 3, 4, 5
        };
        for (int i = 0; i < arr.length; i++)
        {
            hm.put(arr[i], i);
        }

        String str = "hello";
        int num = 123;
        System.out.println("----------------------");
        System.out.format("|%-10s|%-10d|", str, num);
        System.out.println();
        System.out.println("----------------------");

        String[] words = foo("hello", "java", "getting intersting", "variable number of arges");
        for (String word : words)
        {
            System.out.println(word);
        }

    }

    public static String[] foo(String... num)
    {
        return num;
    }
}
