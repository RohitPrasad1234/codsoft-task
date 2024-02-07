import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the English marks:");
        int eng = scanner.nextInt();
        System.out.println("Enter the Hindi marks:");
        int hin = scanner.nextInt();
        System.out.println("Enter the Science marks:");
        int sci = scanner.nextInt();
        System.out.println("Enter the Social Science marks:");
        int ss = scanner.nextInt();
        System.out.println("Enter the Math marks:");
        int math = scanner.nextInt();

        int total = totalCalculator(eng, hin, sci, ss, math);
        double average = total / 5.0;
        double percentage = (total / 500.0) * 100;
        char grade = calculateGrade(percentage);

        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
    }

    public static int totalCalculator(int eng, int hin, int sci, int ss, int math) {
        return eng + hin + sci + ss + math;
    }

    public static char calculateGrade(double percentage) {
        if (percentage >= 90) {
            return 'A';
        } else if (percentage >= 80) {
            return 'B';
        } else if (percentage >= 70) {
            return 'C';
        } else if (percentage >= 60) {
            return 'D';
        } else if (percentage >= 40) {
            return 'E';
        } else {
            return 'F';
        }
    }
}
