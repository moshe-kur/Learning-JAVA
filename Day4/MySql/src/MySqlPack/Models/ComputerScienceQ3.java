package MySqlPack.Models;

public class ComputerScienceQ3 {
    private String firstName;
    private String lastName;
    private String courseName;


    public ComputerScienceQ3(String firstName,String lastName,String courseName ){
        this.firstName=firstName;
        this.lastName=lastName;
        this.courseName=courseName;
    }

    @Override
    public String toString() {
        String details = "first Name: "+this.firstName+", last Name: "+ this.lastName+", course Name: "+ this.courseName;
        return details;
    }
}
