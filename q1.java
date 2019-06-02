import java.util.Scanner;

public class innput
{
    public static void main(String args[])
    {
        Scanner t= new Scanner(System.in);
        while(t--)
        {
            Scanner name= new Scanner(System.in);
            Scanner roll= new Scanner(System.in);
            System.out.println(name.nextLine());
            System.out.println(roll.nextLine());
        }
    }
}