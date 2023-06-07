package MySqlPack.Models;

import java.sql.Date;

public class Student {
    private int student_id;
    private String first_name;
    private String last_name;
    private String email;
    private Date date_of_birth;
    public Student(int student_id, String first_name, String lastName, String email, Date dateOfBirth) {
        this.student_id = student_id;
        this.first_name = first_name;
        this.last_name = lastName;
        this.email = email;
        this.date_of_birth = dateOfBirth;
    }
    public Student() {
    }
    public int getStudentId() {
        return this.student_id;
    }

    public String getFirstName() {
        return this.first_name;
    }

    public String getLastName() {
        return this.last_name;
    }

    public String getEmail() {
        return this.email;
    }
    public Date getDateOfBirth() {
        return this.date_of_birth;
    }

    public void setFirstName(String firstName) {
        this.first_name = firstName;
    }
    public void setLastName(String lastName) {
        this.last_name = lastName;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.date_of_birth = dateOfBirth;
    }
}
