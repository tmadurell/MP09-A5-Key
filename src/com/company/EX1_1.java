package com.company;

import java.io.IOException;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Scanner;

public class EX1_1 {
    public void mostrar() throws IOException {
        System.out.println("1.1.Afegeix a la classe d’utilitats de criptografia de l’activitat A4 el mètode 1.2.1 randomGenerate del apunts.\n");

        KeyPair keypair = Xifrar.randomGenerate(1024);

        Scanner input = new Scanner(System.in);

        System.out.print("Mensaje a encriptar:  ");
        byte[] msg = input.nextLine().getBytes();

        PublicKey publickey = keypair.getPublic();
        PrivateKey privatekey = keypair.getPrivate();

        byte[] datos = Xifrar.encryptData(msg, publickey);
        System.out.println("Mensaje encriptado: " + new String(datos));

        System.out.println("Mensaje desencriptado: " + Xifrar.decryptData(datos, privatekey));

    }
}

