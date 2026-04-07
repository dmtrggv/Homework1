package uni.task;

import uni.student.Student;

public class TaskFactory {

    public static Task createTask(Student student) {
        switch (student.getType()) {
            case "NERD":
                return new MisleadingTask();
            case "TRICKSTER":
                return new ShortTask();
            case "WEAK":
                return new OldTask();
            default:
                return null;
        }
    }
}
