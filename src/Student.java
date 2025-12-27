public final class Student extends Human implements IStudy {
    private String major;
    private float gpa;

    private final String university = "NU";

    public Student(int age, String name, boolean active, String major, float gpa) {
        super(age, name, active);
        this.major = major;
        this.gpa = gpa;
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + name + ", age " + age + ". I study " + major + ".");
    }

    @Override
    public String getRole() {
        return "Student";
    }

    @Override
    public void study() {
        System.out.println(name + " studies at " + university + ".");
    }

    @Override
    public String getStudyInfo() {
        return "Major: " + major + ", GPA: " + gpa + ", University: " + university;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public final void printStudentCard() {
        System.out.println("Student card -> Name: " + name + ", Major: " + major + ", GPA: " + gpa);
    }
}
