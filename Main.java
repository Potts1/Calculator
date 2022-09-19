import java.util.Scanner;


public class Main
{
    public static Scanner coordinate = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        while (true)
        {
            System.out.print("[1]Power\n[2]Distance\n[3]Quadratic\nWhich will you like to do: ");
            String answer = coordinate.nextLine();
            
            if (answer.contains("ower") || answer.equals("1")){power();} 
            else if (answer.contains("istance") || answer.equals("2")){distance();}
            else if (answer.contains("uadratic") || answer.equals("3")){quadratic();}


            else {System.out.println("Invalid response. Type in the type\nof equation or corresponding number.");}
        }
        
    }

    public static void quadratic()
    {
        Quadratic quadratic;
        int[] quadraticList = new int[3];
        
        System.out.print("Enter in a, b, and c for the quadratic (seperate with spaces): ");
        
        quadraticList = getLetters(coordinate.nextLine());
        quadratic = new Quadratic(quadraticList[0], quadraticList[1], quadraticList[2]);

        System.out.println(quadratic);
    }

    private static int[] getLetters(String equation)
    {
        char[] cEquation = equation.toCharArray();
        int listSpot = 0;
        int[] list = new int[3];
        String number = "";
        
        for (int i = 0; i < cEquation.length; i++)
        {
            
            if (cEquation[i] == ' ')
            {
                list[listSpot] = Integer.valueOf(number);
                listSpot++;
                number = "";
            }
            else
            {
                number += String.valueOf(cEquation[i]);
            }

            
        }

        list[listSpot] = Integer.valueOf(number);

        return list;
    }

    public static void power()
    {
        Power10 power10;
        
        System.out.print("Enter in the number: ");
        double number = Double.parseDouble(coordinate.nextLine());
        
        try
        { 
            System.out.print("Enter in the power: ");
            int power = Integer.parseInt(coordinate.nextLine());
            
            power10 = new Power10(number, power);
        }
        catch (Exception l)
        {
            power10 = new Power10((int)number);
        }
        
        System.out.println(power10);
    }
    
    public static void distance()
    {
        double[] coordinate1 = new double[2];
        double[] coordinate2 = new double[2];
      
        System.out.print("Enter in coordinates (separate with space): ");
        coordinate1 = getCoordinate(coordinate.nextLine().toCharArray());
      
        System.out.print("Enter in next set of coordinates: ");
        coordinate2 = getCoordinate(coordinate.nextLine().toCharArray());

        Distance distance = new Distance(coordinate1, coordinate2);
        System.out.println(distance);
    }
    
    private static double[] getCoordinate(char[] coordinates)
    {
        String number = "";
        double[] stuff = new double[2];

        for (int i = 0; i < coordinates.length; i++)
        {
          number += String.valueOf(coordinates[i]);

          if (coordinates[i] == ' ')
          {
              stuff[0] = Double.parseDouble(number);
              number = "";
          }
        }
      
        stuff[1] = Double.parseDouble(number);

        return stuff;
    }
}