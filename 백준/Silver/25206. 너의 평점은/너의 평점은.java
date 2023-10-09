import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sum = 0;
        double totalCredits = 0;

        for (int i = 0; i < 20; i++) {
            String courseName = scan.next();
            double credit = scan.nextDouble();
            String grade = scan.next();
            double gradePoint = 0.0;

            switch (grade) {
                case "A+":
                    gradePoint = 4.5;
                    break;
                case "A0":
                    gradePoint = 4.0;
                    break;
                case "B+":
                    gradePoint = 3.5;
                    break;
                case "B0":
                    gradePoint = 3.0;
                    break;
                case "C+":
                    gradePoint = 2.5;
                    break;
                case "C0":
                    gradePoint = 2.0;
                    break;
                case "D+":
                    gradePoint = 1.5;
                    break;
                case "D0":
                    gradePoint = 1.0;
                    break;
                case "F":
                    gradePoint = 0.0;
                    break;
                case "P":
                    gradePoint = 0.0;
                    credit = 0.0;
                    break;
                default:
                    System.out.println("Invalid grade: " + grade);
                    continue;
            }
            sum += credit * gradePoint;
            totalCredits += credit;
        }
        double gpa = sum / totalCredits;
        System.out.printf("%f%n", gpa);
    }
}
