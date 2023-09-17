public class Student {
    String name,stuNo;
    int classes;
    Course math;
    Course phys;
    Course chem;
    double average;
    boolean isPass;

    public Student(String name, int classes, String stuNo, Course math, Course phys, Course chem){
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.math = math;
        this.phys = phys;
        this.chem = chem;
        calcAverage();
        this.isPass = false;
    }

    public void addBulkExamNote(int math, int phys, int chem) {

        if (math >= 0 && math <= 100) {
            this.math.note = math;
        }

        if (phys >= 0 && phys <= 100) {
            this.phys.note = phys;
        }

        if (chem >= 0 && chem <= 100) {
            this.chem.note = chem;
        }
    }

    public void addQuizNote(int math, int phys, int chem) {

        if (math >= 0 && math <= 100) {
            this.math.quizNote = math;
        }

        if (phys >= 0 && phys <= 100) {
            this.phys.quizNote = phys;
        }

        if (chem >= 0 && chem <= 100) {
            this.chem.quizNote = chem;
        }
    }

    public void isPass() {
        if (this.math.note == 0 || this.phys.note == 0 || this.chem.note == 0) {
            System.out.println("The notes are not completed.");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Grade average: " + this.average);
            if (this.isPass) {
                System.out.println("Student passed.");
            } else {
                System.out.println("Student failed.");
            }
        }
    }

    public void calcAverage() {
        this.math.courseAverage = this.math.note * 0.8 + this.math.quizNote * 0.2;
        this.phys.courseAverage = this.phys.note * 0.8 + this.phys.quizNote * 0.2;
        this.chem.courseAverage = this.chem.note * 0.8 + this.chem.quizNote * 0.2;

        this.average = (math.courseAverage + phys.courseAverage + chem.courseAverage) / 3;
    }

    public boolean isCheckPass() {
        calcAverage();
        return this.average > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Student Name : " + this.name);
        System.out.println("Mathematics Note : " + this.math.note);
        System.out.println("Physics Note : " + this.phys.note);
        System.out.println("Chemistry Note : " + this.chem.note);
    }
}





