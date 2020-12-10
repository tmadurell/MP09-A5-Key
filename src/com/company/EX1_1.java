package com.company;

import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Scanner;

public class EX1_1 {
    public void mostrar() {
        System.out.println("1.1.Afegeix a la classe d’utilitats de criptografia de l’activitat A4 el mètode 1.2.1 randomGenerate del apunts.");
        System.out.println("   i.Genera un parell de claus (KeyPair) de 1024bits, i utilitza-les per xifrar i desxifrar un missatge. \n" +
                            "   ii.Fes que el missatge a xifrar s’entri pel teclat.\n" +
                            "   iii.Fes servir els mètodes getPublic i getPrivate per obtenir les claus i el mètodes derivats d’aquestes claus i observa quines dades aporten.\n");

        KeyPair keypair = Xifrar.randomGenerate(1024);

        Scanner input = new Scanner(System.in);

        System.out.print("Missatge a xifrar:  ");
        byte[] msg = input.nextLine().getBytes();

        PublicKey publickey = keypair.getPublic();
        PrivateKey privatekey = keypair.getPrivate();

        byte[] datos = Xifrar.encryptData(msg, publickey);
        System.out.println("Missatge xifrat: " + new String(datos));

        System.out.println("Missatge desxifrat: " + Xifrar.decryptData(datos, privatekey));

    }
}

