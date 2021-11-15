/**
 * Función de la excepción
 * @author Noemí
 */

package com.tec.propios.tryexception;

public class SaludoException extends Exception{

    /**
     * Recibe un mensaje que luego despliega como una excepción
     * @param message
     */
        public SaludoException(String message) {
            super(message);
        }
    }

