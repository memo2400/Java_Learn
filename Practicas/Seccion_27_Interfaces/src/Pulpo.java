import interfaces.Comunicable;
import interfaces.IAlimentable;

public class Pulpo extends CriaturasMarinas implements Comunicable, IAlimentable {

    int cantTentaculos;

    public Pulpo(String nombre, int cantTentaculos) {
        // SUPER debe ir arriba
        super(nombre);

        this.cantTentaculos = cantTentaculos;
        
    }

    @Override
    void nadar() {
        System.out.println(nombre + "esta nadando con sus tencalulos y hechando tinta");
    }

    @Override
    public void comunicarse() {
        System.out.println(nombre + "se comunica moviendose y cambiando de color");
    }

    @Override
    public void alimentar() {
        System.out.println("Le dimos de comer caracoles a " + nombre);
    }





}
