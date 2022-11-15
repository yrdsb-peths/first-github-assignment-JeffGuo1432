public class Student
{
    private String name;
    private int grade;

    public Student(String theName, int theGrade)
    {
        name=theName;
        grade=theGrade;
    }

    public String getName()
    {
        return name;
    }

    public int getGrade()
    {
        return grade;
    }
}