package MySqlPack;

import MySqlPack.Models.ComputerScienceQ3;
import MySqlPack.Models.Course;
import MySqlPack.Models.CourseEnrolled;
import MySqlPack.Models.Student;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        try {
            String dataBase ="forjava";
            Mysql db = new Mysql(dataBase);
            db.connecting();

            String query;
            ResultSet result;

            //Ex1
            /*
            query= "SELECT * FROM students where YEAR(date_of_birth) = 1994";
            result= db.executeQuery(query);
            List<Student> studentList= new ArrayList<Student>();
            while (result.next()){
                int studentId = result.getInt("student_id");
                String firstName = result.getString("first_name");
                String lastName = result.getString("last_name");
                String email = result.getString("email");
                Date dateOfBirth = result.getDate("date_of_birth");

                Student student = new Student(studentId,firstName,lastName,email,dateOfBirth);
                studentList.add(student);
            }
            for (Student student: studentList) {
                System.out.println("student "+student.getStudentId()+" is: " + student.getFirstName()+" "+student.getLastName()+", Email: "+student.getEmail()+", Date: "+student.getDateOfBirth());
            }*/

            //Ex2
            /*
            query= "SELECT course_name, count(s.course_id) as numberOfStudent FROM courses c" +
                    " left join studentcourse s on c.course_id = s.course_id" +
                    " group by c.course_name;";
            result= db.executeQuery(query);
            List<CourseEnrolled> courseEnrolledListc= new ArrayList<CourseEnrolled>();
            while (result.next()){
                String name = result.getString(1);
                int num = result.getInt(2);

                CourseEnrolled courseEnrolled= new CourseEnrolled(name,num);
                courseEnrolledListc.add(courseEnrolled);
            }
            for (CourseEnrolled courseEnrolled: courseEnrolledListc) {
                System.out.println(courseEnrolled.toString());
            }
            */

            //Ex3
            /*
            query= "select s.first_name, s.last_name, c.course_name as course_name from studentcourse st" +
                    " left join students s on s.student_id = st.student_id" +
                    " left join courses c on c.course_id = st.course_id" +
                    " where course_name = \"Computer Science\"";
            result= db.executeQuery(query);
            List<ComputerScienceQ3> computerScienceQ3List= new ArrayList<ComputerScienceQ3>();
            while (result.next()){
                String firstName = result.getString(1);
                String lastName = result.getString(2);
                String courseName = result.getString(3);


                ComputerScienceQ3 computerScienceQ3= new ComputerScienceQ3( firstName, lastName, courseName );
                computerScienceQ3List.add(computerScienceQ3);
                System.out.println(computerScienceQ3.toString());
            }*/

            //Ex4
            /*
            query= "SELECT email from students " +
                    "where first_name like \"J%\" and last_name like \"D%\"";
            result= db.executeQuery(query);
            List<Student> students= new ArrayList<Student>();
            while (result.next()){
                String email = result.getString(1);

                Student student = new Student();
                student.setEmail(email);
                students.add(student);
                System.out.println(student.getEmail());
            }*/


            //Ex5
            /*
            query= "SELECT course_name,instructor_name FROM courses " +
                    "where instructor_name like \"Professor Brown\"";
            result= db.executeQuery(query);
            List<Course> courses= new ArrayList<Course>();
            while (result.next()){
                String course_name = result.getString(1);
                String instructor_name = result.getString(2);

                Course course= new Course();
                course.setCourseName(course_name);
                course.setinstructorName(instructor_name);
                courses.add(course);
                System.out.println(course.getCourseName()+" By: "+course.getinstructorName());
            }*/

            //Ex6
            /*
            query= "SELECT s.student_id, s.first_name, s.last_name " +
                    "FROM Students s " +
                    "WHERE s.student_id IN ( " +
                    "    SELECT sc.student_id " +
                    "    FROM StudentCourse sc " +
                    "    JOIN Courses c ON sc.course_id = c.course_id " +
                    "    WHERE c.course_name = 'History') " +
                    "AND s.student_id IN ( " +
                    "    SELECT sc.student_id " +
                    "    FROM StudentCourse sc " +
                    "    JOIN Courses c ON sc.course_id = c.course_id " +
                    "    WHERE c.course_name = 'Mathematics');";
            result= db.executeQuery(query);
            List<Student> students= new ArrayList<Student>();
            String lines ="";
            while (result.next()){
                int Id = result.getInt(1);
                String first = result.getString(2);
                String last = result.getString(3);

                Student student= new Student(Id,first,last,null,null);
                students.add(student);
                System.out.println("Id: "+student.getStudentId()+", First Name: "+student.getFirstName()+", Last Name: "+student.getLastName());
                lines+="Id: "+student.getStudentId()+", First Name: "+student.getFirstName()+", Last Name: "+student.getLastName()+"\n";
            }
            BufferedWriter writer = new BufferedWriter(new FileWriter("SqlEx6.txt"));
            writer.write(lines);
            writer.close();
            */


            //Ex7
            query= "SELECT s.student_id, s.first_name, s.last_name " +
                    "FROM Students s " +
                    "where student_id not in ( " +
                    "select student_id from studentcourse) ";
            result= db.executeQuery(query);
            List<Student> students= new ArrayList<Student>();
            while (result.next()){
                int Id = result.getInt(1);
                String first = result.getString(2);
                String last = result.getString(3);

                Student student= new Student(Id,first,last,null,null);
                students.add(student);
                System.out.println("Id: "+student.getStudentId()+", First Name: "+student.getFirstName()+", Last Name: "+student.getLastName());
            }


            db.closeConnection();

        } catch (SQLException e) {
            System.out.println(e);
            //throw new RuntimeException(e);
        }
        /* catch (IOException e) {
            throw new RuntimeException(e);
        }
        */
    }
}
