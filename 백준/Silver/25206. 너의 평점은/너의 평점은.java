import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, Double> gradePoints = new HashMap<>();
        gradePoints.put("A+", 4.5);
        gradePoints.put("A0", 4.0);
        gradePoints.put("B+", 3.5);
        gradePoints.put("B0", 3.0);
        gradePoints.put("C+", 2.5);
        gradePoints.put("C0", 2.0);
        gradePoints.put("D+", 1.5);
        gradePoints.put("D0", 1.0);
        gradePoints.put("F", 0.0);

        double totalPoints = 0.0;
        double totalCredits = 0.0;

        for (int i = 0; i < 20; i++) {
            String subject = scanner.next();
            double credit = scanner.nextDouble();
            String grade = scanner.next();

            if (grade.equals("P")) {
                continue;
            }

            double gradePoint = gradePoints.get(grade);
            totalPoints += credit * gradePoint;
            totalCredits += credit;
        }

        double gpa = totalPoints / totalCredits;
        System.out.printf("%.6f", gpa);
    }
}
