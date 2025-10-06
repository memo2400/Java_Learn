package Exceptions;

public class CalculadoraExeption extends Exception {

    String descripcion;

    public CalculadoraExeption(String descripcion) {           
        setDescripcion(descripcion);
    }

    @Override
    public String getMessage(){
        return getDescripcion();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    
}
