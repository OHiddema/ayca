package objects_and_classes;

/*
 * (**) Implement the classes Student and ReportCard. Each	method in both
 * classes has a comment before it, explaining what	it does. Once you
 * completed both classes print the ReportCard's for given students. Your
 * output may vary	slightly depending the values you choose for painting.
 */

public class GradeReport {

    public void run() {
        Student s0 = new Student("Enis Sert", "20101234", 75, 85);
        Student s1 = new Student("Emre Unal", "20105678", 100, 65);
        Student s2 = new Student("Serkan Ozkul", "20109876", 85, 95);

        new ReportCard(s0);
        new ReportCard(s1);
        new ReportCard(s2);
    }
}