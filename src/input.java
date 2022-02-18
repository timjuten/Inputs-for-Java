import java.util.Scanner;

public class input
{
    public static void main(String[] args)
    {

    }
    public String strInput(String argument)
    {
        System.out.println(argument);
        Scanner input = new Scanner(System.in);
        String text;
        text = input.nextLine();
        return text;
    }

    public int intInput(String argument){
        System.out.println(argument);
        Scanner input = new Scanner(System.in);
        String text;
        int integer;
        text = input.nextLine();
        try {
            integer = Integer.parseInt(text);
            return integer;
        }
        catch (NumberFormatException exc) {
            System.out.println("Введіть число!");
            int num = intInput("Введіть число: ");
            return num;
        }

    }
}
