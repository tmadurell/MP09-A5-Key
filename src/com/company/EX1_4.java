package com.company;

import java.security.KeyStore;

public class EX1_4 {
    public void mostrar() throws Exception {
        System.out.println("1.4.Llegir una clau asimètrica del keystore i extreure’n la PublicKey. Imprimir-la per pantalla.\n"+
                "Podeu crear una funció igual que en el punt 3 fent sobrecàrrega)\n");

        String ksFilePath = "/home/dam2a/.keystore";
        String password = "passwd";

        KeyStore ks = Xifrar.loadKeyStore(ksFilePath, password);

        System.out.println(Xifrar.getPublicKey(ks, "lamevaclauM9", password));
    }

}
