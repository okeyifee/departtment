import java.util.*;

public class Course {

//    INITIALIZING VARIABLES
    private String name;
    private String teacher;
    private String duration;


//    Constructors
    public Course(String name, String teachers, String duration) {
        this.name = name;
        this.teacher = teachers;
        this.duration = duration;
    }

    public Course() {

    }

    public String getName() {
        return name;
    }
}
