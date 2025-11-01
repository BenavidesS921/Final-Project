import java.util.Scanner;

public class InputValidation
{
    public static int getValidInt(String prompt, int min, int max)
    {
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        //input.close();
        try {
            int value = Integer.parseInt(userInput);
            if (value < min || value > max)
            {
                throw new IllegalArgumentException("Input out of range.");
            }
            return value;
        } catch (Exception e) {
            
            System.out.println("Error: " + e.getMessage());
            return getValidInt(prompt, min, max);
        }
        
    }
}
