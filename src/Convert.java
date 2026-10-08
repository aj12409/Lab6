port java.util.Scanner;

public class Convert {
    public static void main (String[] args){
        Scanner in= new Scanner(System.in);
        double far=0;
        double cels=50;
        String trash;
        System.out.println("Enter the temperature in celscius:");

        if(in.hasNextDouble())
        {
            cels=in.nextDouble();
            far=cels*9/5+32;
           System.out.println("The temperature in farhenheit "+ far);
        }
        else
        {
            trash= in.nextLine();
            System.out.println("You said your temperature was "+ trash);
            System.out.println("Run the program again and enter a correct temperature");
            System.exit(0);
        }
    }
}
