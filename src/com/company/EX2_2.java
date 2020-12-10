package com.company;

import java.io.IOException;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;

public class EX2_2 {
    public void mostrar() throws IOException {
        System.out.println("2.2.Genereu un parell de claus (KeyPair) i proveu de xifrar i desxifrar un text amb clau embolcallada\n");

        byte [] data = "missatge".getBytes();

        KeyPair keypair = Xifrar.randomGenerate(1024);
        PrivateKey privatekey = keypair.getPrivate();
        PublicKey publickey = keypair.getPublic();

        byte [][] encWrappedData = Xifrar.encryptWrappedData(data, publickey);
        byte [] decWrappedData = Xifrar.decryptWrappedData(encWrappedData, privatekey);

        System.out.println("Missatge xifrat: " + new String(encWrappedData[0]));
        System.out.println("Clau xifrada: " + new String(encWrappedData[1]));
        System.out.println("Missatge original desxifrat: " + new String(decWrappedData));
    }

}
