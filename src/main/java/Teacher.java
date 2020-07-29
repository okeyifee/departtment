import java.util.*;

// This is a teacher object with characteristics of teachers of the school.
public abstract class Teacher extends Staff implements Approval{

    public Teacher(String role, String name, String gender, int SSN) {
        super(role, name,gender, SSN);
        addToList(this);
    }

    public Teacher() {
        super();
    }

    public String create(Course title) {
        return title.getName();
    }

    public String create(Class newClass){
        return newClass.getCourse();
    }

    public void view() {
    }

    public String getName() {
        return super.getName();
    }

    public String teach() {
        return teach();
    }

    public abstract String teach(Course title);


//   adds teacher to teachers array list
    private void addToList(Teacher teacher) {
        School.getTeachers().add(teacher);
    }
}
