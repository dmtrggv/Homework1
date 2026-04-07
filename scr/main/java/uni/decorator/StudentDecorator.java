package uni.decorator;

import uni.student.Student;

public abstract class StudentDecorator implements Student {
    protected Student student;

    public StudentDecorator(Student student) {
        this.student = student;
    }

    public String getType() {
        return student.getType();
    }
}
