
public class Course {
    // Atribut
    private String courseName;
    private int credit;
    private String instructorName;

    // Constructor dengan validasi untuk credit
    public Course(String courseName, int credit, String instructorName) {
        if (credit < 0) {
            throw new IllegalArgumentException("Credit cannot be negative.");
        }
        this.courseName = courseName;
        this.credit = credit;
        this.instructorName = instructorName;
    }

    // Method displayinfo()
    public void displayinfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Credit: " + credit);
        System.out.println("Instructor Name: " + instructorName);
    }

    // Getter dan Setter
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCredit() {
        return credit;
    }

    // Setter untuk credit dengan validasi
    public void setCredit(int credit) {
        if (credit < 0) {
            throw new IllegalArgumentException("Credit cannot be negative.");
        }
        this.credit = credit;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    // Membuat course
Course math = new Course("Mathematics", 3, "Dr. Smith");
Course physics = new Course("Physics", 4, "Prof. Johnson");

// Membuat student
Student student = new Student("Alice", "12345");

// Menambah course ke student
student.addCourse(math);
student.addCourse(physics);

// Menampilkan info
student.displayInfo();

// Membuat course
Course math = new Course("Mathematics", 3, "Dr. Smith");

// Membuat student
Student student = new Student("Alice", "12345");
student.addCourse(math);
student.introduce(); // Output: I am a student. My name is Alice and my student ID is 12345.

// Membuat lecturer
Lecturer lecturer = new Lecturer("Dr. Smith", "L67890");
lecturer.addTaughtCourse(math);
lecturer.introduce(); // Output: I am a lecturer. My name is Dr. Smith and my lecturer ID is L67890.

}
