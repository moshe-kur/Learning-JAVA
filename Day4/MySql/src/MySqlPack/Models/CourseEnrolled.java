package MySqlPack.Models;

public class CourseEnrolled {
    private String name;
    private int numberOfStudent;

    public CourseEnrolled(String name,int numberOfStudent){
        this.name=name;
        this.numberOfStudent=numberOfStudent;
    }

    @Override
    public String toString() {
        String details = "Name: "+this.name+" Number Of Student: "+ this.numberOfStudent;
        return details;
    }
}
