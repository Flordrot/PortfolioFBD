package com.portfolioFBD.Exceptions;

public class UserNoEncontradoException extends Exception {

    public UserNoEncontradoException() {
    }

    public UserNoEncontradoException(Integer id) {
        super("No se encontrĂ³ un usuario con id = " + id);
    }
}
