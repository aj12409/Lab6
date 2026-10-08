import java.util.Scanner;

public class ABC {
    public static void main (String[] args){
    Scanner in=new Scanner(System.in);
    double side1=0;
    double side2=0;
    double side3=0;
    double side4=0;
    double area=0;
    double perimeter=0;
    double diagonal=0;
    String trash;
    System.out.println("Enter the length for side 1:");
    System.out.println("Enter the length for side 2:");
    System.out.println("Enter the length for side 3:");
    System.out.println("Enter the length for side 4:");

  if(in.hasNextDouble())
    {
        side1=in.nextDouble();
    }
    else
    {
        trash = in.nextLine();
        System.out.println("You entered an invalid value" + trash);
        System.out.println("Run the program again and enter a correct value");
        System.exit(0);
    }
    if(in.hasNextDouble())
    {
        side2=in.nextDouble();
    }
    else
    {
        trash = in.nextLine();
        System.out.println("You entered an invalid value" + trash);
        System.out.println("Run the program again and enter a correct value");
        System.exit(0);
    }
    if(in.hasNextDouble())
    {
        side3=in.nextDouble();
    }
    else
    {
        trash = in.nextLine();
        System.out.println("You entered an invalid value" + trash);
        System.out.println("Run the program again and enter a correct value");
        System.exit(0);
    }
    if(in.hasNextDouble())
    {
        side4=in.nextDouble();
    }
    else
    {
        trash = in.nextLine();
        System.out.println("You entered an invalid value" + trash);
        System.out.println("Run the program again and enter a correct value");
        System.exit(0);
    }

        //Calculate the area
        area=side1*side2;

        //Calculate the perimeter
        perimeter=side1+side2+side3+side4;

        //Calculate the diagonal//
         diagonal=Math.sqrt((side1 * side1) + (side2 * side2));

        System.out.println("The area is " +  area);
        System.out.println("The perimeter is "+  perimeter);
        System.out.println("The diagonal is "+  diagonal);

    }
    }
