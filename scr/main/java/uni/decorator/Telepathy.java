package uni.decorator;

import uni.student.Student;

public class Telepathy extends StudentDecorator {

    public Telepathy(Student student) {
        super(student);
    }

    public String getType() {
        return student.getType() + " + Telepathy";
    }
}
