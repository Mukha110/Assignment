import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Employee empoloyee1 = new Employee(23, "Azamat", false, "Electric", 780000f);
        Human AsHuman = new Employee(40, "Azat", false, "Manager", 453000f);
        IWork AsWork = new Employee(30, "Mukhtar", false, "teacher", 250000f);
        Student student1 = new Student(23, "Beksultan", true, "Computer Science", 2.2f);
        Human sAsHuman = new Student(18, "Ayaulym", false, "Information Systems", 3.8f);
        IStudy sAsStudy = new Student(20, "Era", true, "Software Engineering", 2.4f);
        empoloyee1.introduce();
        System.out.println(empoloyee1.getRole());
        System.out.println(empoloyee1.getName());
        System.out.println(empoloyee1.getWorkInfo());
        empoloyee1.study();
        System.out.println(empoloyee1.getStudyInfo());
        student1.introduce();
        System.out.println(student1.getRole());
        student1.study();
        System.out.println(student1.getStudyInfo());
        student1.printStudentCard();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter new gpa for student " + student1.getName() + ": ");
        int newAge = scanner.nextInt();
        student1.setAge(newAge);
        System.out.println("Updated gpa: " + student1.getAge());
        AsHuman.introduce();
        sAsHuman.introduce();
        AsWork.work();
        sAsStudy.study();
        scanner.close();
    }
}