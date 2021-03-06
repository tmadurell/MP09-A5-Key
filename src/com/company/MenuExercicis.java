package com.company;

import java.util.Scanner;

public class MenuExercicis {
    public void mostrar() throws Exception {

        Scanner scanner = new Scanner(System.in);
        int opcio;

        do {

            System.out.println("");
            System.out.println("---------------------------------------------------------");
            System.out.println("MP09-UF1 A5 Keystore,KeyPair & WrappedKey:");
            System.out.println("Exercicis:\n");
            System.out.println(" 1.Parell de claus, KeyStore i PublicKey");
            System.out.println(" 2.Clau embolcallada (1.2.3)");
            System.out.println(" 3.Sortir");
            System.out.println("---------------------------------------------------------");
            System.out.print("  Escriu aquí: ");


            opcio = scanner.nextInt();
            scanner.nextLine();

            switch (opcio) {
                case 1:
                    new EX1().mostrar();
                    break;
                case 2:
                    new EX2().mostrar();
                    break;
                case 3:
                    System.exit(0);
                    return;
                default:
                    System.out.println("Opció no valida");
                    System.out.println("Solament pots escriure un número del 1-3");
                    break;
            }
        } while (opcio != 3);
    }
}
