package uni.chain;

import uni.student.Student;

public class WeakHandler extends Handler {

    @Override
    public void handle(Student student) {
        if (student.getType().equals("WEAK")) {
            System.out.println("Checked in WEAK pile");
        }
    }
    
}
