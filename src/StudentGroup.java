import java.util.ArrayList;

public class StudentGroup {
    public String Nazwa;
    private ArrayList<Student> Students;

    public StudentGroup() {
        Students = new ArrayList<Student>();
    }

    public void AddStudent(Student s)
    {
        if(Students.size() >= 15 ||
                Students.contains(s))
        {
            throw new IllegalStateException("Ilośc studentów jest większa od 15 lub dany student jest już dodany do grupy");
        }

        Students.add(s);
    }
}