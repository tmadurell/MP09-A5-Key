package com.company;

import java.security.PublicKey;

public class EX1_3 {
    public void mostrar() throws Exception {
        System.out.println("1.3.Fes un funció que donat un fitxer amb un certificat (.cer) retorni la seva PublicKey. Usa aquesta funció i mostra per pantalla les dades de la PublicKey llegida.\n");

        String pathCer = "/home/dam2a/premis/jordi.cer";
        PublicKey pk = Xifrar.getPublicKey(pathCer);

        System.out.println(pk);
    }
}