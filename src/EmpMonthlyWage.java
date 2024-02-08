import java.util.Random;

public class EmpMonthlyWage {
    public static void main(String[] argu) {
            int empPerHour = 20;
            int workingDays=20;
            int empFullTime;
            int empWage;

            Random random = new Random();
            boolean empPresent = random.nextBoolean();

            if (empPresent == true) {
                empFullTime = 8;
                empWage =  empFullTime*empPerHour*workingDays;
                System.out.println("Employee Wage of the Day:" + empWage);

            } else {
                System.out.println("Employee Absent:");
            }
        }
    }
