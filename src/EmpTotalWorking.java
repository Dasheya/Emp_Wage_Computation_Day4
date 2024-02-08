import java.util.Random;

public class EmpTotalWorking {
    public static void main(String[] args) {
        int empPerHour = 20; // Rate per hour
        int workingDaysInMonth = 20; // Assuming 20 working days in a month
        int maxWorkingHours = 100;   // Maximum working hours in a month
        int totalWorkingHours = 0;
        int totalWorkingDays = 0;

        Random random = new Random();

        while (totalWorkingHours < maxWorkingHours && totalWorkingDays < workingDaysInMonth) {
            int empPresent = random.nextInt(3); // Generating random 0, 1, or 2

            int empHours;

            switch (empPresent) {
                case 0:
                    empHours = 8;
                    break;
                case 1:
                    empHours = 4;
                    break;
                default:
                    empHours = 0;
            }

            totalWorkingHours=totalWorkingHours + empHours;
            totalWorkingDays++;
        }

        int empWage = empPerHour * totalWorkingHours;

        System.out.println("Total Working Hours: " + totalWorkingHours);
        System.out.println("Total Working Days: " + totalWorkingDays);
        System.out.println("Monthly Wage: " + empWage);
    }
}
