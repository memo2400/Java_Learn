public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        double numero1 = 5;
        int numero2 = 0;
        int resultado;

        // Esta es uncheck porque no me sale la advertencia antes de correr
        // System.out.println(numero1 / numero2);

        // lo que este aqui ya no se ejecutaria

        // print (xxxxx)

        //para que si funcione hacemos esto
        // con el (int) castero rapido para evitar el eerror que dectecta
        // el compilador
        try{
            resultado = (int) numero1 / numero2;
            System.out.println("se intento el bloque");
        }catch(Exception error){
            error.printStackTrace();
            System.out.println("eso causo el error");
        }

    }
}
