package uni.chain;

import uni.student.Student;

public class TricksterHandler extends Handler {

    public void handle(Student student) {
        if (student.getType().contains("TRICKSTER")) {
            System.out.println("Checked in TRICKSTER pile");
        } else if (next != null) {
            next.handle(student);
        }
    }
}
