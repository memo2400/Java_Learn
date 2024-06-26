// Esta es nuectra clase
public class ProgramacionOO {
    
    
    public static void main(String[] args) throws Exception {
        
        // Si es private solo podemos acceder a los nombre apelido una vez cuando se hace instancia.
        Persona persona1 = new Persona("Xi", "Xin Ping", 60);
        
        /*
         * Para aaceder adecuadamente a lo 
         * que esta privado usamos "persona1.getEdad()
         */
        //System.out.println(persona1.apellido + persona1.nombre + " tiene " + persona1.getEdad());


         /*
          * Para escribir nombre nuevamente
          */

        persona1.setApellido("Hansen");  
                
        


        //ahora podemos hacer esto
        System.out.println(persona1.DarNombreCompleto() + " " + persona1.getEdad());
        
        System.out.println(persona1.EnviarSaludo("Luke Skywoker!!"));        
        
        System.out.println("Mayuscula: " + persona1.getNombre());        

    }
}
