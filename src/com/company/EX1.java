package com.company;

import java.io.IOException;
import java.util.Scanner;

public class EX1 {
    public void mostrar() throws IOException {
        Scanner scanner = new Scanner(System.in);
        int opcio;
        boolean res = true;
        System.out.println("1.Parell de claus, KeyStore i PublicKey\n");

        do{

            System.out.println("");
            System.out.println("---------------------------------------------------------");
            System.out.println("MP09-UF1 A5 Keystore,KeyPair & WrappedKey:");
            System.out.println("1.Afegeix a la classe d’utilitats de criptografia de l’activitat A4 el mètode 1.2.1 randomGenerate del apunts.");
            System.out.println("2. Clau embolcallada (1.2.3)");
            System.out.println("3. Sortir");
            System.out.println("---------------------------------------------------------");
            System.out.print("Escriu aquí: ");


            opcio = scanner.nextInt();
            scanner.nextLine();

            switch (opcio) {
                case 1:
                    new EX1_1().mostrar();
                    break;
                case 2:
                    new EX2().mostrar();
                    break;
                case 3:
                    System.exit(0);
                    return;
                default:
                    System.out.println("Opció no valida");
                    System.out.println("Solament pots escriure el número 1 i 2");
                    break;
            }
        } while (opcio!=3);
    }

}
