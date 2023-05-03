package Objects.Ushtrimi14;

import java.util.ArrayList;

/*14. Write a Java program to create a class called "School" with attributes for students, teachers,
        and classes, and methods to add and remove students and teachers, and to create classes*/
public class School {

    public String student;
    public String teacher;
    public int classes;




    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public int getClasses() {
        return classes;
    }

    public void setClasses(int classes) {
        this.classes = classes;
    }

    public School(String student, String teacher, int classes) {
        this.student = student;
        this.teacher = teacher;
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "School{" +
                "student='" + student + '\'' +
                ", teacher='" + teacher + '\'' +
                ", classes=" + classes +
                '}';
    }
}
