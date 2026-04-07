package uni.university;

public class University {
    private static University instance;

    private University() {
        System.out.println("University created!");
    }

    public static University getInstance() {
        if (instance == null) {
            instance = new University();
        }
        return instance;
    }

    public void startExam() {
        System.out.println("Exam started...");
    }
}
