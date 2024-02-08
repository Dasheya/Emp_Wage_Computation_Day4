import java.util.Random;

public class EmpSwitchCase {
    public static void main(String[] argu) {
        int empPerHour=20;
        int empHours;
        int empWage;

        Random random = new Random();
        int empPresent = random.nextInt(2);

        switch (empPresent){
            case 0:
                empHours = 8;
                empWage=empPerHour*empHours;
                System.out.println("Full Time:"+empWage);
                break;
            case 1:
                empHours = 4;
                empWage=empPerHour*empHours;
                System.out.println("Half Time:"+empWage);
                break;
            default:
                empHours=0;
                empWage=empPerHour*empHours;
                System.out.println("Employee absent:"+empWage);

        }

    }
}
