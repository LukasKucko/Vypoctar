
package sk.lukas;
import java.util.Scanner;

public class StvorecObvod {


   Scanner sc = new Scanner(System.in);
   int a, b;
   
   public void stvorecObvod(){
   System.out.println("Zadaj prve cislo:");
   a = sc.nextInt();
   
   System.out.println("Obvod štvorca je: " + 4*a);
   
   
   
  sc.close();
 }
}
