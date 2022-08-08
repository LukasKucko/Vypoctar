package sk.lukas;
import java.util.Scanner;

public class ObdlznikObsah {


   Scanner sc = new Scanner(System.in);
   int a, b;
   
   public void obdlznikObsah(){
   System.out.println("Zadaj prve cislo:");
   a = sc.nextInt();
   System.out.println("Zadaj druhe cislo:");
   b = sc.nextInt();
   System.out.println("Obsah odĺžniku je: " + (a*b));
    
  sc.close();
 }
}
