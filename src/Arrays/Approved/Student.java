package Arrays.Approved;

public class Student {

    private String name;
    private double[] grades = new double[2];

    public Student(String name, double[] grades) {
        this.name = name;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double sum() {
        double sum = 0.0;

        for (double grade : grades) {
            sum += grade;
        }

        return sum;
    }

    public double average() {
        return sum() / grades.length;
    }

}
