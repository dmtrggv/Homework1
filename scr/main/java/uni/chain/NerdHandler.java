package uni.chain;

import uni.student.Student;

public class NerdHandler extends Handler {

    public void handle(Student student) {
        if (student.getType().contains("NERD")) {
            System.out.println("Checked in NERD pile");
        } else if (next != null) {
            next.handle(student);
        }
    }
}
