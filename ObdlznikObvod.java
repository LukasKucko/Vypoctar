package sk.lukas;
import java.util.Scanner;

public class ObdlznikObvod {
   
   Scanner sc = new Scanner(System.in);
   int a, b;
   
   public void obdlznikObvod(){
   System.out.println("Zadaj prve cislo:");
   a = sc.nextInt();
   System.out.println("Zadaj druhe cislo:");
   b = sc.nextInt();
   System.out.println("Obvod odĺžniku je: " + ((2*a)+(2*b)));
  sc.close();
 }
}
