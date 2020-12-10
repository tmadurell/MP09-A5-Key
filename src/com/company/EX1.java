package com.company;

import java.util.Scanner;

public class EX1 {
    public void mostrar() throws Exception {
        Scanner scanner = new Scanner(System.in);
        int opcio;


        do{

            System.out.println("");
            System.out.println("---------------------------------------------------------");
            System.out.println("MP09-UF1 A5 Keystore,KeyPair & WrappedKey:");
            System.out.println(" 1.Parell de claus, KeyStore i PublicKey.\n");
            System.out.println("    1.Afegeix a la classe d’utilitats de criptografia de l’activitat A4 el mètode 1.2.1 randomGenerate del apunts.");
            System.out.println("    2.Keystore (loadKeystore 1.4 apunts)");
            System.out.println("    3.Fes un funció que donat un fitxer amb un certificat (.cer) retorni la seva PublicKey. Usa aquesta funció i mostra per pantalla les dades de la PublicKey llegida.");
            System.out.println("    4.Llegir una clau asimètrica del keystore i extreure’n la PublicKey. Imprimir-la per pantalla.\n" +
                               "    Podeu crear una funció igual que en el punt 3 fent sobrecàrrega)");
            System.out.println("    5.Fer un funció que donades unes dades i una PrivateKey retorni la signatura. Usa-la i mostra la signatura per pantalla. (funció dels apunts 1.3.1)");
            System.out.println("    6.Fer una funció que donades unes dades, una signatura i la PublicKey, comprovi la validesa de la informació. (funció dels apunts 1.3.2)");
            System.out.println("    7.Enrere");
            System.out.println("    8.Sortir");
            System.out.println("---------------------------------------------------------");
            System.out.print("Escriu aquí: ");


            opcio = scanner.nextInt();
            scanner.nextLine();

            switch (opcio) {
                case 1:
                    new EX1_1().mostrar();
                    break;
                case 2:
                    new EX1_2().mostrar();
                    break;
                case 3:
                    new EX1_3().mostrar();
                    break;
                case 4:
                    new EX1_4().mostrar();
                    break;
                case 5:
                    new EX1_5().mostrar();
                    break;
                case 6:
                    new EX1_6().mostrar();
                    break;
                case 7:
                    new MenuExercicis().mostrar();
                    break;
                case 8:
                    System.exit(0);
                    return;
                default:
                    System.out.println("Opció no valida");
                    System.out.println("Solament pots escriure un número del 1-8");
                    break;
            }
        } while (opcio!=8);
    }

}
