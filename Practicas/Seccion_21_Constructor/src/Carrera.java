public class Carrera {


    String nombre;
    int duracion;
    boolean EstaEnCurso;


    /*
    *  Crearemos contructor de carrera
    *  ojo si uso un nombre de consturctot difetente como "CarreraConstructor"
    *    falla el codigo
    */ 

    public Carrera (String nombre, int duracion, boolean EstaEnCurso){
        this.nombre = nombre;
        this. duracion = duracion;
        this.EstaEnCurso = EstaEnCurso;

    }

    /*
     * Podemos hacer otro constructor mas chico con el mismo nombre 
     * esto es porque tengo una sobrecarga de cnstructores,
     * pero con esos dos metodos puedo hacer dos instancias
     * una con un (un elemnto) o otra con (6 elementos), y las dos van a funcionar
    */    
    
    public Carrera(String nombre) {
        this.nombre = nombre;
    }
}
