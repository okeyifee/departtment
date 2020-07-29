import java.util.*;



public class Applicant extends School{

//    initializing variables
    private String name;
    private int score;
    private int year_of_birth;

//   constructors for the parameters
    public Applicant(String name, int score, int year_of_birth) {
        this.name = name;
        this.score = score;
        this.year_of_birth = year_of_birth;
        addToList(this);
    }

// getting and setting method

//   gets the Name parameter and returns it
    public String getNameStudent() {
        return name;
    }

//   gets the Name parameter and returns it
    public int getScore() {
        return score;
    }

//    gets the age parameter and returns it
    public int getYear_of_birth() {
        return year_of_birth;
    }

//   adds applicant to applicant's array list
    private void addToList(Applicant applicant) {
        School.getApplicants().add(applicant);
    }

//  Method to select course
    public void selectCourse(String course){
        System.out.printf("You have selected %s as your preferred course of study. proceed to apply by dropping your Application.\n", getApplicants().indexOf(course));
    }

//    Method to apply
    public void apply() {
        System.out.printf("My name is %s and i am applying to your School. THANKS...\n", getApplicants().indexOf(name));
    }

}
