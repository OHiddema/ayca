package objects_and_classes;

public class ReportCard {

    /* Constructor: it take a Student s and adds GLabels for student's
     * name, id, comp130 and math203 grade. It also puts a GRect around
     * the labels.
     */
    public ReportCard(Student s) {
        System.out.println(s.getStudentName());
        System.out.println(s.getStudentId());
        System.out.println("COMP.130: " + s.getComp130Grade());
        System.out.println("MATH.203: " + s.getMath203Grade());
    }
}