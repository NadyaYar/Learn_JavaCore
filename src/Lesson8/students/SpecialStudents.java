package Lesson8.students;

public class SpecialStudents extends CollegeStudent {
    long secretKey;
    String email;

    public SpecialStudents(String firstName, String lastName, int group, String[] courseTaken, String collegeName, int rating, long id, long secretKey, String email) {
        super(firstName, lastName, group, courseTaken, collegeName, rating, id);
        this.secretKey = secretKey;
        this.email = email;
    }
}
