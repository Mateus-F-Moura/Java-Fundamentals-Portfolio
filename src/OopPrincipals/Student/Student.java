package OopPrincipals.Student;

public class Student {

    public String name;
    public double[] grades = new double[3];

    public double getFinalGrade() {
        return grades[0] + grades[1] + grades[2];
    }

    public String getResult() {
        double finalGrade = getFinalGrade();

        if (finalGrade >= 60) {
            return "PASS";
        } else {
            String missing = String.format("%.2f", (60 - finalGrade));
            return "FAILED\n" + "MISSING " + missing;
        }
    }

    public String toString() {
        String finalGradeStr = String.format("%.2f", getFinalGrade());
        return "FINAL GRADE: " + finalGradeStr + "\n" + getResult();
    }

}
