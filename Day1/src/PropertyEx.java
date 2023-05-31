public class PropertyEx {
    private String name;
    private int age;
    private boolean isStudent;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setStudent(boolean student) {
        this.isStudent = student;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean getIsStudent() {
        return isStudent;
    }
    public void setAllProperty(String Name,int Age,boolean Student) {
        this.name = Name;
        this.age = Age;
        this.isStudent = Student;
    }

//    public PropertyEx getAllProperty() {
//        return this.getAllProperty();
//    }

}
