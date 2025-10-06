import Exceptions.CalculadoraExeption;
import Exceptions.DividirPorCeroException;

public class Calculadora {

    // se agrega como throws la dependencia en lugar de un extendends
    // porque no se puede heredar de muchas clases 

    // tenia error porque el dividendo y divisor estaban al reves

    // esta fue la primera version
    // public int division(int dividendo, int divisor) throws DividirPorCeroException{

    //     if (divisor == 0) throw new DividirPorCeroException();
    //     return dividendo / divisor;

    // }

    // Segunda forma
    public int division(int dividendo, int divisor) throws CalculadoraExeption{

        if (divisor == 0) throw new CalculadoraExeption("No se puede dividir entre cero");
        return dividendo / divisor;

    }


}
