package InnerClasses;

public class Univeristy {
    static class Admission {
        static boolean isEligible(int marks) {
            return marks >= 60;
        }
    }

        public static void main(String[] args) {
            boolean result1 = Univeristy.Admission.isEligible(45);
            System.out.println(result1);
            boolean result2 = Univeristy.Admission.isEligible(63);
            System.out.println(result2);

        }
        }

