package objects_and_classes;

public class Student {

    private String name;
    private String id;
    private double comp130;
    private double math203;

    /* Constructor: it takes a string for students name, a string for students id, a double
     * for comp130 grade and a double for math203 grade.
     */
    public Student(String s_name, String s_id, double total_comp130, double total_math203) {
        this.name = s_name;
        this.id = s_id;
        this.comp130 = total_comp130;
        this.math203 = total_math203;
    }

    /* getStudentName: returns student's name */
    public String getStudentName() {
        return name;
    }

    /* getStudentId: returns student's id */
    public String getStudentId() {
        return id;
    }

    /* getComp130Grade: returns letter grade for comp130 */
    public String getComp130Grade() {
        return letterGrade(comp130);
    }

    /* getMath203Grade: returns letter grade for math203 */
    public String getMath203Grade() {
        return letterGrade(math203);
    }

    /* letterGrade: returns letter grade for given score
     * 90 <= score        -> A
     * 80 <= score <   90 -> B
     * 70 <= score <   80 -> C
     * 60 <= score <   70 -> D
     *       score <   60 -> F
     */
    private String letterGrade(double score) {
        if (score < 60) return "F";
        if (score < 70) return "D";
        if (score < 80) return "C";
        if (score < 90) return "B";
        return "A";
    }
}