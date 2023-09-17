public class Course {
    String name;
    String code;
    String prefix;
    int note;
    int quizNote;
    double courseAverage;
    Teacher courseTeacher;
    public Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.courseAverage = 0;
    }
    public void addTeacher(Teacher t){
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(t.name + " academic can't teach this course");
        }
    }
    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " academician of mathematics : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " academician could not be assigned to this course.");
        }
    }
}
