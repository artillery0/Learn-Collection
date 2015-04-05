import java.util.Arrays;
import java.util.Comparator;

/**
 * 
 * CLASS
 *
 */

public class LearnComparator
{
    public static void main(String[] args)
    {
        System.out.println("Tables will be printed");

        Language[] lanList = new Language[6];
        lanList[0] = new Language("java", 100, 'd');
        lanList[1] = new Language("c++", 60, 'B');
        lanList[2] = new Language("python", 94, 'c');
        lanList[3] = new Language("javascript", 80, 'a');
        lanList[4] = new Language("C#", 90, 'z');
        lanList[5] = new Language("SQL", 40, 'A');

        System.out.println();

        System.out.println("original table");
        generateTable(lanList);
        System.out.println();

        System.out.println("default sort by popularity");
        Arrays.sort(lanList);
        generateTable(lanList);
        System.out.println();

        System.out.println("sort by type");
        Arrays.sort(lanList, Language.byTypeIgnoreCase);
        generateTable(lanList);
        System.out.println();

        System.out.println("sort by name");
        Arrays.sort(lanList, Language.byNameIgnoreCase);
        generateTable(lanList);
        System.out.println();

    }

    private static void generateTable(Language[] lanList)
    {
        int lineLength = 34;
        printSeperator(lineLength, 2);
        System.out.format("|" + "%11s" + " | " + "%6s" + " |" + "%5s" + " |\n", "Language", "Popularity", "Type");
        printSeperator(lineLength, 2);
        String name;
        int pop;
        char type;
        for (Language language : lanList)
        {
            name = language.name;
            pop = language.popularity;
            type = language.type;
            System.out.format("|" + "%-11s" + " |" + "%-11d" + " |" + "%-5c" + " |\n", name, pop, type);
            printSeperator(lineLength, 1);
        }
    }

    private static void printSeperator(int num, int flag)
    {
        if (flag == 1)
        {
            for (int i = 0; i < num; i++)
            {
                System.out.print("-");
            }
            System.out.println();
        }
        else
        {
            for (int i = 0; i < num; i++)
            {
                System.out.print("=");
            }
            System.out.println();
        }
    }

}


/**
 * 
 * CLASS
 * 
 */
class Language implements Comparable<Language>
{
    String name;
    int popularity;
    char type;

    public Language(String name, int popularity, char type)
    {
        this.name = name;
        this.popularity = popularity;
        this.type = type;
    }

    @Override
    public int compareTo(Language language)
    {
        // to sort by ascending order
        return this.popularity - language.popularity;
        // to sort by descending order
        // return myLang.popularity - this.popularity;
    }

    public static Comparator<Language> byNameIgnoreCase = new Comparator<Language>()
    {
        @Override
        public int compare(Language language1, Language language2)
        {
            return language1.name.compareToIgnoreCase(language2.name);
        }
    };

    public static Comparator<Language> byName = new Comparator<Language>()
    {
        @Override
        public int compare(Language language1, Language language2)
        {
            return language1.name.compareTo(language2.name);
        }
    };

    public static Comparator<Language> byTypeIgnoreCase = new Comparator<Language>()
    {
        @Override
        public int compare(Language language1, Language language2)
        {
            char char1 = Character.toLowerCase(language1.type);
            char char2 = Character.toLowerCase(language2.type);
            // return l1.type - l2.type;
            return char1 - char2;
        }
    };

    public static Comparator<Language> byType = new Comparator<Language>()
    {
        @Override
        public int compare(Language language1, Language language2)
        {
            return language1.type - language2.type;
        }
    };

}
