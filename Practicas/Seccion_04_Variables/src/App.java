public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        /*
         * Variabole espacio de memoria
         * 
         * declaracion = tipo de varuable y el nombre
         * 
         * definiciion = es casi lo mismo que declaracion , pero da o no un valor
         * 
         * Asignacion = ya le da un valor a variable
         * 
         */
        
        int numero = 5;
        
        int numeros;
        numeros = 10;

        /*
         * Hay variable primitivas y de preferencias
         * 
         * primitiva = almacena valores basiscos
         * 
         * referencia = direcciones memoria que apunta a ibjetos
         * 
         */

         // puede haber enteros : int, byte(poca memoria -128 a 127), short(-32768 al 32767), long
        int numeross = 20;

        // Decimales float (solo 6 decimanles), double (mas usado, 15 o 16 decimales)
        double decimales = 3.14162222;
        float decimaless = 3.14162222222f;  //uso f al final 

        System.out.println(numeross);
        System.out.println(decimaless);

        // string

        char letra = 'a'; //comilla simple
        //char letras = 'hola';  // no funciona asi

        // Boleanos
        boolean v = true;
        boolean f = false;

        //Fin de datos tipo primitivos

        //############ Iniicon de String

        String texto = "este va con comillas dobles";
        System.out.println(texto);

        //01:23:18 fin


    }
}
