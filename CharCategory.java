import java.util.Scanner;

public class CharCategory {

    public static void main(String[] args) {
        int uppercaseCount = 0;
        int lowercaseCount = 0;
        int digitCount = 0;
        int otherCount = 0;

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a Charactor:");

        String input = scanner.nextLine();
        
        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                uppercaseCount++;
            } else if (Character.isLowerCase(c)) {
                lowercaseCount++;
            } else if (Character.isDigit(c)) {
                digitCount++;
            } else {
                otherCount++;
            }
        }

        System.out.println("Number of uppercase letters: " + uppercaseCount);
        System.out.println("Number of lowercase letters: " + lowercaseCount);
        System.out.println("Number of digits: " + digitCount);
        System.out.println("Number of other characters: " + otherCount);
        
    }
}

