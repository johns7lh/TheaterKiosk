import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
       //num age
        //
        //		Output "Enter your age: "
        //		Input age
        //
        //		If age >= 21 then
        //			Output "You get a wrist band!"

        int age = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your age: ");
        if(in.hasNextInt()){
            age = in.nextInt();
            in.nextLine();
            if (age >= 21) {
                System.out.println("You get a wrist band!");
            }
            }
    }
}