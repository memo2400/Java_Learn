import interfaces.Comunicable;
import interfaces.IAlimentable;

// La interface se agrega con "implements"
// SOLO se puede agregar una clase abstracta
// SI SE PUEDE agregar mas de una interfaces

public class Delfin extends CriaturasMarinas implements Comunicable, IAlimentable {

    // para quitar el eeror le damos en 
    // add unimplmented methods

    public Delfin(String nombre){
        
        super(nombre);
    }

    @Override
    void nadar() {
        System.out.println(nombre + " esta nadando con su cola y saltando");
    }

    @Override
    public void comunicarse() {
        System.out.println(nombre + "Se comunica haciendo silbidos");
    }

    @Override
    public void alimentar() {
        System.out.println("se dara de comer plancton " + nombre);
    }
    
    

}
