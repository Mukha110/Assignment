public abstract class Human {

    protected int age;
    protected String name;
    protected boolean isMan;

    public Human(int age, String name, boolean isMan) {
        this.age = age;
        this.name = name;
        this.isMan = isMan;
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + ", age " + age + ".");
    }

    public abstract String getRole();

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }
}