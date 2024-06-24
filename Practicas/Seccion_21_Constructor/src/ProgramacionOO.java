// Esta es nuectra clase
public class ProgramacionOO {
    
    // Este es nuestro metodo, de aqui el main nace todo
    // osea otras clases deben ser llamadas desde aqui
    public static void main(String[] args) throws Exception {
        
        // new es para instancias
        Persona persona1 = new Persona("Xi", "Xin Ping", 60, "Lider Supremo", 20, false);
        // voy a ctrl + , = para usar inlay hints, que nos sive de ayuda
        // 04:01:28 
        System.out.println(persona1.apellido + persona1.nombre + " tiene " + persona1.edad + " Esta recibido de " + persona1.carrera.nombre);

        /* // Coemtop esto al ahora tener el constructor FHD
        persona1.nombre = "Xi";
        persona1.apellido = "Jin Ping";
        persona1.edad = 55;
        */
        //persona1.carrera.nombre ="Lider"; 
        // esto aunq ue no marca error no funcionaria ya que de forma previa debemos crear la instancia de carrera

        // ahora que hicimos instancia dentro de clase persona ya podemos de forma directa
        persona1.carrera.nombre ="segunda carrera"; 
         

        


        /*
        // new instancia de la otra clase
        Carrera carrera1 = new Carrera();
        
        carrera1.nombre = "Ingenieria FHD";
        carrera1.duracion = 6;
        carrera1.EstaEnCurso = false;

        
        // aqui se usa la clase carrera para meterla en la clase persona
        persona1.carrera = carrera1;

        */


        // imprimo
        System.out.println(persona1.apellido + persona1.nombre + " tiene " + persona1.edad + " Esta recibido de " + persona1.carrera.nombre);

                
        


        //ahora podemos hacer esto
        System.out.println(persona1.DarNombreCompleto());
        
        System.out.println(persona1.EnviarSaludo("Luke Skywoker!!"));        

        // 04:05:09 Fin
        

    }
}
