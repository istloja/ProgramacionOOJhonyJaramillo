package Programa;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;

public class Menu {

    public void presentarMenu() {
        System.out.println("Ingrse un numero segun el archivo que desea verificar");
        System.out.println("1: Escritorio");
        System.out.println("2: Documentos");
        System.out.println("3: Imagenes");
        System.out.println("4: Videos");
        System.out.println("5: Musica");
    }

    public int obtenerOpcion() {
        boolean valido = false;
        int opcion = 0;
        do {
            presentarMenu();
            Scanner entrada = new Scanner(System.in);
            try {
                opcion = Integer.parseInt(entrada.next());
                if (opcion > 0 & opcion <= 5) {
                    valido = true;
                } else {
                    valido = false;
                    System.out.println("El rango debe estar entre 1 y 5");
                }
            } catch (Exception e) {
                valido = false;
                System.out.println("Opcion no valida");
            }
        } while (!valido);

        return opcion;
    }

    public void presentarArchivos() {
        int opcion = obtenerOpcion();
        switch (opcion) {

            case 1:
                System.out.println("escritorio");
                leerArchivo("*");
                break;
            case 2:
                System.out.println("documentos");
                leerArchivo("doc");
                break;
            case 3:
                System.out.println("imagenes");
                leerArchivo("jpg");
                break;
            case 4:
                System.out.println("videos");
                leerArchivo("mp4");
                break;
            case 5:
                System.out.println("musica");
                leerArchivo("mp3");
                break;
            default:
                System.out.println("Opcion no valida");

        }

    }

    public void leerArchivo(String extension) {
        File carpeta = new File("C:\\Users\\Usuario\\Desktop");
        String[] archivos;
        if (extension.equals("*")) {
            archivos = carpeta.list();
        } else {
            archivos = carpeta.list(new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    return name.toLowerCase().endsWith("." + extension);
                }
            });
        }
        for (int i = 0; i < archivos.length; i++) {
            System.out.println(archivos[i]);
        }
    }
}
