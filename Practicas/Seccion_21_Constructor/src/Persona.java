
// clas publica, si es private ya no se puede acceder desde fuera
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

     // importo lo de la otra clase
     Carrera carrera;
     
     //String [] tecnologias;
     //boolean EsEstudiante;

    /*
    * Metodo de la clase
    * define el comportamiento
    * 
    */

    // se suele usar el mismo nombre de nuestra clase 
    public Persona (String NombreParametro, String apellido, int edad, String NombreCarrera){

        // aqui genero la instancia para que en el main ya no deba hacer la instancia.
        carrera = new Carrera();

        // this.nombre = es de los atributos  despues del "=" es del constructor de aqui arriba osea el parametro de la funcion- constructor        
        this.nombre = NombreParametro;
        this.apellido = apellido;
        this.edad = edad;

        // aqui gacenmos el accero a la clase carrera que es del otro archivo, como el parametro es distinto no ponemos el this
        carrera.nombre = NombreCarrera;

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
