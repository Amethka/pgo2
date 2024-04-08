public class App {
    public static void main(String[] args) throws Exception {

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();

        s1.Address = "s1";
        s1.Email = "s1@gmail.com";
        s1.Fname = "Student 1";
        s1.LName = "x";
        s1.IndexNumber = 1234;
        s1.Grades = new double[] { 4.5, 4.5, 3.5 };

        s2.Address = "s2";
        s2.Email = "s2@gmail.com";
        s2.Fname = "Student 2";
        s2.LName = "x";
        s2.IndexNumber = 1234;
        s2.Grades = new double[] { 3, 3.5, 4 };

        s3.Address = "s3";
        s3.Email = "s3@gmail.com";
        s3.Fname = "Student 3";
        s3.LName = "x";
        s3.IndexNumber = 1234;
        s3.Grades = new double[] { 5, 5, 3.5 };

        s4.Address = "s4";
        s4.Email = "s4@gmail.com";
        s4.Fname = "Student 4";
        s4.LName = "x";
        s4.IndexNumber = 1234;
        s4.Grades = new double[] { 4, 4, 2.5 };

        StudentGroup g1 = new StudentGroup();
        g1.Nazwa = "Grupa 1";

        StudentGroup g2 = new StudentGroup();
        g2.Nazwa = "Grupa 2";

        g1.AddStudent(s1);
        g1.AddStudent(s2);

        g2.AddStudent(s3);
        g2.AddStudent(s4);

        System.out.println(s1.GetMean());
    }
}