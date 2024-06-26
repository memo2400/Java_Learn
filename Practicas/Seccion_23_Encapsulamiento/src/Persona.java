

public class Persona {
  

     /*
      * Atributos
      * Si estan Private no se puede acceder a ellos desde fuera      
      */

     private String nombre;
     private String apellido;
     private int edad;
     

    /*
    * Metodo
    * 
    */

    // 04:11:40
    // Constructor
    public Persona (String NombreParametro, String apellido, int edad){
        
        this.nombre = NombreParametro;
        this.apellido = apellido;
        this.edad = edad;
        
    }

    // Metodos o "funciones"
    public String DarNombreCompleto(){
        
        return apellido + " " + nombre;
    }

    
    public String EnviarSaludo (String saludado){
        
        
        if (edad > 40) return "Muy buen dia Señor " + saludado + " ";
        return "hola como estas " + saludado + "!!!";
    }

    /*
     * Se bucsca el metodo get para acceder a la edad privada desde fuera.
     * ES DE TIPO Int porque retorna cosas
     */


    public int getEdad() {

        return edad;

    }

    /*
     * Devuelve nombre en Mayuculas NOMBRE
     */

    public String getNombre() {

        return nombre.toUpperCase();
    }
     
    /*
     * Como este no retorna nada sera void
     * Es para setear
     */

    public void setNombre(String NombreParametro ){

        this.nombre = NombreParametro;

    }

    public void setApellido (String ApellidoParametro){

        this.apellido = ApellidoParametro;

    }

    // 04:19:00


}
