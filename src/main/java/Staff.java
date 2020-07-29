import java.util.*;

public class Staff extends School{
//    initializing variables
    private String role;
    protected String name;
    private String gender;
    protected Integer SSN;

//    Constructors for staff class
    public Staff(String role, String name, String gender, int SSN ) {
        this.role = role;
        this.name = name;
        this.gender = gender;
        this.SSN = SSN;
    }

    public Staff() {

    }

    //  getters
    public int getSSN() {
        return SSN;
    }

    public String getRole() {
        return role;
    }

    public String getName() {
        return name;
    }

    public int getgender() {
        return SSN;
    }

}
