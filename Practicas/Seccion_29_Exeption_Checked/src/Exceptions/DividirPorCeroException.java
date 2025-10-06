package Exceptions;

// las exceptions tiene el nombre final Exceptions
public class DividirPorCeroException extends Exception {
    @Override
    public String getMessage() {
        return "No se puede dividir entre cero";
    }

}
