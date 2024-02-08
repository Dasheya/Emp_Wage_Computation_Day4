import java.util.Random;

public class EmpPartTime {
    public static void main(String[] argu) {
        int empPerHour=20;
        int empPartTime;
        int empFullTime;
        int empWage;
        Random random = new Random();
        boolean empPresent = random.nextBoolean();

        if (empPresent==true) {
            empFullTime=8;
            empWage=empFullTime*empPerHour;
            System.out.println("Employee Wage Full Time wage:"+empWage);

        } else {
            empPartTime=4;
            empWage=empPartTime*empPerHour;
            System.out.println("Employee Part time wage:"+empWage);

        }
    }
}
