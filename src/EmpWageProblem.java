import java.util.Random;
import java.util.Scanner;

public class EmpWageProblem {
    public static void main(String[] argu){
        Random random=new Random();
        boolean empPresent = random.nextBoolean();
        if (empPresent){
            System.out.println("Employe is Present");

        }else{
            System.out.println(("Employee is absent"));
        }


    }
}
