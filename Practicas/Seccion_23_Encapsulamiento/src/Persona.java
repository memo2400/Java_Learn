

public class Persona {
  

     /*
      * Atributos
      *       
      */

     String nombre;
     String apellido;
     int edad;
     

    /*
    * Metodo
    * 
    */

    public Persona GammaRay (int dato){

    }

    // 04:11:40

    public Persona (String NombreParametro, String apellido, int edad, String NombreCarrera , int DuracionCarrera, boolean EstaCursando){

        // aqui genero la instancia para que en el main ya no deba hacer la instancia.
        carrera = new Carrera(NombreCarrera, DuracionCarrera, EstaCursando);

        // this.nombre = es de los atributos  despues del "=" es del constructor de aqui arriba osea el parametro de la funcion- constructor        
        
        this.nombre = NombreParametro;
        this.apellido = apellido;
        this.edad = edad;

        /* Lo comente debido a que ya no se usara por ahora asi, el constructor hace todo
        // aqui gacenmos el accero a la clase carrera que es del otro archivo, como el parametro es distinto no ponemos el this
        carrera.nombre = NombreCarrera;
        */ 
    }

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

        
        // aqui abajo ya no pondriamos nada por que el retunr corta

    }

}
