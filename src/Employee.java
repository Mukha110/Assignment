public class Employee extends Human implements IWork, IStudy {
    private String position;
    private float salary;

    private static String company = "Hogwarts";

    public Employee(int age, String name, boolean active, String position, float salary) {
        super(age, name, active);
        this.position = position;
        this.salary = salary;
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + name + ", age " + age + ". I work as " + position + ".");
    }

    @Override
    public String getRole() {
        return "Employee";
    }

    @Override
    public void work() {
        System.out.println(name + " works as " + position + " at " + company + ".");
    }

    @Override
    public String getWorkInfo() {
        return "Position: " + position + ", Salary: " + salary;
    }

    @Override
    public void study() {
        System.out.println(name + " studies while working.");
    }

    @Override
    public String getStudyInfo() {
        return "Studies at: " + company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public static String getCompany() {
        return company;
    }

    public static void setCompany(String company) {
        Employee.company = company;
    }
}
