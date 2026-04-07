package uni.decorator;

import uni.student.Student;

public class WrinkledForehead extends StudentDecorator {

    public WrinkledForehead(Student student) {
        super(student);
    }

    public String getType() {
        return student.getType() + " + Wrinkled Forehead";
    }
}
