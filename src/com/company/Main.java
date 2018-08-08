package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cursus cursus = new Cursus();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geef naam van cursist: ");
        String naam = scanner.nextLine();
        //addCursist voegt een cursist toe (wanneer de cursus niet vol zit)
        cursus.addCursist(naam);
        System.out.printf("Aantal cursisten: %d%n", cursus.getAantalCursisten());
        while (!cursus.zitCursusVol()){
            System.out.print("Geef naam van cursist: ");
            naam = scanner.nextLine();
            cursus.addCursist(naam);
            System.out.printf("Aantal cursisten: %d%n", cursus.getAantalCursisten());
        }
        System.out.println("De cursisten: ");
        int aantalCursisten = cursus.getAantalCursisten();
        for (int i = 0; i < aantalCursisten; i++) {
            System.out.println(cursus.getCursist( i + 1));
        }
        //Wanneer we een volgnr invullen dat niet bestaat => return null
        String nietAanwezig = cursus.getCursist(aantalCursisten + 1);
        System.out.printf("Cursist die niet bestaat: %s", nietAanwezig);

    }
}
