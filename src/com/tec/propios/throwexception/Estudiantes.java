/**
 * Verifica si un estudiante está matriculado o no
 */

package com.tec.propios.throwexception;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Estudiantes {

    /**
     * Llama a la función que verifica si el nombre está en la lista y si no llama
     * a la función que despliega la excepcion, con el mensaje correspondiente
     * @param nombre
     */
    public void validarNombre(String nombre) {
        if (!nombreCorrecto(nombre)) {
            throw new IncorrectNameException("Estudiante no encontrado");
        }else{
            System.out.println("El estudiante está matriculado");
        }
    }

    /**
     * Verifica si el nombre está en la lista
     * @param nombre
     * @return boolean
     */
    private boolean nombreCorrecto(String nombre) {
        List<String> nombresEstudiantes = Arrays.asList("Andrea", "Mariana", "Julia", "Pedro", "Camilo", "Esteban", "Lorena");
        if (nombresEstudiantes.contains(nombre.substring(nombre.indexOf("@") + 1))) {
            return true;
        }
        return false;
    }

    /**
     * Crea las instancias y manda a llamar a la función que inicia el proceso de verificación
     * @param args
     */
    public static void main(String[] args) {
        //Scanner s = new Scanner(System.in);
        //String student;
        //System.out.println("Ingrese el nombre de un estudiantes");
        //student = s.nextLine();
        Estudiantes p = new Estudiantes();
        p.validarNombre("Noemí");

    }
}
