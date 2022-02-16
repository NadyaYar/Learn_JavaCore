package Lesson8.students;

public class Demo {

    public static Student createHighestParent() {
        return new Student("Nadya ", "Yarmak", 13, new String[]{"Math", "English", "Web developer"});
    }

    public static SpecialStudents createLowestChild() {
        return new SpecialStudents("Nadya", "Yarmak", 13, new String[]{"Math", "English", "Web developer"}, "Dut", 10, 12345, 123468, "nadya.yarmak03@gmail.com");
    }
}

