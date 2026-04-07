package uni.chain;

import uni.student.Student;

public abstract class Handler {
    protected Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    public abstract void handle(Student student);
}
