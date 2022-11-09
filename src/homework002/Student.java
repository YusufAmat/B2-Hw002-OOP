package homework002;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private int[] grades;

    public Student(String firstName, String lastName, int age, int[] grades) {
        this.firstName = firstName;
        this.lastName = lastName;
        setAge(age);
        this.grades = grades;
    }

    public Student() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public void showInfo() {
        System.out.printf("%s %s %d\n", getFirstName(), getLastName(), getAge());
    }

    public double getGPA() {
        double sum = 0.0;
        for (int grade : getGrades()) {
            sum += grade;
        }
        return sum / getGrades().length;
    }
}
