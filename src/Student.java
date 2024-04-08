public class Student {
    public String Fname;
    public String LName;
    public int IndexNumber;
    public String Email;
    public String Address;
    public double[] Grades;

    public double GetMean()
    {
        if(Grades == null)
        {
            throw new IllegalArgumentException("Student nie ma ocen");
        }
        if(Grades.length >= 20){
            throw new IllegalArgumentException("Student ma wiecej niz 20 ocen");
        }

        double sum = 0;
        for(double x : Grades){
            sum += x;
        }
        return sum / Grades.length;
    }
}
