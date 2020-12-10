package com.company;

import java.security.*;
import java.util.Enumeration;

public class EX1_2 {
    public void mostrar() throws Exception {
        System.out.println("Exercici 1.2.");
        System.out.println("i. Fés la lectura d’un dels keystore que tinguis al teu sistema i extreu-ne la següent informació:\n");

        String ksFilePath = "/home/dam2a/.keystore";
        String password = "passwd";

        KeyStore ks= Xifrar.loadKeyStore(ksFilePath, password);

        System.out.println(ks);

        // 1.2.i.1. Tipus de keystore que és (JKS, JCEKS, PKCS12, ...)
        System.out.println("\nTipus de keystore: " + ks.getType());

        // 1.2.i.2. Mida del magatzem (quantes claus hi ha?)
        System.out.println("\nMida: " + ks.size());

        // 1.2.i.3. Àlies de totes les claus emmagatzemades
        Enumeration<String> aliases = ks.aliases();

        System.out.print("\nÀlies de les claus: ");
        while(aliases.hasMoreElements()){
            System.out.print(aliases.nextElement()+"  ");
        }

        // 1.2.i.4. El certificat d’una de les claus
        System.out.println("\nCertificat: " + ks.getCertificate("lamevaclauM9"));

        // 1.2.i.5. L'algorisme de xifrat d’alguna de les claus
        System.out.println("\n\nAlgoritme de 'lamevaclauM9 : " + ks.getCertificate("lamevaclauM9").getPublicKey().getAlgorithm());



    }
}