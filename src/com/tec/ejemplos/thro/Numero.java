/**
 * Indica si el número ingresado está dentro del parametro especificado
 */

package com.tec.ejemplos.thro;

public class Numero {
    /**
     * Compara la nota y si el estudiante reprobó, devuelve una excepción,
     * si no, imprime un mensaje diferente.
     * @param numero
     */
    public void notas(int numero){
        if(numero < 1 || numero > 10) { // si la nota cumple con esto, manda un error indicando que se reprobó el curso
            throw new ArithmeticException("Número no válido");
        }else{
            System.out.println("Número correcto"); // en caso contrario, imprime Curso superado
        }
    }

    /**
     * Método que llama al método que realiza la operación
     * @param args
     */
    public static void main(String[] args) {
        //Scanner teclado = new Scanner(System.in);
        //int num1;
        //System.out.println("Ingrese un número del 1 al 10");
        //num1 = teclado.nextInt();
        Numero s = new Numero();
        s.notas(15);
    }
}

