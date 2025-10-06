public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Delfin delfin = new Delfin("flipy");

        delfin.nadar();
        delfin.alimentar();
        delfin.comunicarse();

        Pulpo pulpo = new Pulpo("pulpi", 10);

        pulpo.nadar();
        pulpo.alimentar();
        pulpo.comunicarse();

        // FIN

    }
}
