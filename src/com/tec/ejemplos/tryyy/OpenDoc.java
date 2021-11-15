/**
 * Abre un archivo word
 */

package com.tec.ejemplos.tryyy;
import java.io.IOException;

public class OpenDoc {

    /**
     * Busca e intenta abrir el archivo de la ruta específicada
     * @param ruta
     */
    public void abrir(String ruta){
        try{ //Intenta abrir el archivo
            Runtime.getRuntime().exec("cmd /c start "+ruta);

        }catch(IOException e){ //Devuelve una excepcion si no lo encuentra
            e.printStackTrace();
        }
    }

    /**
     * Manda a llamar al método abrir
     * @param args
     */
    public static void main(String[] args) {
            //Se especifica una ruta para el archivo
            String file = new String("C:\\Users\\noemi\\Documents\\HW1.docx");
            OpenDoc a = new OpenDoc();
            a.abrir(file);


        }
}


