import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("""
                Subjects:
                -----------
                Maths, Physics, Chemistry, English, History, Music
                ------------------------------------------------------------""")
        ;

        int math, phys, chem, tr, hist, music;

        System.out.print("Enter your MATHS grade: ");
        math = scan.nextInt();
        if(math<0 && math>100){
            math=0;
        }

        System.out.print("Enter your PHYSICS grade: ");
        phys = scan.nextInt();
        if(phys<0 && phys>100){
            phys=0;
        }

        System.out.print("Enter your CHEMISTRY grade: ");
        chem = scan.nextInt();
        if(chem<0 && chem>100){
            chem=0;
        }

        System.out.print("Enter your TURKISH grade: ");
        tr = scan.nextInt();
        if(tr<0 && tr>100){
            tr=0;
        }

        System.out.print("Enter your HISTORY grade: ");
        hist = scan.nextInt();
        if(hist<0 && hist>100){
            hist=0;
        }

        System.out.print("Enter your MUSIC grade: ");
        music = scan.nextInt();
        if(music<0 && music>100){
            music=0;
        }

        double average = (math + phys + chem + tr + hist + music) / 6.0;
        System.out.println("Your average: " + average);

        if (average < 55) {
            System.out.println("You failed the class :(");
        } else
            System.out.println("CONGRATS! You passed the class :))");
    }
}