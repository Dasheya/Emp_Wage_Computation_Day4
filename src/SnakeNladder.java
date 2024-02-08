import java.util.Random;

public class SnakeNladder {
    public static void main(String[] argu) {
        int finishLine = 100;
        int currentPosition = 0;
        int totalDiceRolls = 0;
        Random random = new Random();

        while (currentPosition < finishLine) {
            // Simulate a dice roll (generate a random number between 1 and 6)
            int dice = random.nextInt(6) + 1;

            // Simulate the option (0 for No Play, 1 for Ladder, 2 for Snake)
            int option = random.nextInt(3);

            // Update the current position based on the option
            switch (option) {
                case 0:
                    // No Play - do nothing
                    break;
                case 1:
                    // Ladder - move forward if within the finish line
                    if (currentPosition + dice <= finishLine) {
                        currentPosition = currentPosition + dice;
                    }
                    break;
                case 2:
                    // Snake - move backward but not below 0
                    currentPosition = Math.max(0, currentPosition - dice);
                    break;
            }

            // Increment the total number of dice rolls
            totalDiceRolls++;

            // Print the current position after each move
            System.out.println("After Dice Roll: " + currentPosition);
        }

        // Print the total number of dice rolls required to reach or exceed the finish line
        System.out.println("Total Dice Rolls: " + totalDiceRolls);
    }
}