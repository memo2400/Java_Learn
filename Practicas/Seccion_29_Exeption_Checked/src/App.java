import Exceptions.CalculadoraExeption;
import Exceptions.DividirPorCeroException;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int numero1 = 5;
        int numero2 = 0;
        int resultado;

        Calculadora calculadora = new Calculadora();
        
        try{
            resultado = calculadora.division(numero1, numero2);
            System.out.println("se intento el bloque " + resultado);
        }
        // catch(DividirPorCeroException error){
        //     error.printStackTrace();
        //     System.out.println("eso causo el error");
        // }
        catch(CalculadoraExeption error){
            error.printStackTrace();
            System.out.println("eso causo el error");
        }
        //Este va despues de try o de catch sin importar cual pase
        finally {
            System.out.println("\n Ya se realizo el calculo, del bloque Try Catch");
        }

    }
}
