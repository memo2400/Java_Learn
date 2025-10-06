public abstract class CriaturasMarinas {

    // al ser clase abstracta no se puede instanciar,
    // pero con el super si lo haremos

    // La clase abstracta es para hacer cosas como
    // persona - profesor - profesor de matematicas
    // osea como una piramide
    // La interfaz sera para cosas genericas, como 
    // empleados como quienes factura sy los que no 

    String nombre;

    // cosntructor, no lleva el VOID ALERTAAAAAAAAAAAAAAAAA
    public CriaturasMarinas(String nombre){
        
        this.nombre = nombre;

    }

    // sobreescribe a las clases que se hereden de CriaturasMarinas
    abstract void nadar();

}
