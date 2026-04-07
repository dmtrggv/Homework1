package uni.chain;

import uni.student.Student;

public class TricksterHandler extends Handler {

    @Override
    public void handle(Student student) {
        if (student.getType().equals("TRICKSTER")) {
            System.out.println("Checked in TRICKSTER pile");
        } else if (next != null) {
            next.handle(student);
        }
    }
    
}
