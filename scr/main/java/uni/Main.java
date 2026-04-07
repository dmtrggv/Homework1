package uni;

import uni.university.University;
import uni.student.*;
import uni.task.*;
import uni.decorator.*;
import uni.chain.*;

public class Main {

    public static void main(String[] args) {

        // Singleton
        University uni = University.getInstance();
        uni.startExam();

        // Students
        Student s1 = new NerdStudent();
        Student s2 = new TricksterStudent();
        Student s3 = new WeakStudent();

        // Decorator (суперсили)
        s1 = new Telepathy(s1);
        s2 = new InfraredVision(s2);
        s3 = new WrinkledForehead(s3);

        // Factory
        Task t1 = TaskFactory.createTask(s1);
        Task t2 = TaskFactory.createTask(s2);
        Task t3 = TaskFactory.createTask(s3);

        t1.showTask();
        t2.showTask();
        t3.showTask();

        // Chain of Responsibility
        Handler nerd = new NerdHandler();
        Handler trick = new TricksterHandler();
        Handler weak = new WeakHandler();

        nerd.setNext(trick);
        trick.setNext(weak);

        nerd.handle(s1);
        nerd.handle(s2);
        nerd.handle(s3);
        
    }
    
}
