import java.util.Scanner;

public class MaxNumFind {

    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the numbers separated by spaces:");
        
        String inputLine = scanner.nextLine();
        
        String[] inputStrings = inputLine.split(" ");
        
        int maxNumber = Integer.MIN_VALUE;

        for (String str : inputStrings) {
            try {
                int number = Integer.parseInt(str);
                
                if (number > maxNumber) {
                    maxNumber = number;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format: " + str);
                return;
            }
        }

        System.out.println("The maximum number is: " + maxNumber);
        
    }
}
