package uni.decorator;

import uni.student.Student;

public class Telepathy extends StudentDecorator {

    public Telepathy(Student student) {
        super(student);
    }

    @Override
    public String getPower() {
        return super.getPower() + " Telepathy";
    }
    
}
