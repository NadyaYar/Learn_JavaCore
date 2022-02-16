package Lesson8.students;

public class CollegeStudent extends Student {
    String collegeName;
    int rating;
    long id;

    public CollegeStudent(String firstName, String lastName, int group, String[] courseTaken, String collegeName, int rating, long id) {
        super(firstName, lastName, group, courseTaken);
        this.collegeName = collegeName;
        this.rating = rating;
        this.id = id;
    }
}
