public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Para usarse en caso donde hay muchos if esle, e}pero awui es mas eficiente
         * 
         * 
         */
        String bebida = "cafe";
        switch (bebida) {
            case "cafe":
                //System.err.println("wow cafe");
                System.out.println("wow cafe");
                break; // este indica que salimos Si no lo pongo se ejecuta la sigueinte case
            
            case "agua":
                System.out.println("H2o");
                break;
        
            case "chocolate":
                System.out.println("con pan");
                break;

            default:
                break;
        }

        02:10:38 fin


    }
}
