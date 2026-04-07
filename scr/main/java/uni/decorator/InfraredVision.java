package uni.decorator;

import uni.student.Student;

public class InfraredVision extends StudentDecorator {

    public InfraredVision(Student student) {
        super(student);
    }

    public String getType() {
        return student.getType() + " + Infrared Vision";
    }
}
