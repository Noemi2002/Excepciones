/**
 * Comprueba si la palabra ingresada en la forma correcta de decir Hola en Uzbeko
 * @author Noemí
 */

package com.tec.propios.tryexception;


public class ComprobarSaludo {

    /**
     * Hace la comprobación y si la palabra no es correcta manda la excepcion
     * @param palabra
     */
    public void ComprobarSaludo(String palabra) {
        String correcta = "Salom";
        try{
            if(palabra == correcta){
                System.out.println("¡Correcto!");
            }else{
                throw new SaludoException("Palabra incorrecta");
            }
        }catch (SaludoException e){
            System.out.println("Hubo un error: " + e);

        }
    }

    /**
     * Manda a llamar al método que hace la comparación
     * @param args
     */
    public static void main(String[] args) {
        ComprobarSaludo j = new ComprobarSaludo();
        j.ComprobarSaludo("Hello");

        }
    }

