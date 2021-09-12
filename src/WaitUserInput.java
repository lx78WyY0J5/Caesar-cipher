import java.util.Scanner;

public class WaitUserInput
{
    public static String WaitUserInput()
    {
        Scanner userInput = new Scanner(System.in);
        return userInput.nextLine();
    }
}