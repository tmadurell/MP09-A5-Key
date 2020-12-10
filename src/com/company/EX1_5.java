package com.company;

import java.security.KeyPair;
import java.security.PrivateKey;

public class EX1_5 {
    public void mostrar() throws Exception {
        System.out.println("1.5.Fer un funció que donades unes dades i una PrivateKey retorni la signatura.\n" +
                " Usa-la i mostra la signatura per pantalla. (funció dels apunts 1.3.1)\n");

        byte [] data = "missatge".getBytes();

        KeyPair keypair = Xifrar.randomGenerate(1024);
        PrivateKey privatekey = keypair.getPrivate();

        byte[] signature = Xifrar.signData(data, privatekey);

        System.out.println("Signatura: " + new String(signature));
    }
}