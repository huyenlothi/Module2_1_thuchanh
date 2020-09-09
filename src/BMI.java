import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your weight (in kilogram):");
        double weight = scanner.nextDouble();
        System.out.println("Your height (in meter):");
        double height = scanner.nextDouble();
        double bmi = weight / Math.pow(height,2);
        if (bmi<18) {
            System.out.println(" bmi = " + bmi + " Underweight");
        }else if (bmi<25) {
            System.out.println("bmi = " + bmi + " Normal");
        }else if(bmi<30) {
            System.out.println("bmi = " + bmi + " overweight");
        }else
            System.out.println("bmi = " + bmi + " Obese");
//        System.out.printf("%-20s%s", "bmi", "Interpretation\n");
//        if (bmi < 18)
//            System.out.printf("%-20.2f%s", bmi, "Underweight");
//        else if (bmi < 25.0)
//            System.out.printf("%-20.2f%s", bmi, "Normal");
//        else if (bmi < 30.0)
//            System.out.printf("%-20.2f%s", bmi, "Overweight");
//        else
//            System.out.printf("%-20.2f%s", bmi, "Obese");
        }
    }

