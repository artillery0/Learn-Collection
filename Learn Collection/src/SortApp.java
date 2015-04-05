import java.util.Arrays;
import java.util.Comparator;

public class SortApp
{
    public static void main(String[] commandLineInput)
    {

        // Generate students

        String[] boyName =
        {
                "Alex", "Bosh", "Charlie", "Dickson", "Emerson", "Ferguson", "Gates", "Henry", "Ian", "Jake", "Kelvin"
        };
        String[] girlName =
        {
                "Alice", "Brith", "Christina", "Disney", "Emma", "Folwer", "Gayie", "Hush", "Ivan", "Jessy", "Kate"
        };

        int num = boyName.length + girlName.length;
        Student[] studentArray = new Student[num];
        for (int i = 0; i < boyName.length; i++)
        {
            int age = (int) (Math.random() * 60);
            double gpa = Math.random() * 4.00;
            String name = boyName[i];
            long studentID = (int) (Math.random() * 900);
            studentArray[i] = new Student(age, gpa, name, studentID, 'M');
        }
        for (int i = boyName.length; i < num; i++)
        {
            int age = (int) (Math.random() * 60);
            double gpa = Math.random() * 4.00;
            String name = girlName[i - boyName.length];
            long studentID = (int) (Math.random() * 900);
            studentArray[i] = new Student(age, gpa, name, studentID, 'F');
        }

        // show table
        System.out.println();
        System.out.println("Name \t    ID\t       Age   GPA  Gender");
        for (Student student : studentArray)
        {
            student.printStuInfo();
            System.out.println();
        }
        System.out.println();

        // default sort
        System.out.println("By Name =================================");
        System.out.println();
        System.out.println("Name \t    ID\t       Age   GPA  Gender");
        Arrays.sort(studentArray);
        for (Student student : studentArray)
        {
            student.printStuInfo();
            System.out.println();
        }
        System.out.println();

        // by age
        System.out.println("By Age  ================================");
        System.out.println();
        System.out.println("Name \t    ID\t       Age   GPA  Gender");
        Arrays.sort(studentArray, Student.byAge);
        for (Student student : studentArray)
        {
            student.printStuInfo();
            System.out.println();
        }
        System.out.println();

        // by gpa
        System.out.println("By Gpa  ================================");
        System.out.println();
        System.out.println("Name \t    ID\t       Age   GPA  Gender");
        Arrays.sort(studentArray, Student.byGpa);
        for (Student student : studentArray)
        {
            student.printStuInfo();
            System.out.println();
        }
        System.out.println();

        // by ID
        System.out.println("By ID  ================================");
        System.out.println();
        System.out.println("Name \t    ID\t       Age   GPA  Gender");
        Arrays.sort(studentArray, Student.byID);
        for (Student student : studentArray)
        {
            student.printStuInfo();
            System.out.println();
        }
        System.out.println();

    }
}


/**
 * 
 * CLASS
 *
 */
class Student implements Comparable<Student>
{

    int age;
    double gpa;
    String name;
    long studentID;
    char gender;

    static Comparator<Student> byAge;
    static Comparator<Student> byGpa;
    static Comparator<Student> byName;
    static Comparator<Student> byID;
    static Comparator<Student> byGender;

    public Student(int age, double gpa, String name, long studentID, char gender)
    {
        this.age = age;
        this.gpa = gpa;
        this.name = name;
        this.studentID = studentID + 301192000;
        this.gender = gender;

        byAge = new Comparator<Student>()
        {
            @Override
            public int compare(Student student1, Student student2)
            {
                return student1.age - student2.age;
            }
        };

        byGpa = new Comparator<Student>()
        {
            @Override
            public int compare(Student student1, Student student2)
            {
                if (student1.gpa < student2.gpa)
                    return -1;
                if (student1.gpa > student2.gpa)
                    return 1;
                return 0;
            }
        };

        byID = new Comparator<Student>()
        {
            @Override
            public int compare(Student student1, Student student2)
            {
                if (student1.studentID < student2.studentID)
                    return -1;
                if (student1.studentID > student2.studentID)
                    return 1;
                return 0;
            }
        };

    }

    public void printStuInfo()
    {
        System.out.format("%-9s   %d  %-2d  %6.2f  %2c ", name, studentID, age, gpa, gender);
    }

    @Override
    public int compareTo(Student student)
    {
        return this.name.compareToIgnoreCase(student.name);
    }

}
