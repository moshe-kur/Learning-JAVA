public class PersonClass {

     String name;
     int age;
     char gender;
     float height;
     boolean isStudent;

    public PersonClass(String newName, int newAge, char newGender, float newHeight, boolean newIsStudent) {
        name = newName;
        age = newAge;
        gender = newGender;
        height = newHeight;
        isStudent = newIsStudent;
    }
    public void run() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Gender: " + this.gender);
        System.out.println("Height: " + this.height);
        System.out.println("Is a student: " + this.isStudent);
        this.age++;
        System.out.println("New Age: " + this.age);

    }
}
