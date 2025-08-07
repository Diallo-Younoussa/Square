import java.util.Scanner;

public class Racine{
    public static void main (String[]args){
        /*Calculate the area of a rectangle  */
             double width = 0;
             double length = 0;
             double area = 0;

    Scanner scanner = new Scanner (System.in);
        System.out.println("welcome");
        System.out.println("what is the width: ");
        width= scanner.nextDouble();

        System.out.println("what is the length: ");
        length= scanner.nextDouble();

        area= width * length;

    
    System.out.println("the area is: "+area + "cm carré ");
        
 scanner.close();
    }
}
