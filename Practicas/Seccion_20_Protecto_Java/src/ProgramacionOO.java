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
        persona1.edad = 40;

        // imprimo
        System.out.println(persona1.apellido + persona1.nombre + " tiene " + persona1.edad);

        Persona persona2 = new Persona();

        persona2.apellido = "Juarez";
        persona2.nombre = "Benito";
        persona2.edad = 35;

        System.out.println(persona2.apellido + persona2.nombre + " tiene " + persona2.edad);
        
        // 03:40:18

    }
}
