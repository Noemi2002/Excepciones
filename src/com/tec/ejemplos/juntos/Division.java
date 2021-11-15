/**
 * Realiza una operación de división
 */

package com.tec.ejemplos.juntos;

class Division {

    /**
     * Realiza la división de los números de entrada
     * @param a
     * @param b
     */
    public void divide(int a, int b) {
        System.out.println("Supongamos que esto es una calculadora que solo divide");
        System.out.println("Se enciende la calculadora");
        try { //Se intenta realizar la división
            int resultado=a/b;
            System.out.println(resultado);
        } catch (Exception e) { //Si no cumple, se imprime una excepcion
            throw new ArithmeticException("La división no se pudo efectuar");
        }finally { //Se cierra el programa  sí o sí, aunque mande la excepcion
            System.out.println("Se apaga la calculadora");
        }
    }

    /**
     * Manda a llamar al método divide
     * @param args
     */
    public static void main(String[] args) {
        int a =5;
        int b=0;
        Division c = new Division();
        c.divide(a, b);
    }
}



