package MySqlPack.Models;

public class StudentCourse {
    private int studentId;
    private int courseId;
    public StudentCourse(int studentId,int courseId){
        this.studentId=studentId;
        this.courseId=courseId;
    }

    public int getCourseId() {
        return this.courseId;
    }

    public int getStudentId() {
        return this.studentId;
    }
}
