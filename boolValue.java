// Import java.util

import java.util.Scanner;

public class boolValue {
    
    // Main method

    public static void main(String[] args) {
        
        // Create scanner object

        Scanner scanner = new Scanner(System.in);

        // Enter value

        System.out.println("True or false?");
        boolean value = Boolean.valueOf(scanner.nextLine());

        // Print value

        System.out.println("Wow, is very " + value);

    }

}
