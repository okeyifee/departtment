import java.util.*;

public abstract class NonAcademic extends Staff implements Approval{

//  NonAcademic class constructor
    public NonAcademic(String role, String name, String gender, Integer SSN) {
        super(role, name, gender,SSN);
    }
}
