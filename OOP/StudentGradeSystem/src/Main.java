public class Main {
    public static void main(String[] args) {
        Course math = new Course ("Mathemaics", "MAT101", "maths");
        Course phys = new Course ("Physics", "PHY101", "phys");
        Course chem = new Course ("Chemistry", "CHE101", "chem");

        Teacher t1 = new Teacher("First Teacher", "0000", "maths");
        Teacher t2 = new Teacher("Second Teacher", "0001", "phys");
        Teacher t3 = new Teacher("Third Teacher", "0002", "chem");

        math.addTeacher(t1);
        phys.addTeacher(t2);
        chem.addTeacher(t3);

        Student s1 = new Student("Student 1", 3, "1001", math, phys, chem);
        s1.addBulkExamNote(50,20,40);
        s1.addQuizNote(50,60,70);
        s1.isPass();

        Student s2 = new Student("Student 2", 3, "1002", math, phys, chem);
        s2.addBulkExamNote(100,50,40);
        s2.addQuizNote(50,60,70);
        s2.isPass();

        Student s3 = new Student("Student 3", 3, "1003", math, phys, chem);
        s3.addBulkExamNote(100,50,40);
        s3.addQuizNote(50,60,70);
        s3.isPass();
    }
}