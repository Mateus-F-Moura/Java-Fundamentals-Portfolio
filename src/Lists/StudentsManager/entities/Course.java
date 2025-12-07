package Lists.StudentsManager.entities;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private Integer vacancies;
    private List<Student> students;

    public Course(String name, Integer vacancies) {
        this.name = name;
        this.vacancies = vacancies;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumberOfStudents() {
        return students.size();
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        if (getNumberOfStudents() < vacancies) {
            this.students.add(student);
        } else {
            throw new RuntimeException("There are no vacancies available in this course!");
        }
    }

    @Override
    public String toString() {
        return "Course name: " + name
                + "\nNumber of students: " + getNumberOfStudents()
                + "\nVacancies: " + vacancies;
    }
}
