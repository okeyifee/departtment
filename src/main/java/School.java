
import java.util.*;


/**
 * This is a school object having the characteristics of a school.
 * It implement Teachers and Students using an ArrayList.
 */


public class School implements Approval {
    private static String name;
    private static Principal principal;
    private static List<NonAcademic> nonacademics;
    private static List<Teacher> teachers;
    private static List<Student> students;
    private static List<Course> courses;
    private static List<Class> classes;
    private static List<Applicant> applicants;


//   creates a new school object.

    public School(String name, Principal principal) {
        this.name = name;
        this.principal = principal;
        this.teachers = new ArrayList<Teacher>();
        this.nonacademics = new ArrayList<NonAcademic>();
        this.students = new ArrayList<Student>();
        this.courses = new ArrayList<Course>();
        this.classes = new ArrayList<Class>();
        this.applicants = new ArrayList<Applicant>();
    }

    public School() {

    }

    public String getName() {
        return name;
    }

    public static Principal getPrincipal() {
        return principal;
    }

    public static List<NonAcademic> getNonacademics() {
        return nonacademics;
    }

    public String addNon_academic(NonAcademic nonacademic) {
        this.nonacademics.add(nonacademic);
        return nonacademic.getName();
    }


    public static List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public static List<Teacher> getTeachers() {
        return teachers;
    }

    public void addTeacher(Teacher teacher) {
        this.teachers.add(teacher);
    }
    public List<NonAcademic> getNonAcademics() {
        return nonacademics;
    }

    public void addNonAcademic(NonAcademic nonacademic) {
        this.nonacademics.add(nonacademic);
    }

    public static List<Applicant> getApplicants() {
        return applicants;
    }


// This method will add applicants to the applicants list.
    public int addApplicant(Applicant applicant) {
        this.applicants.add(applicant);
        int index = applicants.size();
        return index;
    }

    public static List<Course> getCourses() {
        return courses;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public static List<Class> getClasses() {
        return classes;
    }

    public void addClass(Class newClass) {
        classes.add(newClass);
    }

    @Override
    public void view() {

    }
}
