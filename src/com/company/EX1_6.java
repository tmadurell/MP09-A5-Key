package com.company;

import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;

public class EX1_6 {
    public void mostrar() throws Exception {
        System.out.println("1.6.Fer una funció que donades unes dades, una signatura i la PublicKey, comprovi la validesa de la informació. (funció dels apunts 1.3.2)\n");

        byte [] data = "missatge".getBytes();

        KeyPair keypair = Xifrar.randomGenerate(1024);
        PrivateKey privatekey = keypair.getPrivate();
        PublicKey publickey = keypair.getPublic();

        byte[] signature = Xifrar.signData(data, privatekey);

        boolean valid = Xifrar.validateSignature(data, signature, publickey);
        System.out.println(valid? "La informació és válida" : "La informació no és válida");
    }
}