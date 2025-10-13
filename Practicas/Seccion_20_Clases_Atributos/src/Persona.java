
// class publica, si es private ya no se puede acceder desde fuera
// todo lo de adentro por default es publico
public class Persona {
    /*
     * Agrege este archivo dando clic derecho en carpeta src, y despuyes en 
     * agregar new java file
     */

     // atributos, que definiran el estado de un objeto
     // cuando se haga la instanciacion
     // asi de esta forma estan publicos
     String nombre;
     String apellido;
     int edad;

     // importo lo de la otra clase, como parametro
     Carrera carrera;
     
     //String [] tecnologias;
     //boolean EsEstudiante;

     //03:35:46

    /*
    * Metodo de la clase
    * define el comportamiento
    * 
    */
    public String DarNombreCompleto(){

        // se usa para regresar algo, como vemos se hace directo
        return apellido + " " + nombre;
    }


    // Aremos una con parametros
    public String EnviarSaludo (String saludado){
        
        // si es mayor a 40, se corta el reto del metodo, osea solo lelgo hasta el if
        // se usa solo una linea de codigo, sin llaves {}
        if (edad > 40) return "Muy buen dia Señor " + saludado + " ";
        
        return "hola como estas " + saludado + "!!!";

        // aqui abajo ya no pondriamos nada por que el return corta

    }

}
