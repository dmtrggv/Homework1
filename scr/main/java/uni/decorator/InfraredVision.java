package uni.decorator;

import uni.student.Student;

public class InfraredVision extends StudentDecorator {

    public InfraredVision(Student student) {
        super(student);
    }

    @Override
    public String getPower() {
        return super.getPower() + " InfraredVision";
    }
    
}
