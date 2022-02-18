import java.util.Scanner;

public class input
{
    public static void main(String[] args)
    {
        // Nothing here.
    }
    public String strInput(String title)
    {
        System.out.println(title);
        Scanner input = new Scanner(System.in);
        String text;
        text = input.nextLine();
        return text;
    }

    public int intInput(String title){
        System.out.println(title);
        Scanner input = new Scanner(System.in);
        String text;
        int integer;
        text = input.nextLine();
        try {
            integer = Integer.parseInt(text);
            return integer;
        }
        catch (NumberFormatException exc) {
            System.out.println("Write a number!");
            int num = intInput(""); // your title.
            return num;
        }

    }
}
