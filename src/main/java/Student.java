
import java.util.List;


// This is a student object having the characteristics of students of the school.
public class Student extends School{
    private int id;
    private String name;
    private String level;
    private int year_of_birth;
    private List<Course> courses;


    public Student(String name, int score, int year_of_birth) {
    }


// getting student's ID
    public int getId() {
        return id;
    }


// setting the student's id
    public void setId(int id) {
        this.id = id;
    }

//  getting the student's name
    public String getName() {
        return name;
    }

//  Getting the student's score
    public String getScore() {
        return getScore();
    }


//  Gets date of birth of the student
    public int getYear_of_birth() {
        return year_of_birth;
    }

//  sets date of birth
    public void setDate_of_birth(int year_of_birth) {
        this.year_of_birth = year_of_birth;
    }

//  Method for student to take course
    public String takeCourse(Course course) {
        courses.add(course);
        return course.getName();
    }
}
