package Lists.StudentsManager.entities;

public class Student {
    private final Integer AR;
    private String name;
    private String email;
    private String course;

    public Student(Integer AR, String name, String email, String course) {
        this.AR = AR;
        this.name = name;
        this.email = email;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return AR + ", " + name + ", " + email + ", " + course;
    }
}
