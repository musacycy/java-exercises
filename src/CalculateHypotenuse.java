
import java.util.Scanner;


public class CalculateHypotenuse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double firstSide;
        double secondSide;
        System.out.println("Please input number of the first side :");
        firstSide = scanner.nextDouble();
        System.out.println("Please input number of the second side :");
        secondSide = scanner.nextDouble();
        
        double hypotenuse = Math.sqrt((firstSide*firstSide)+(secondSide*secondSide));
        System.out.println("Hypotenuse of the Triangele is :"+hypotenuse);
        
        
       
                
    }
    
}
