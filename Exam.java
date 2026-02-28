package InnerClasses;
import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
public class Exam {
    void evaluate(int marks){
        class GradeCalculator{
            String Calculate(){
                if(marks >= 75) return "Distinction";
                else if(marks >= 60) return "First Class";
                else return "Pass";
            }
        }
        GradeCalculator gc = new GradeCalculator();
        System.out.println(gc.Calculate());
    }

    void displayExamDate(){
        LocalDate date = LocalDate.now();
        System.out.println("The Exam date is:"+ date);

    }

    public static void main(String[] args) {
        Exam exam = new Exam();
        exam.evaluate(67);
        exam.evaluate(89);
        exam.displayExamDate();
    }
}
/*
1️⃣points to reamember
⭐Grade logic is scoped to the evaluate method
⭐it avoids polluting the class with helper method
⭐It helps in the desiegning the codebase in a cleaner way
 */