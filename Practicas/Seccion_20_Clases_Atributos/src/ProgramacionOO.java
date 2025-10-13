// Esta es nuectra clase
public class ProgramacionOO {
    
    // Este es nuestro metodo, de aqui el main nace todo
    // osea otras clases deben ser llamadas desde aqui
    public static void main(String[] args) throws Exception {
        
        // new es para instancias
        Persona persona1 = new Persona();

        // agregamos los datos de la persona
        persona1.nombre = "Pedro";
        persona1.apellido = "Perez";
        persona1.edad = 45;

        // new instancia de la otra clase
        Carrera carrera1 = new Carrera();
        carrera1.nombre = "Ingenieria FHD";
        carrera1.duracion = 6;
        carrera1.EstaEnCurso = false;

        // aqui se usa la clase carrera para meterla en la clase persona
        persona1.carrera = carrera1;


        // imprimo
        System.out.println(persona1.apellido + persona1.nombre + " tiene " + persona1.edad + " Esta recibido de " + persona1.carrera.nombre);

        
        
        
        Persona persona2 = new Persona();

        persona2.apellido = "Juarez";
        persona2.nombre = "Benito";
        persona2.edad = 35;

        
        // new instancia de la otra clase
        Carrera carrera2 = new Carrera();
        carrera2.nombre = "Ingenieria";
        carrera2.duracion = 6;
        carrera2.EstaEnCurso = true;

        persona2.carrera = carrera2;

        System.out.println(persona2.apellido + persona2.nombre + " tiene " + persona2.edad + " Esta recibido de " + persona2.carrera.nombre);
        
        // 03:40:18


        //ahora podemos hacer esto
        System.out.println(persona1.DarNombreCompleto());
        
        System.out.println(persona1.EnviarSaludo("Luke Skywoker!!"));
        System.out.println(persona2.EnviarSaludo("Luke Skywoker!!"));


        // FIN  03:51:57

    }
}
