package sk.lukas;
import java.util.Scanner;

public class StvorecObsah {


   Scanner sc = new Scanner(System.in);
   int a, b;
   
   public void stvorecObsah(){
   System.out.println("Zadaj prve cislo:");
   a = sc.nextInt();
   System.out.println("Obsah stvorca je: " + a*a);
    
  sc.close();
 }
}
