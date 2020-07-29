import java.util.*;
public class Principal extends Staff implements Approval {

//  principal class constructor
    public Principal(String role, String name, String gender, int SSN) {
        super(role, name, gender, SSN);

    }

    public Principal() {

    }

    //  method in principal class for admitting student
    public String admitStudent(String name) {
        Student student = null;
        List<Applicant> applicants = School.getApplicants();
        
        for (int i = 0; i < applicants.size(); i++) {
            Applicant currentApplicant = applicants.get(i);
            if (currentApplicant.getNameStudent().equals(name)) {
                student = new Student(currentApplicant.getName(),currentApplicant.getScore(), currentApplicant.getYear_of_birth());
            }
        }
        List<Student> students = School.getStudents();
        int length = students.size();
        students.add(student);
        System.out.println(students.toString());
        return students.get(length).getName();
    }

//  method in principal class for expelling student
    public String expelStudent(String name) {
        List<Student> students = School.getStudents();
        students.remove(name);
        return "";
    }

    @Override
    public void view() {

    }
}
