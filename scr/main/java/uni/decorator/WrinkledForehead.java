package uni.decorator;

import uni.student.Student;

public class WrinkledForehead extends StudentDecorator {

    public WrinkledForehead(Student student) {
        super(student);
    }

    @Override
    public String getPower() {
        return super.getPower() + " WrinkledForehead";
    }
    
}
