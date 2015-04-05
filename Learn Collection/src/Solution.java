import java.util.HashMap;

public class Solution
{
    public static int singleNumber(int[] A)
    {

        HashMap<Integer, Integer> hm = new HashMap();

        for (int i = 0; i < A.length; i++)
        {
            hm.put(A[i], i);
        }
        for (int i = 0; i < A.length; i++)
        {
            if (hm.get(A[i]) == null)
            {
                return A[i];
            }

        }
        return -1;

    }

    public static void main(String[] args)
    {
        int[] stuff =
        {
                1, 3, 5, 4, 6, 4, 6
        };

        HashMap hm = new HashMap<>();
        for (int i = 0; i < stuff.length; i++)
        {

            hm.put(stuff[i], i);
        }
        System.out.println(hm.get(6));

    }

    public static boolean not5(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == 5)
            {
                return false;
            }
        }
        return true;
    }
}