package com.infinitycorp.utils;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class OpenWebPage {

    public static void openWebPage(String urlString) {
        try {
            // Converte a String para um URI
            URI uri = new URI(urlString);
            // Verifica se o Desktop é suportado
            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();
                // Abre a página
                desktop.browse(uri);
            } else {
                System.err.println("Desktop não suportado.");
            }
        } catch (URISyntaxException e) {
            System.err.println("URL inválido: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Erro ao tentar abrir a página: " + e.getMessage());
        }
    }
}