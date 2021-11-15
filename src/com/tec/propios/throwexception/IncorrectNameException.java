/**
 * Función de la excepción
 */

package com.tec.propios.throwexception;


public class IncorrectNameException extends RuntimeException{

    /**
     * Recibe un mensaje que luego despliega como una excepción
     * @param message
     */
        public IncorrectNameException(String message) {
            super(message);
        }
    }

