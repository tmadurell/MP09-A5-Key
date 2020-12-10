package com.company;

import java.io.IOException;
import java.util.Scanner;

public class EX2 {
    public void mostrar() throws Exception {
        Scanner scanner = new Scanner(System.in);
        int opcio;


        do{

            System.out.println("");
            System.out.println("---------------------------------------------------------");
            System.out.println("MP09-UF1 A5 Keystore,KeyPair & WrappedKey:");
            System.out.println(" 2.Clau embolcallada (1.2.3)\n");
            System.out.println("    1.Implementeu dels apunts els mètodes encryptWrappedData i decryptWrappedData, i comenteu el codi identificant\n     els elements de la imatge (és a dir, posar el text de dins els requadres en el tros de codi que correspongui):");
            System.out.println("    2.Genereu un parell de claus (KeyPair) i proveu de xifrar i desxifrar un text amb clau embolcallada");
            System.out.println("    3.Enrere");
            System.out.println("    4.Sortir");
            System.out.println("---------------------------------------------------------");
            System.out.print("Escriu aquí: ");


            opcio = scanner.nextInt();
            scanner.nextLine();

            switch (opcio) {
                case 1:
                    new EX2_1().mostrar();
                    break;
                case 2:
                    new EX2_2().mostrar();
                    break;
                case 3:
                    new MenuExercicis().mostrar();
                    break;
                case 4:
                    System.exit(0);
                    return;
                default:
                    System.out.println("Opció no valida");
                    System.out.println("Solament pots escriure un número del 1-4");
                    break;
            }
        } while (opcio!=4);
    }

}
