package sk.lukas;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    // inicializacia premennych a scanner
    Scanner sc = new Scanner(System.in);
    int vyberZmenu, vyberZmenu2, vyberZmenu3;

    // metody na vypocet
    StvorecObsah stvorecObsah = new StvorecObsah();
    StvorecObvod stvorecObvod = new StvorecObvod();
    ObdlznikObvod obdlznikObvod = new ObdlznikObvod();
    ObdlznikObsah obdlznikObsah = new ObdlznikObsah();

    // Vyber si z moznosti 1.obdlznik alebo 2.Štvorec

    Menu menu = new Menu();
    menu.menu();

    // zadanie vyberu
    System.out.println("Zadaj číslo: ");
    vyberZmenu = sc.nextInt();

    // vyber obdlznik
    if (vyberZmenu == 1) {
      System.out.println("Vyber si: 1.obvod\n          2.obsah");
      vyberZmenu2 = sc.nextInt();

      // vyber obdlznik obvod
      if (vyberZmenu2 == 1) {
        obdlznikObvod.obdlznikObvod();

        // vyber obdlznik obsah
      } else if (vyberZmenu2 == 2) {
        obdlznikObsah.obdlznikObsah();
      }
    }
    // vyber stvorec
    else if (vyberZmenu == 2) {
      System.out.println("Vyber si: 1.obvod\n          2.obsah     ");
      vyberZmenu3 = sc.nextInt();

      // vyber stvorec obvod
      if (vyberZmenu3 == 1) {
        stvorecObvod.stvorecObvod();

        // vyber stvorec obsah
      } else if (vyberZmenu3 == 2) {
        stvorecObsah.stvorecObsah();
      }
    }

    sc.close();
  }
}
