
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Lütfen Kilonuzu giriniz :");
        int weight = scanner.nextInt();
        
        System.out.print("Lütfen Boyunuzu Giriniz :");
        
        double height = scanner.nextDouble();
        double bmi = weight/(height*height);
        
        System.out.println("Beden Kitle İndeksiniz : "+bmi);
    }
    
}
