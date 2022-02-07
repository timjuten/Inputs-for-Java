import java.util.Scanner;

public class input
{
    public static void main(String[] args)
    {
        String text = strInput("Введіть слово");
        System.out.println(text);
    }
    public static String strInput(String argument)
    {
        System.out.println(argument);
        Scanner input = new Scanner(System.in);
        String text;
        text = input.nextLine();
        return text;
    }
}
