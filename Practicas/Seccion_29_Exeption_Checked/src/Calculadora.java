import Exceptions.DividirPorCeroException;

public class Calculadora {

    // se agrega como throws la dependencia en lugar de un extendends
    // porque no se puede heredar de muchas clases 
    public int division(int divisor, int dividendo) throws DividirPorCeroException{

        if (divisor == 0) throw new DividirPorCeroException();
        return divisor / dividendo;

    }
}
