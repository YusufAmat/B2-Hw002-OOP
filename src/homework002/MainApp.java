package homework002;

public class MainApp {
    public static void main(String[] args) {

        Student s1 = new Student("Ahmet", "Dursun", 47, new int[]{51, 63, 76});
        Student s2 = new Student("Saba", "Gitsin", 50, new int[]{20, 30, 36});

        s1.showInfo();
        s2.showInfo();
        System.out.printf("%5.2f\n", Math.max(s1.getGPA(), s2.getGPA()));

    }
}
