package MySqlPack.Models;

public class Course {
    private int courseId;
    private String courseName;
    private String courseDescription;
    private String instructorName;

    public Course(int courseId, String courseName, String courseDescription, String instructorName) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseDescription = courseDescription;
        this.instructorName = instructorName;
    }
    public Course() {
    }
    public String getCourseName() {
        return this.courseName;
    }
    public String getinstructorName() {
        return this.courseName;
    }
    public void setCourseName(String name) {
        this.courseName=name;
    }
    public void setinstructorName(String name) {
        this.courseName=name;
    }
}
