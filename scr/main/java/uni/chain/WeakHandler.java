package uni.chain;

import uni.student.Student;

public class WeakHandler extends Handler {

    public void handle(Student student) {
        if (student.getType().contains("WEAK")) {
            System.out.println("Checked in WEAK pile");
        }
    }
}
